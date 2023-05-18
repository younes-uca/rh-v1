import {Component, OnInit} from '@angular/core';
import {SocieteService} from 'src/app/controller/service/Societe.service';
import {SocieteDto} from 'src/app/controller/model/Societe.model';
import {SocieteCriteria} from 'src/app/controller/criteria/SocieteCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-societe-list-admin',
  templateUrl: './societe-list-admin.component.html'
})
export class SocieteListAdminComponent extends AbstractListController<SocieteDto, SocieteCriteria, SocieteService>  implements OnInit {

    fileName = 'Societe';

  
    constructor(societeService: SocieteService) {
        super(societeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadSocietes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Societe', 'list');
        isPermistted ? this.service.findAll().subscribe(societes => this.items = societes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: SocieteDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
        }];
      }
}

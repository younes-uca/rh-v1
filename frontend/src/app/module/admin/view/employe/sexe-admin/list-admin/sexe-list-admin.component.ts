import {Component, OnInit} from '@angular/core';
import {SexeService} from 'src/app/controller/service/Sexe.service';
import {SexeDto} from 'src/app/controller/model/Sexe.model';
import {SexeCriteria} from 'src/app/controller/criteria/SexeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-sexe-list-admin',
  templateUrl: './sexe-list-admin.component.html'
})
export class SexeListAdminComponent extends AbstractListController<SexeDto, SexeCriteria, SexeService>  implements OnInit {

    fileName = 'Sexe';

  
    constructor(sexeService: SexeService) {
        super(sexeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadSexes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Sexe', 'list');
        isPermistted ? this.service.findAll().subscribe(sexes => this.items = sexes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: SexeDto) {
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

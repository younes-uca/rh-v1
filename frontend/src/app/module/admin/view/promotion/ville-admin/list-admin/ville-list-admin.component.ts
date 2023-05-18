import {Component, OnInit} from '@angular/core';
import {VilleService} from 'src/app/controller/service/Ville.service';
import {VilleDto} from 'src/app/controller/model/Ville.model';
import {VilleCriteria} from 'src/app/controller/criteria/VilleCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-ville-list-admin',
  templateUrl: './ville-list-admin.component.html'
})
export class VilleListAdminComponent extends AbstractListController<VilleDto, VilleCriteria, VilleService>  implements OnInit {

    fileName = 'Ville';

  
    constructor(villeService: VilleService) {
        super(villeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadVilles(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Ville', 'list');
        isPermistted ? this.service.findAll().subscribe(villes => this.items = villes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: VilleDto) {
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

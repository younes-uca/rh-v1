import {Component, OnInit} from '@angular/core';
import {SiegeService} from 'src/app/controller/service/Siege.service';
import {SiegeDto} from 'src/app/controller/model/Siege.model';
import {SiegeCriteria} from 'src/app/controller/criteria/SiegeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-siege-list-admin',
  templateUrl: './siege-list-admin.component.html'
})
export class SiegeListAdminComponent extends AbstractListController<SiegeDto, SiegeCriteria, SiegeService>  implements OnInit {

    fileName = 'Siege';

  
    constructor(siegeService: SiegeService) {
        super(siegeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadSieges(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Siege', 'list');
        isPermistted ? this.service.findAll().subscribe(sieges => this.items = sieges,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: SiegeDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
                 'Adresse': e.adresse ,
                 'Description': e.description ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Adresse': this.criteria.adresse ? this.criteria.adresse : environment.emptyForExport ,
            'Description': this.criteria.description ? this.criteria.description : environment.emptyForExport ,
        }];
      }
}

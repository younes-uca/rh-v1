import {Component, OnInit} from '@angular/core';
import {EtatDemandeCongeService} from 'src/app/controller/service/EtatDemandeConge.service';
import {EtatDemandeCongeDto} from 'src/app/controller/model/EtatDemandeConge.model';
import {EtatDemandeCongeCriteria} from 'src/app/controller/criteria/EtatDemandeCongeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-etat-demande-conge-list-admin',
  templateUrl: './etat-demande-conge-list-admin.component.html'
})
export class EtatDemandeCongeListAdminComponent extends AbstractListController<EtatDemandeCongeDto, EtatDemandeCongeCriteria, EtatDemandeCongeService>  implements OnInit {

    fileName = 'EtatDemandeConge';

  
    constructor(etatDemandeCongeService: EtatDemandeCongeService) {
        super(etatDemandeCongeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadEtatDemandeConges(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('EtatDemandeConge', 'list');
        isPermistted ? this.service.findAll().subscribe(etatDemandeConges => this.items = etatDemandeConges,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: EtatDemandeCongeDto) {
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

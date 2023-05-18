import {Component, OnInit} from '@angular/core';
import {EtatReclamationService} from 'src/app/controller/service/EtatReclamation.service';
import {EtatReclamationDto} from 'src/app/controller/model/EtatReclamation.model';
import {EtatReclamationCriteria} from 'src/app/controller/criteria/EtatReclamationCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-etat-reclamation-list-admin',
  templateUrl: './etat-reclamation-list-admin.component.html'
})
export class EtatReclamationListAdminComponent extends AbstractListController<EtatReclamationDto, EtatReclamationCriteria, EtatReclamationService>  implements OnInit {

    fileName = 'EtatReclamation';

  
    constructor(etatReclamationService: EtatReclamationService) {
        super(etatReclamationService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadEtatReclamations(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('EtatReclamation', 'list');
        isPermistted ? this.service.findAll().subscribe(etatReclamations => this.items = etatReclamations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: EtatReclamationDto) {
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

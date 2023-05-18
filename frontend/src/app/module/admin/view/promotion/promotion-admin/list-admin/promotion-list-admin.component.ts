import {Component, OnInit} from '@angular/core';
import {PromotionService} from 'src/app/controller/service/Promotion.service';
import {PromotionDto} from 'src/app/controller/model/Promotion.model';
import {PromotionCriteria} from 'src/app/controller/criteria/PromotionCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-promotion-list-admin',
  templateUrl: './promotion-list-admin.component.html'
})
export class PromotionListAdminComponent extends AbstractListController<PromotionDto, PromotionCriteria, PromotionService>  implements OnInit {

    fileName = 'Promotion';

  
    constructor(promotionService: PromotionService) {
        super(promotionService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadPromotions(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Promotion', 'list');
        isPermistted ? this.service.findAll().subscribe(promotions => this.items = promotions,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
            {field: 'dateDebutProfession', header: 'Date debut profession'},
            {field: 'dateDebutContrat', header: 'Date debut contrat'},
        ];
    }



	public initDuplicate(res: PromotionDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
                'Date debut profession': this.datePipe.transform(e.dateDebutProfession , 'dd/MM/yyyy hh:mm'),
                'Date debut contrat': this.datePipe.transform(e.dateDebutContrat , 'dd/MM/yyyy hh:mm'),
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Date debut profession Min': this.criteria.dateDebutProfessionFrom ? this.datePipe.transform(this.criteria.dateDebutProfessionFrom , this.dateFormat) : environment.emptyForExport ,
            'Date debut profession Max': this.criteria.dateDebutProfessionTo ? this.datePipe.transform(this.criteria.dateDebutProfessionTo , this.dateFormat) : environment.emptyForExport ,
            'Date debut contrat Min': this.criteria.dateDebutContratFrom ? this.datePipe.transform(this.criteria.dateDebutContratFrom , this.dateFormat) : environment.emptyForExport ,
            'Date debut contrat Max': this.criteria.dateDebutContratTo ? this.datePipe.transform(this.criteria.dateDebutContratTo , this.dateFormat) : environment.emptyForExport ,
        }];
      }
}

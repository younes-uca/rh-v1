import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {PromotionService} from 'src/app/controller/service/Promotion.service';
import {PromotionDto} from 'src/app/controller/model/Promotion.model';
import {PromotionCriteria} from 'src/app/controller/criteria/PromotionCriteria.model';



@Component({
  selector: 'app-promotion-edit-admin',
  templateUrl: './promotion-edit-admin.component.html'
})
export class PromotionEditAdminComponent extends AbstractEditController<PromotionDto, PromotionCriteria, PromotionService>   implements OnInit {


    private _validPromotionCode = true;
    private _validPromotionLibelle = true;




    constructor( private promotionService: PromotionService ) {
        super(promotionService);
    }

    ngOnInit(): void {
}
    public prepareEdit() {
        this.item.dateDebutProfession = this.promotionService.format(this.item.dateDebutProfession);
        this.item.dateDebutContrat = this.promotionService.format(this.item.dateDebutContrat);
    }



    public setValidation(value : boolean){
        this.validPromotionCode = value;
        this.validPromotionLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePromotionCode();
        this.validatePromotionLibelle();
    }
    public validatePromotionCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validPromotionCode = false;
        } else {
            this.validPromotionCode = true;
        }
    }
    public validatePromotionLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validPromotionLibelle = false;
        } else {
            this.validPromotionLibelle = true;
        }
    }






    get validPromotionCode(): boolean {
        return this._validPromotionCode;
    }
    set validPromotionCode(value: boolean) {
        this._validPromotionCode = value;
    }
    get validPromotionLibelle(): boolean {
        return this._validPromotionLibelle;
    }
    set validPromotionLibelle(value: boolean) {
        this._validPromotionLibelle = value;
    }

}

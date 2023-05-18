import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {LienParenteService} from 'src/app/controller/service/LienParente.service';
import {LienParenteDto} from 'src/app/controller/model/LienParente.model';
import {LienParenteCriteria} from 'src/app/controller/criteria/LienParenteCriteria.model';
@Component({
  selector: 'app-lien-parente-create-admin',
  templateUrl: './lien-parente-create-admin.component.html'
})
export class LienParenteCreateAdminComponent extends AbstractCreateController<LienParenteDto, LienParenteCriteria, LienParenteService>  implements OnInit {



   private _validLienParenteCode = true;
   private _validLienParenteLibelle = true;

    constructor( private lienParenteService: LienParenteService ) {
        super(lienParenteService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validLienParenteCode = value;
        this.validLienParenteLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateLienParenteCode();
        this.validateLienParenteLibelle();
    }

    public validateLienParenteCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validLienParenteCode = false;
        } else {
            this.validLienParenteCode = true;
        }
    }
    public validateLienParenteLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validLienParenteLibelle = false;
        } else {
            this.validLienParenteLibelle = true;
        }
    }






    get validLienParenteCode(): boolean {
        return this._validLienParenteCode;
    }

    set validLienParenteCode(value: boolean) {
         this._validLienParenteCode = value;
    }
    get validLienParenteLibelle(): boolean {
        return this._validLienParenteLibelle;
    }

    set validLienParenteLibelle(value: boolean) {
         this._validLienParenteLibelle = value;
    }



}

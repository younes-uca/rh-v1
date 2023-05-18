import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {SocieteService} from 'src/app/controller/service/Societe.service';
import {SocieteDto} from 'src/app/controller/model/Societe.model';
import {SocieteCriteria} from 'src/app/controller/criteria/SocieteCriteria.model';
@Component({
  selector: 'app-societe-create-admin',
  templateUrl: './societe-create-admin.component.html'
})
export class SocieteCreateAdminComponent extends AbstractCreateController<SocieteDto, SocieteCriteria, SocieteService>  implements OnInit {



   private _validSocieteCode = true;
   private _validSocieteLibelle = true;

    constructor( private societeService: SocieteService ) {
        super(societeService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validSocieteCode = value;
        this.validSocieteLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSocieteCode();
        this.validateSocieteLibelle();
    }

    public validateSocieteCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validSocieteCode = false;
        } else {
            this.validSocieteCode = true;
        }
    }
    public validateSocieteLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validSocieteLibelle = false;
        } else {
            this.validSocieteLibelle = true;
        }
    }






    get validSocieteCode(): boolean {
        return this._validSocieteCode;
    }

    set validSocieteCode(value: boolean) {
         this._validSocieteCode = value;
    }
    get validSocieteLibelle(): boolean {
        return this._validSocieteLibelle;
    }

    set validSocieteLibelle(value: boolean) {
         this._validSocieteLibelle = value;
    }



}

import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {SocieteService} from 'src/app/controller/service/Societe.service';
import {SocieteDto} from 'src/app/controller/model/Societe.model';
import {SocieteCriteria} from 'src/app/controller/criteria/SocieteCriteria.model';



@Component({
  selector: 'app-societe-edit-admin',
  templateUrl: './societe-edit-admin.component.html'
})
export class SocieteEditAdminComponent extends AbstractEditController<SocieteDto, SocieteCriteria, SocieteService>   implements OnInit {


    private _validSocieteCode = true;
    private _validSocieteLibelle = true;




    constructor( private societeService: SocieteService ) {
        super(societeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
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

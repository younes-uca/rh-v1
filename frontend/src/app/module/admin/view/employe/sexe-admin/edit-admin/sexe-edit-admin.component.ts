import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {SexeService} from 'src/app/controller/service/Sexe.service';
import {SexeDto} from 'src/app/controller/model/Sexe.model';
import {SexeCriteria} from 'src/app/controller/criteria/SexeCriteria.model';



@Component({
  selector: 'app-sexe-edit-admin',
  templateUrl: './sexe-edit-admin.component.html'
})
export class SexeEditAdminComponent extends AbstractEditController<SexeDto, SexeCriteria, SexeService>   implements OnInit {


    private _validSexeCode = true;
    private _validSexeLibelle = true;




    constructor( private sexeService: SexeService ) {
        super(sexeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validSexeCode = value;
        this.validSexeLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSexeCode();
        this.validateSexeLibelle();
    }
    public validateSexeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validSexeCode = false;
        } else {
            this.validSexeCode = true;
        }
    }
    public validateSexeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validSexeLibelle = false;
        } else {
            this.validSexeLibelle = true;
        }
    }






    get validSexeCode(): boolean {
        return this._validSexeCode;
    }
    set validSexeCode(value: boolean) {
        this._validSexeCode = value;
    }
    get validSexeLibelle(): boolean {
        return this._validSexeLibelle;
    }
    set validSexeLibelle(value: boolean) {
        this._validSexeLibelle = value;
    }

}

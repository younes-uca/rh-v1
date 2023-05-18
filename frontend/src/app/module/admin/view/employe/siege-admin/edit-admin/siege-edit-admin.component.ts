import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {SiegeService} from 'src/app/controller/service/Siege.service';
import {SiegeDto} from 'src/app/controller/model/Siege.model';
import {SiegeCriteria} from 'src/app/controller/criteria/SiegeCriteria.model';



@Component({
  selector: 'app-siege-edit-admin',
  templateUrl: './siege-edit-admin.component.html'
})
export class SiegeEditAdminComponent extends AbstractEditController<SiegeDto, SiegeCriteria, SiegeService>   implements OnInit {


    private _validSiegeCode = true;
    private _validSiegeLibelle = true;




    constructor( private siegeService: SiegeService ) {
        super(siegeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validSiegeCode = value;
        this.validSiegeLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSiegeCode();
        this.validateSiegeLibelle();
    }
    public validateSiegeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validSiegeCode = false;
        } else {
            this.validSiegeCode = true;
        }
    }
    public validateSiegeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validSiegeLibelle = false;
        } else {
            this.validSiegeLibelle = true;
        }
    }






    get validSiegeCode(): boolean {
        return this._validSiegeCode;
    }
    set validSiegeCode(value: boolean) {
        this._validSiegeCode = value;
    }
    get validSiegeLibelle(): boolean {
        return this._validSiegeLibelle;
    }
    set validSiegeLibelle(value: boolean) {
        this._validSiegeLibelle = value;
    }

}

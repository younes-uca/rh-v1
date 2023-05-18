import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {VilleService} from 'src/app/controller/service/Ville.service';
import {VilleDto} from 'src/app/controller/model/Ville.model';
import {VilleCriteria} from 'src/app/controller/criteria/VilleCriteria.model';



@Component({
  selector: 'app-ville-edit-admin',
  templateUrl: './ville-edit-admin.component.html'
})
export class VilleEditAdminComponent extends AbstractEditController<VilleDto, VilleCriteria, VilleService>   implements OnInit {


    private _validVilleCode = true;
    private _validVilleLibelle = true;




    constructor( private villeService: VilleService ) {
        super(villeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validVilleCode = value;
        this.validVilleLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateVilleCode();
        this.validateVilleLibelle();
    }
    public validateVilleCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validVilleCode = false;
        } else {
            this.validVilleCode = true;
        }
    }
    public validateVilleLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validVilleLibelle = false;
        } else {
            this.validVilleLibelle = true;
        }
    }






    get validVilleCode(): boolean {
        return this._validVilleCode;
    }
    set validVilleCode(value: boolean) {
        this._validVilleCode = value;
    }
    get validVilleLibelle(): boolean {
        return this._validVilleLibelle;
    }
    set validVilleLibelle(value: boolean) {
        this._validVilleLibelle = value;
    }

}

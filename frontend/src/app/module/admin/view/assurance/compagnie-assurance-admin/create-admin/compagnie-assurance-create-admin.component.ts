import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {CompagnieAssuranceService} from 'src/app/controller/service/CompagnieAssurance.service';
import {CompagnieAssuranceDto} from 'src/app/controller/model/CompagnieAssurance.model';
import {CompagnieAssuranceCriteria} from 'src/app/controller/criteria/CompagnieAssuranceCriteria.model';
@Component({
  selector: 'app-compagnie-assurance-create-admin',
  templateUrl: './compagnie-assurance-create-admin.component.html'
})
export class CompagnieAssuranceCreateAdminComponent extends AbstractCreateController<CompagnieAssuranceDto, CompagnieAssuranceCriteria, CompagnieAssuranceService>  implements OnInit {



   private _validCompagnieAssuranceCode = true;
   private _validCompagnieAssuranceLibelle = true;

    constructor( private compagnieAssuranceService: CompagnieAssuranceService ) {
        super(compagnieAssuranceService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validCompagnieAssuranceCode = value;
        this.validCompagnieAssuranceLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateCompagnieAssuranceCode();
        this.validateCompagnieAssuranceLibelle();
    }

    public validateCompagnieAssuranceCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validCompagnieAssuranceCode = false;
        } else {
            this.validCompagnieAssuranceCode = true;
        }
    }
    public validateCompagnieAssuranceLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validCompagnieAssuranceLibelle = false;
        } else {
            this.validCompagnieAssuranceLibelle = true;
        }
    }






    get validCompagnieAssuranceCode(): boolean {
        return this._validCompagnieAssuranceCode;
    }

    set validCompagnieAssuranceCode(value: boolean) {
         this._validCompagnieAssuranceCode = value;
    }
    get validCompagnieAssuranceLibelle(): boolean {
        return this._validCompagnieAssuranceLibelle;
    }

    set validCompagnieAssuranceLibelle(value: boolean) {
         this._validCompagnieAssuranceLibelle = value;
    }



}

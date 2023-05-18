import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {EducationService} from 'src/app/controller/service/Education.service';
import {EducationDto} from 'src/app/controller/model/Education.model';
import {EducationCriteria} from 'src/app/controller/criteria/EducationCriteria.model';
@Component({
  selector: 'app-education-create-admin',
  templateUrl: './education-create-admin.component.html'
})
export class EducationCreateAdminComponent extends AbstractCreateController<EducationDto, EducationCriteria, EducationService>  implements OnInit {



   private _validEducationCode = true;
   private _validEducationLibelle = true;

    constructor( private educationService: EducationService ) {
        super(educationService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validEducationCode = value;
        this.validEducationLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateEducationCode();
        this.validateEducationLibelle();
    }

    public validateEducationCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validEducationCode = false;
        } else {
            this.validEducationCode = true;
        }
    }
    public validateEducationLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validEducationLibelle = false;
        } else {
            this.validEducationLibelle = true;
        }
    }






    get validEducationCode(): boolean {
        return this._validEducationCode;
    }

    set validEducationCode(value: boolean) {
         this._validEducationCode = value;
    }
    get validEducationLibelle(): boolean {
        return this._validEducationLibelle;
    }

    set validEducationLibelle(value: boolean) {
         this._validEducationLibelle = value;
    }



}

import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {CategorieEmployeService} from 'src/app/controller/service/CategorieEmploye.service';
import {CategorieEmployeDto} from 'src/app/controller/model/CategorieEmploye.model';
import {CategorieEmployeCriteria} from 'src/app/controller/criteria/CategorieEmployeCriteria.model';
@Component({
  selector: 'app-categorie-employe-create-admin',
  templateUrl: './categorie-employe-create-admin.component.html'
})
export class CategorieEmployeCreateAdminComponent extends AbstractCreateController<CategorieEmployeDto, CategorieEmployeCriteria, CategorieEmployeService>  implements OnInit {



   private _validCategorieEmployeCode = true;
   private _validCategorieEmployeLibelle = true;

    constructor( private categorieEmployeService: CategorieEmployeService ) {
        super(categorieEmployeService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validCategorieEmployeCode = value;
        this.validCategorieEmployeLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateCategorieEmployeCode();
        this.validateCategorieEmployeLibelle();
    }

    public validateCategorieEmployeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validCategorieEmployeCode = false;
        } else {
            this.validCategorieEmployeCode = true;
        }
    }
    public validateCategorieEmployeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validCategorieEmployeLibelle = false;
        } else {
            this.validCategorieEmployeLibelle = true;
        }
    }






    get validCategorieEmployeCode(): boolean {
        return this._validCategorieEmployeCode;
    }

    set validCategorieEmployeCode(value: boolean) {
         this._validCategorieEmployeCode = value;
    }
    get validCategorieEmployeLibelle(): boolean {
        return this._validCategorieEmployeLibelle;
    }

    set validCategorieEmployeLibelle(value: boolean) {
         this._validCategorieEmployeLibelle = value;
    }



}

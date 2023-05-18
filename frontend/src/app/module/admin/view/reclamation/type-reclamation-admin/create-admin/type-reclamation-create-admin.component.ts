import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {TypeReclamationService} from 'src/app/controller/service/TypeReclamation.service';
import {TypeReclamationDto} from 'src/app/controller/model/TypeReclamation.model';
import {TypeReclamationCriteria} from 'src/app/controller/criteria/TypeReclamationCriteria.model';
@Component({
  selector: 'app-type-reclamation-create-admin',
  templateUrl: './type-reclamation-create-admin.component.html'
})
export class TypeReclamationCreateAdminComponent extends AbstractCreateController<TypeReclamationDto, TypeReclamationCriteria, TypeReclamationService>  implements OnInit {



   private _validTypeReclamationCode = true;
   private _validTypeReclamationLibelle = true;

    constructor( private typeReclamationService: TypeReclamationService ) {
        super(typeReclamationService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validTypeReclamationCode = value;
        this.validTypeReclamationLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateTypeReclamationCode();
        this.validateTypeReclamationLibelle();
    }

    public validateTypeReclamationCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validTypeReclamationCode = false;
        } else {
            this.validTypeReclamationCode = true;
        }
    }
    public validateTypeReclamationLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validTypeReclamationLibelle = false;
        } else {
            this.validTypeReclamationLibelle = true;
        }
    }






    get validTypeReclamationCode(): boolean {
        return this._validTypeReclamationCode;
    }

    set validTypeReclamationCode(value: boolean) {
         this._validTypeReclamationCode = value;
    }
    get validTypeReclamationLibelle(): boolean {
        return this._validTypeReclamationLibelle;
    }

    set validTypeReclamationLibelle(value: boolean) {
         this._validTypeReclamationLibelle = value;
    }



}

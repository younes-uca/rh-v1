import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {TypeDemandeCongeService} from 'src/app/controller/service/TypeDemandeConge.service';
import {TypeDemandeCongeDto} from 'src/app/controller/model/TypeDemandeConge.model';
import {TypeDemandeCongeCriteria} from 'src/app/controller/criteria/TypeDemandeCongeCriteria.model';



@Component({
  selector: 'app-type-demande-conge-edit-admin',
  templateUrl: './type-demande-conge-edit-admin.component.html'
})
export class TypeDemandeCongeEditAdminComponent extends AbstractEditController<TypeDemandeCongeDto, TypeDemandeCongeCriteria, TypeDemandeCongeService>   implements OnInit {


    private _validTypeDemandeCongeCode = true;
    private _validTypeDemandeCongeLibelle = true;




    constructor( private typeDemandeCongeService: TypeDemandeCongeService ) {
        super(typeDemandeCongeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validTypeDemandeCongeCode = value;
        this.validTypeDemandeCongeLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateTypeDemandeCongeCode();
        this.validateTypeDemandeCongeLibelle();
    }
    public validateTypeDemandeCongeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validTypeDemandeCongeCode = false;
        } else {
            this.validTypeDemandeCongeCode = true;
        }
    }
    public validateTypeDemandeCongeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validTypeDemandeCongeLibelle = false;
        } else {
            this.validTypeDemandeCongeLibelle = true;
        }
    }






    get validTypeDemandeCongeCode(): boolean {
        return this._validTypeDemandeCongeCode;
    }
    set validTypeDemandeCongeCode(value: boolean) {
        this._validTypeDemandeCongeCode = value;
    }
    get validTypeDemandeCongeLibelle(): boolean {
        return this._validTypeDemandeCongeLibelle;
    }
    set validTypeDemandeCongeLibelle(value: boolean) {
        this._validTypeDemandeCongeLibelle = value;
    }

}

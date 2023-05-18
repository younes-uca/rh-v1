import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {EtatReclamationService} from 'src/app/controller/service/EtatReclamation.service';
import {EtatReclamationDto} from 'src/app/controller/model/EtatReclamation.model';
import {EtatReclamationCriteria} from 'src/app/controller/criteria/EtatReclamationCriteria.model';
@Component({
  selector: 'app-etat-reclamation-create-admin',
  templateUrl: './etat-reclamation-create-admin.component.html'
})
export class EtatReclamationCreateAdminComponent extends AbstractCreateController<EtatReclamationDto, EtatReclamationCriteria, EtatReclamationService>  implements OnInit {



   private _validEtatReclamationCode = true;
   private _validEtatReclamationLibelle = true;

    constructor( private etatReclamationService: EtatReclamationService ) {
        super(etatReclamationService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validEtatReclamationCode = value;
        this.validEtatReclamationLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateEtatReclamationCode();
        this.validateEtatReclamationLibelle();
    }

    public validateEtatReclamationCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validEtatReclamationCode = false;
        } else {
            this.validEtatReclamationCode = true;
        }
    }
    public validateEtatReclamationLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validEtatReclamationLibelle = false;
        } else {
            this.validEtatReclamationLibelle = true;
        }
    }






    get validEtatReclamationCode(): boolean {
        return this._validEtatReclamationCode;
    }

    set validEtatReclamationCode(value: boolean) {
         this._validEtatReclamationCode = value;
    }
    get validEtatReclamationLibelle(): boolean {
        return this._validEtatReclamationLibelle;
    }

    set validEtatReclamationLibelle(value: boolean) {
         this._validEtatReclamationLibelle = value;
    }



}

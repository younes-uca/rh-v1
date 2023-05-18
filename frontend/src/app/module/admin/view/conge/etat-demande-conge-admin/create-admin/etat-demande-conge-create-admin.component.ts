import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {EtatDemandeCongeService} from 'src/app/controller/service/EtatDemandeConge.service';
import {EtatDemandeCongeDto} from 'src/app/controller/model/EtatDemandeConge.model';
import {EtatDemandeCongeCriteria} from 'src/app/controller/criteria/EtatDemandeCongeCriteria.model';
@Component({
  selector: 'app-etat-demande-conge-create-admin',
  templateUrl: './etat-demande-conge-create-admin.component.html'
})
export class EtatDemandeCongeCreateAdminComponent extends AbstractCreateController<EtatDemandeCongeDto, EtatDemandeCongeCriteria, EtatDemandeCongeService>  implements OnInit {



   private _validEtatDemandeCongeCode = true;
   private _validEtatDemandeCongeLibelle = true;

    constructor( private etatDemandeCongeService: EtatDemandeCongeService ) {
        super(etatDemandeCongeService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validEtatDemandeCongeCode = value;
        this.validEtatDemandeCongeLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateEtatDemandeCongeCode();
        this.validateEtatDemandeCongeLibelle();
    }

    public validateEtatDemandeCongeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validEtatDemandeCongeCode = false;
        } else {
            this.validEtatDemandeCongeCode = true;
        }
    }
    public validateEtatDemandeCongeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validEtatDemandeCongeLibelle = false;
        } else {
            this.validEtatDemandeCongeLibelle = true;
        }
    }






    get validEtatDemandeCongeCode(): boolean {
        return this._validEtatDemandeCongeCode;
    }

    set validEtatDemandeCongeCode(value: boolean) {
         this._validEtatDemandeCongeCode = value;
    }
    get validEtatDemandeCongeLibelle(): boolean {
        return this._validEtatDemandeCongeLibelle;
    }

    set validEtatDemandeCongeLibelle(value: boolean) {
         this._validEtatDemandeCongeLibelle = value;
    }



}

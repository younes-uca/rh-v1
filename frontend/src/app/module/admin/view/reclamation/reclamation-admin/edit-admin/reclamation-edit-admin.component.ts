import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {ReclamationService} from 'src/app/controller/service/Reclamation.service';
import {ReclamationDto} from 'src/app/controller/model/Reclamation.model';
import {ReclamationCriteria} from 'src/app/controller/criteria/ReclamationCriteria.model';


import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeService} from 'src/app/controller/service/Employe.service';
import {TypeReclamationDto} from 'src/app/controller/model/TypeReclamation.model';
import {TypeReclamationService} from 'src/app/controller/service/TypeReclamation.service';
import {EtatReclamationDto} from 'src/app/controller/model/EtatReclamation.model';
import {EtatReclamationService} from 'src/app/controller/service/EtatReclamation.service';

@Component({
  selector: 'app-reclamation-edit-admin',
  templateUrl: './reclamation-edit-admin.component.html'
})
export class ReclamationEditAdminComponent extends AbstractEditController<ReclamationDto, ReclamationCriteria, ReclamationService>   implements OnInit {


    private _validReclamationReference = true;

    private _validTypeReclamationCode = true;
    private _validTypeReclamationLibelle = true;
    private _validEtatReclamationCode = true;
    private _validEtatReclamationLibelle = true;



    constructor( private reclamationService: ReclamationService , private employeService: EmployeService, private typeReclamationService: TypeReclamationService, private etatReclamationService: EtatReclamationService) {
        super(reclamationService);
    }

    ngOnInit(): void {
    this.typeReclamation = new TypeReclamationDto();
    this.typeReclamationService.findAll().subscribe((data) => this.typeReclamations = data);
    this.etatReclamation = new EtatReclamationDto();
    this.etatReclamationService.findAll().subscribe((data) => this.etatReclamations = data);
    this.employe = new EmployeDto();
    this.employeService.findAll().subscribe((data) => this.employes = data);
}
    public prepareEdit() {
        this.item.dateReclamation = this.reclamationService.format(this.item.dateReclamation);
        this.item.dateTraitement = this.reclamationService.format(this.item.dateTraitement);
        this.item.dateReponse = this.reclamationService.format(this.item.dateReponse);
    }



    public setValidation(value : boolean){
        this.validReclamationReference = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateReclamationReference();
    }
    public validateReclamationReference(){
        if (this.stringUtilService.isEmpty(this.item.reference)) {
            this.errorMessages.push('Reference non valide');
            this.validReclamationReference = false;
        } else {
            this.validReclamationReference = true;
        }
    }



   public async openCreateTypeReclamation(typeReclamation: string) {
        const isPermistted = await this.roleService.isPermitted('TypeReclamation', 'edit');
        if(isPermistted) {
             this.typeReclamation = new TypeReclamationDto();
             this.createTypeReclamationDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateEtatReclamation(etatReclamation: string) {
        const isPermistted = await this.roleService.isPermitted('EtatReclamation', 'edit');
        if(isPermistted) {
             this.etatReclamation = new EtatReclamationDto();
             this.createEtatReclamationDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get typeReclamation(): TypeReclamationDto {
       return this.typeReclamationService.item;
   }
  set typeReclamation(value: TypeReclamationDto) {
        this.typeReclamationService.item = value;
   }
   get typeReclamations(): Array<TypeReclamationDto> {
        return this.typeReclamationService.items;
   }
   set typeReclamations(value: Array<TypeReclamationDto>) {
        this.typeReclamationService.items = value;
   }
   get createTypeReclamationDialog(): boolean {
       return this.typeReclamationService.createDialog;
   }
  set createTypeReclamationDialog(value: boolean) {
       this.typeReclamationService.createDialog= value;
   }
   get etatReclamation(): EtatReclamationDto {
       return this.etatReclamationService.item;
   }
  set etatReclamation(value: EtatReclamationDto) {
        this.etatReclamationService.item = value;
   }
   get etatReclamations(): Array<EtatReclamationDto> {
        return this.etatReclamationService.items;
   }
   set etatReclamations(value: Array<EtatReclamationDto>) {
        this.etatReclamationService.items = value;
   }
   get createEtatReclamationDialog(): boolean {
       return this.etatReclamationService.createDialog;
   }
  set createEtatReclamationDialog(value: boolean) {
       this.etatReclamationService.createDialog= value;
   }
   get employe(): EmployeDto {
       return this.employeService.item;
   }
  set employe(value: EmployeDto) {
        this.employeService.item = value;
   }
   get employes(): Array<EmployeDto> {
        return this.employeService.items;
   }
   set employes(value: Array<EmployeDto>) {
        this.employeService.items = value;
   }
   get createEmployeDialog(): boolean {
       return this.employeService.createDialog;
   }
  set createEmployeDialog(value: boolean) {
       this.employeService.createDialog= value;
   }


    get validReclamationReference(): boolean {
        return this._validReclamationReference;
    }
    set validReclamationReference(value: boolean) {
        this._validReclamationReference = value;
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

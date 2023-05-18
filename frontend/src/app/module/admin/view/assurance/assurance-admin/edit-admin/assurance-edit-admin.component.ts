import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {AssuranceService} from 'src/app/controller/service/Assurance.service';
import {AssuranceDto} from 'src/app/controller/model/Assurance.model';
import {AssuranceCriteria} from 'src/app/controller/criteria/AssuranceCriteria.model';


import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeService} from 'src/app/controller/service/Employe.service';
import {SocieteDto} from 'src/app/controller/model/Societe.model';
import {SocieteService} from 'src/app/controller/service/Societe.service';
import {CompagnieAssuranceDto} from 'src/app/controller/model/CompagnieAssurance.model';
import {CompagnieAssuranceService} from 'src/app/controller/service/CompagnieAssurance.service';
import {LienParenteDto} from 'src/app/controller/model/LienParente.model';
import {LienParenteService} from 'src/app/controller/service/LienParente.service';

@Component({
  selector: 'app-assurance-edit-admin',
  templateUrl: './assurance-edit-admin.component.html'
})
export class AssuranceEditAdminComponent extends AbstractEditController<AssuranceDto, AssuranceCriteria, AssuranceService>   implements OnInit {



    private _validSocieteCode = true;
    private _validSocieteLibelle = true;
    private _validCompagnieAssuranceCode = true;
    private _validCompagnieAssuranceLibelle = true;
    private _validLienParenteCode = true;
    private _validLienParenteLibelle = true;



    constructor( private assuranceService: AssuranceService , private employeService: EmployeService, private societeService: SocieteService, private compagnieAssuranceService: CompagnieAssuranceService, private lienParenteService: LienParenteService) {
        super(assuranceService);
    }

    ngOnInit(): void {
    this.societe = new SocieteDto();
    this.societeService.findAll().subscribe((data) => this.societes = data);
    this.compagnieAssurance = new CompagnieAssuranceDto();
    this.compagnieAssuranceService.findAll().subscribe((data) => this.compagnieAssurances = data);
    this.employe = new EmployeDto();
    this.employeService.findAll().subscribe((data) => this.employes = data);
    this.lienParente = new LienParenteDto();
    this.lienParenteService.findAll().subscribe((data) => this.lienParentes = data);
}
    public prepareEdit() {
        this.item.dateConsultation = this.assuranceService.format(this.item.dateConsultation);
        this.item.dateTransmission = this.assuranceService.format(this.item.dateTransmission);
        this.item.dateEnvoi = this.assuranceService.format(this.item.dateEnvoi);
    }



    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



   public async openCreateSociete(societe: string) {
        const isPermistted = await this.roleService.isPermitted('Societe', 'edit');
        if(isPermistted) {
             this.societe = new SocieteDto();
             this.createSocieteDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateLienParente(lienParente: string) {
        const isPermistted = await this.roleService.isPermitted('LienParente', 'edit');
        if(isPermistted) {
             this.lienParente = new LienParenteDto();
             this.createLienParenteDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateCompagnieAssurance(compagnieAssurance: string) {
        const isPermistted = await this.roleService.isPermitted('CompagnieAssurance', 'edit');
        if(isPermistted) {
             this.compagnieAssurance = new CompagnieAssuranceDto();
             this.createCompagnieAssuranceDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get societe(): SocieteDto {
       return this.societeService.item;
   }
  set societe(value: SocieteDto) {
        this.societeService.item = value;
   }
   get societes(): Array<SocieteDto> {
        return this.societeService.items;
   }
   set societes(value: Array<SocieteDto>) {
        this.societeService.items = value;
   }
   get createSocieteDialog(): boolean {
       return this.societeService.createDialog;
   }
  set createSocieteDialog(value: boolean) {
       this.societeService.createDialog= value;
   }
   get lienParente(): LienParenteDto {
       return this.lienParenteService.item;
   }
  set lienParente(value: LienParenteDto) {
        this.lienParenteService.item = value;
   }
   get lienParentes(): Array<LienParenteDto> {
        return this.lienParenteService.items;
   }
   set lienParentes(value: Array<LienParenteDto>) {
        this.lienParenteService.items = value;
   }
   get createLienParenteDialog(): boolean {
       return this.lienParenteService.createDialog;
   }
  set createLienParenteDialog(value: boolean) {
       this.lienParenteService.createDialog= value;
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
   get compagnieAssurance(): CompagnieAssuranceDto {
       return this.compagnieAssuranceService.item;
   }
  set compagnieAssurance(value: CompagnieAssuranceDto) {
        this.compagnieAssuranceService.item = value;
   }
   get compagnieAssurances(): Array<CompagnieAssuranceDto> {
        return this.compagnieAssuranceService.items;
   }
   set compagnieAssurances(value: Array<CompagnieAssuranceDto>) {
        this.compagnieAssuranceService.items = value;
   }
   get createCompagnieAssuranceDialog(): boolean {
       return this.compagnieAssuranceService.createDialog;
   }
  set createCompagnieAssuranceDialog(value: boolean) {
       this.compagnieAssuranceService.createDialog= value;
   }



    get validSocieteCode(): boolean {
        return this._validSocieteCode;
    }
    set validSocieteCode(value: boolean) {
        this._validSocieteCode = value;
    }
    get validSocieteLibelle(): boolean {
        return this._validSocieteLibelle;
    }
    set validSocieteLibelle(value: boolean) {
        this._validSocieteLibelle = value;
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
    get validLienParenteCode(): boolean {
        return this._validLienParenteCode;
    }
    set validLienParenteCode(value: boolean) {
        this._validLienParenteCode = value;
    }
    get validLienParenteLibelle(): boolean {
        return this._validLienParenteLibelle;
    }
    set validLienParenteLibelle(value: boolean) {
        this._validLienParenteLibelle = value;
    }
}

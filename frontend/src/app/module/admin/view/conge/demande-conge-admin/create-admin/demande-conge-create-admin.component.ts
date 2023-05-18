import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {DemandeCongeService} from 'src/app/controller/service/DemandeConge.service';
import {DemandeCongeDto} from 'src/app/controller/model/DemandeConge.model';
import {DemandeCongeCriteria} from 'src/app/controller/criteria/DemandeCongeCriteria.model';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeService} from 'src/app/controller/service/Employe.service';
import {EtatDemandeCongeDto} from 'src/app/controller/model/EtatDemandeConge.model';
import {EtatDemandeCongeService} from 'src/app/controller/service/EtatDemandeConge.service';
import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {DepartementService} from 'src/app/controller/service/Departement.service';
import {TypeDemandeCongeDto} from 'src/app/controller/model/TypeDemandeConge.model';
import {TypeDemandeCongeService} from 'src/app/controller/service/TypeDemandeConge.service';
@Component({
  selector: 'app-demande-conge-create-admin',
  templateUrl: './demande-conge-create-admin.component.html'
})
export class DemandeCongeCreateAdminComponent extends AbstractCreateController<DemandeCongeDto, DemandeCongeCriteria, DemandeCongeService>  implements OnInit {



    private _validEtatDemandeCongeCode = true;
    private _validEtatDemandeCongeLibelle = true;
    private _validTypeDemandeCongeCode = true;
    private _validTypeDemandeCongeLibelle = true;

    constructor( private demandeCongeService: DemandeCongeService , private employeService: EmployeService, private etatDemandeCongeService: EtatDemandeCongeService, private departementService: DepartementService, private typeDemandeCongeService: TypeDemandeCongeService) {
        super(demandeCongeService);
    }

    ngOnInit(): void {
    this.employe = new EmployeDto();
    this.employeService.findAll().subscribe((data) => this.employes = data);
    this.departement = new DepartementDto();
    this.departementService.findAll().subscribe((data) => this.departements = data);
    this.etatDemandeConge = new EtatDemandeCongeDto();
    this.etatDemandeCongeService.findAll().subscribe((data) => this.etatDemandeConges = data);
    this.typeDemandeConge = new TypeDemandeCongeDto();
    this.typeDemandeCongeService.findAll().subscribe((data) => this.typeDemandeConges = data);
}





    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



    public async openCreateTypeDemandeConge(typeDemandeConge: string) {
    const isPermistted = await this.roleService.isPermitted('TypeDemandeConge', 'add');
    if(isPermistted) {
         this.typeDemandeConge = new TypeDemandeCongeDto();
         this.createTypeDemandeCongeDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateEtatDemandeConge(etatDemandeConge: string) {
    const isPermistted = await this.roleService.isPermitted('EtatDemandeConge', 'add');
    if(isPermistted) {
         this.etatDemandeConge = new EtatDemandeCongeDto();
         this.createEtatDemandeCongeDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get typeDemandeConge(): TypeDemandeCongeDto {
        return this.typeDemandeCongeService.item;
    }
    set typeDemandeConge(value: TypeDemandeCongeDto) {
        this.typeDemandeCongeService.item = value;
    }
    get typeDemandeConges(): Array<TypeDemandeCongeDto> {
        return this.typeDemandeCongeService.items;
    }
    set typeDemandeConges(value: Array<TypeDemandeCongeDto>) {
        this.typeDemandeCongeService.items = value;
    }
    get createTypeDemandeCongeDialog(): boolean {
       return this.typeDemandeCongeService.createDialog;
    }
    set createTypeDemandeCongeDialog(value: boolean) {
        this.typeDemandeCongeService.createDialog= value;
    }
    get departement(): DepartementDto {
        return this.departementService.item;
    }
    set departement(value: DepartementDto) {
        this.departementService.item = value;
    }
    get departements(): Array<DepartementDto> {
        return this.departementService.items;
    }
    set departements(value: Array<DepartementDto>) {
        this.departementService.items = value;
    }
    get createDepartementDialog(): boolean {
       return this.departementService.createDialog;
    }
    set createDepartementDialog(value: boolean) {
        this.departementService.createDialog= value;
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
    get etatDemandeConge(): EtatDemandeCongeDto {
        return this.etatDemandeCongeService.item;
    }
    set etatDemandeConge(value: EtatDemandeCongeDto) {
        this.etatDemandeCongeService.item = value;
    }
    get etatDemandeConges(): Array<EtatDemandeCongeDto> {
        return this.etatDemandeCongeService.items;
    }
    set etatDemandeConges(value: Array<EtatDemandeCongeDto>) {
        this.etatDemandeCongeService.items = value;
    }
    get createEtatDemandeCongeDialog(): boolean {
       return this.etatDemandeCongeService.createDialog;
    }
    set createEtatDemandeCongeDialog(value: boolean) {
        this.etatDemandeCongeService.createDialog= value;
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

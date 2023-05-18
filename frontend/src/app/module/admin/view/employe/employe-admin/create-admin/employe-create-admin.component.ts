import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {EmployeService} from 'src/app/controller/service/Employe.service';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeCriteria} from 'src/app/controller/criteria/EmployeCriteria.model';
import {EducationDto} from 'src/app/controller/model/Education.model';
import {EducationService} from 'src/app/controller/service/Education.service';
import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {DepartementService} from 'src/app/controller/service/Departement.service';
import {SexeDto} from 'src/app/controller/model/Sexe.model';
import {SexeService} from 'src/app/controller/service/Sexe.service';
import {PromotionDto} from 'src/app/controller/model/Promotion.model';
import {PromotionService} from 'src/app/controller/service/Promotion.service';
import {CategorieEmployeDto} from 'src/app/controller/model/CategorieEmploye.model';
import {CategorieEmployeService} from 'src/app/controller/service/CategorieEmploye.service';
@Component({
  selector: 'app-employe-create-admin',
  templateUrl: './employe-create-admin.component.html'
})
export class EmployeCreateAdminComponent extends AbstractCreateController<EmployeDto, EmployeCriteria, EmployeService>  implements OnInit {



    private _validSexeCode = true;
    private _validSexeLibelle = true;
    private _validCategorieEmployeCode = true;
    private _validCategorieEmployeLibelle = true;
    private _validPromotionCode = true;
    private _validPromotionLibelle = true;
    private _validEducationCode = true;
    private _validEducationLibelle = true;

    constructor( private employeService: EmployeService , private educationService: EducationService, private departementService: DepartementService, private sexeService: SexeService, private promotionService: PromotionService, private categorieEmployeService: CategorieEmployeService) {
        super(employeService);
    }

    ngOnInit(): void {
    this.sexe = new SexeDto();
    this.sexeService.findAll().subscribe((data) => this.sexes = data);
    this.departement = new DepartementDto();
    this.departementService.findAll().subscribe((data) => this.departements = data);
    this.categorieEmploye = new CategorieEmployeDto();
    this.categorieEmployeService.findAll().subscribe((data) => this.categorieEmployes = data);
    this.promotion = new PromotionDto();
    this.promotionService.findAll().subscribe((data) => this.promotions = data);
    this.education = new EducationDto();
    this.educationService.findAll().subscribe((data) => this.educations = data);
}





    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



    public async openCreateCategorieEmploye(categorieEmploye: string) {
    const isPermistted = await this.roleService.isPermitted('CategorieEmploye', 'add');
    if(isPermistted) {
         this.categorieEmploye = new CategorieEmployeDto();
         this.createCategorieEmployeDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateSexe(sexe: string) {
    const isPermistted = await this.roleService.isPermitted('Sexe', 'add');
    if(isPermistted) {
         this.sexe = new SexeDto();
         this.createSexeDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateEducation(education: string) {
    const isPermistted = await this.roleService.isPermitted('Education', 'add');
    if(isPermistted) {
         this.education = new EducationDto();
         this.createEducationDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get categorieEmploye(): CategorieEmployeDto {
        return this.categorieEmployeService.item;
    }
    set categorieEmploye(value: CategorieEmployeDto) {
        this.categorieEmployeService.item = value;
    }
    get categorieEmployes(): Array<CategorieEmployeDto> {
        return this.categorieEmployeService.items;
    }
    set categorieEmployes(value: Array<CategorieEmployeDto>) {
        this.categorieEmployeService.items = value;
    }
    get createCategorieEmployeDialog(): boolean {
       return this.categorieEmployeService.createDialog;
    }
    set createCategorieEmployeDialog(value: boolean) {
        this.categorieEmployeService.createDialog= value;
    }
    get promotion(): PromotionDto {
        return this.promotionService.item;
    }
    set promotion(value: PromotionDto) {
        this.promotionService.item = value;
    }
    get promotions(): Array<PromotionDto> {
        return this.promotionService.items;
    }
    set promotions(value: Array<PromotionDto>) {
        this.promotionService.items = value;
    }
    get createPromotionDialog(): boolean {
       return this.promotionService.createDialog;
    }
    set createPromotionDialog(value: boolean) {
        this.promotionService.createDialog= value;
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
    get sexe(): SexeDto {
        return this.sexeService.item;
    }
    set sexe(value: SexeDto) {
        this.sexeService.item = value;
    }
    get sexes(): Array<SexeDto> {
        return this.sexeService.items;
    }
    set sexes(value: Array<SexeDto>) {
        this.sexeService.items = value;
    }
    get createSexeDialog(): boolean {
       return this.sexeService.createDialog;
    }
    set createSexeDialog(value: boolean) {
        this.sexeService.createDialog= value;
    }
    get education(): EducationDto {
        return this.educationService.item;
    }
    set education(value: EducationDto) {
        this.educationService.item = value;
    }
    get educations(): Array<EducationDto> {
        return this.educationService.items;
    }
    set educations(value: Array<EducationDto>) {
        this.educationService.items = value;
    }
    get createEducationDialog(): boolean {
       return this.educationService.createDialog;
    }
    set createEducationDialog(value: boolean) {
        this.educationService.createDialog= value;
    }




    get validSexeCode(): boolean {
        return this._validSexeCode;
    }
    set validSexeCode(value: boolean) {
        this._validSexeCode = value;
    }
    get validSexeLibelle(): boolean {
        return this._validSexeLibelle;
    }
    set validSexeLibelle(value: boolean) {
        this._validSexeLibelle = value;
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
    get validPromotionCode(): boolean {
        return this._validPromotionCode;
    }
    set validPromotionCode(value: boolean) {
        this._validPromotionCode = value;
    }
    get validPromotionLibelle(): boolean {
        return this._validPromotionLibelle;
    }
    set validPromotionLibelle(value: boolean) {
        this._validPromotionLibelle = value;
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

import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

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
  selector: 'app-employe-view-admin',
  templateUrl: './employe-view-admin.component.html'
})
export class EmployeViewAdminComponent extends AbstractViewController<EmployeDto, EmployeCriteria, EmployeService> implements OnInit {


    constructor(private employeService: EmployeService, private educationService: EducationService, private departementService: DepartementService, private sexeService: SexeService, private promotionService: PromotionService, private categorieEmployeService: CategorieEmployeService){
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


    get categorieEmploye(): CategorieEmployeDto {
       return this.categorieEmployeService.item;
    }
    set categorieEmploye(value: CategorieEmployeDto) {
        this.categorieEmployeService.item = value;
    }
    get categorieEmployes():Array<CategorieEmployeDto> {
       return this.categorieEmployeService.items;
    }
    set categorieEmployes(value: Array<CategorieEmployeDto>) {
        this.categorieEmployeService.items = value;
    }
    get promotion(): PromotionDto {
       return this.promotionService.item;
    }
    set promotion(value: PromotionDto) {
        this.promotionService.item = value;
    }
    get promotions():Array<PromotionDto> {
       return this.promotionService.items;
    }
    set promotions(value: Array<PromotionDto>) {
        this.promotionService.items = value;
    }
    get departement(): DepartementDto {
       return this.departementService.item;
    }
    set departement(value: DepartementDto) {
        this.departementService.item = value;
    }
    get departements():Array<DepartementDto> {
       return this.departementService.items;
    }
    set departements(value: Array<DepartementDto>) {
        this.departementService.items = value;
    }
    get sexe(): SexeDto {
       return this.sexeService.item;
    }
    set sexe(value: SexeDto) {
        this.sexeService.item = value;
    }
    get sexes():Array<SexeDto> {
       return this.sexeService.items;
    }
    set sexes(value: Array<SexeDto>) {
        this.sexeService.items = value;
    }
    get education(): EducationDto {
       return this.educationService.item;
    }
    set education(value: EducationDto) {
        this.educationService.item = value;
    }
    get educations():Array<EducationDto> {
       return this.educationService.items;
    }
    set educations(value: Array<EducationDto>) {
        this.educationService.items = value;
    }


}

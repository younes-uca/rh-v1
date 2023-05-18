import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

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
  selector: 'app-reclamation-view-admin',
  templateUrl: './reclamation-view-admin.component.html'
})
export class ReclamationViewAdminComponent extends AbstractViewController<ReclamationDto, ReclamationCriteria, ReclamationService> implements OnInit {


    constructor(private reclamationService: ReclamationService, private employeService: EmployeService, private typeReclamationService: TypeReclamationService, private etatReclamationService: EtatReclamationService){
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


    get typeReclamation(): TypeReclamationDto {
       return this.typeReclamationService.item;
    }
    set typeReclamation(value: TypeReclamationDto) {
        this.typeReclamationService.item = value;
    }
    get typeReclamations():Array<TypeReclamationDto> {
       return this.typeReclamationService.items;
    }
    set typeReclamations(value: Array<TypeReclamationDto>) {
        this.typeReclamationService.items = value;
    }
    get etatReclamation(): EtatReclamationDto {
       return this.etatReclamationService.item;
    }
    set etatReclamation(value: EtatReclamationDto) {
        this.etatReclamationService.item = value;
    }
    get etatReclamations():Array<EtatReclamationDto> {
       return this.etatReclamationService.items;
    }
    set etatReclamations(value: Array<EtatReclamationDto>) {
        this.etatReclamationService.items = value;
    }
    get employe(): EmployeDto {
       return this.employeService.item;
    }
    set employe(value: EmployeDto) {
        this.employeService.item = value;
    }
    get employes():Array<EmployeDto> {
       return this.employeService.items;
    }
    set employes(value: Array<EmployeDto>) {
        this.employeService.items = value;
    }


}

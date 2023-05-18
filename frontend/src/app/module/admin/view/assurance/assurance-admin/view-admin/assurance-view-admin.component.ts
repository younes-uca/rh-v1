import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

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
  selector: 'app-assurance-view-admin',
  templateUrl: './assurance-view-admin.component.html'
})
export class AssuranceViewAdminComponent extends AbstractViewController<AssuranceDto, AssuranceCriteria, AssuranceService> implements OnInit {


    constructor(private assuranceService: AssuranceService, private employeService: EmployeService, private societeService: SocieteService, private compagnieAssuranceService: CompagnieAssuranceService, private lienParenteService: LienParenteService){
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


    get societe(): SocieteDto {
       return this.societeService.item;
    }
    set societe(value: SocieteDto) {
        this.societeService.item = value;
    }
    get societes():Array<SocieteDto> {
       return this.societeService.items;
    }
    set societes(value: Array<SocieteDto>) {
        this.societeService.items = value;
    }
    get lienParente(): LienParenteDto {
       return this.lienParenteService.item;
    }
    set lienParente(value: LienParenteDto) {
        this.lienParenteService.item = value;
    }
    get lienParentes():Array<LienParenteDto> {
       return this.lienParenteService.items;
    }
    set lienParentes(value: Array<LienParenteDto>) {
        this.lienParenteService.items = value;
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
    get compagnieAssurance(): CompagnieAssuranceDto {
       return this.compagnieAssuranceService.item;
    }
    set compagnieAssurance(value: CompagnieAssuranceDto) {
        this.compagnieAssuranceService.item = value;
    }
    get compagnieAssurances():Array<CompagnieAssuranceDto> {
       return this.compagnieAssuranceService.items;
    }
    set compagnieAssurances(value: Array<CompagnieAssuranceDto>) {
        this.compagnieAssuranceService.items = value;
    }


}

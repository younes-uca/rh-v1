import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

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
  selector: 'app-demande-conge-view-admin',
  templateUrl: './demande-conge-view-admin.component.html'
})
export class DemandeCongeViewAdminComponent extends AbstractViewController<DemandeCongeDto, DemandeCongeCriteria, DemandeCongeService> implements OnInit {


    constructor(private demandeCongeService: DemandeCongeService, private employeService: EmployeService, private etatDemandeCongeService: EtatDemandeCongeService, private departementService: DepartementService, private typeDemandeCongeService: TypeDemandeCongeService){
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


    get typeDemandeConge(): TypeDemandeCongeDto {
       return this.typeDemandeCongeService.item;
    }
    set typeDemandeConge(value: TypeDemandeCongeDto) {
        this.typeDemandeCongeService.item = value;
    }
    get typeDemandeConges():Array<TypeDemandeCongeDto> {
       return this.typeDemandeCongeService.items;
    }
    set typeDemandeConges(value: Array<TypeDemandeCongeDto>) {
        this.typeDemandeCongeService.items = value;
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
    get etatDemandeConge(): EtatDemandeCongeDto {
       return this.etatDemandeCongeService.item;
    }
    set etatDemandeConge(value: EtatDemandeCongeDto) {
        this.etatDemandeCongeService.item = value;
    }
    get etatDemandeConges():Array<EtatDemandeCongeDto> {
       return this.etatDemandeCongeService.items;
    }
    set etatDemandeConges(value: Array<EtatDemandeCongeDto>) {
        this.etatDemandeCongeService.items = value;
    }


}

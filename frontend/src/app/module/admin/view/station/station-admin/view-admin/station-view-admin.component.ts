import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {StationService} from 'src/app/controller/service/Station.service';
import {StationDto} from 'src/app/controller/model/Station.model';
import {StationCriteria} from 'src/app/controller/criteria/StationCriteria.model';

import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeService} from 'src/app/controller/service/Employe.service';
import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {DepartementService} from 'src/app/controller/service/Departement.service';
import {SiegeDto} from 'src/app/controller/model/Siege.model';
import {SiegeService} from 'src/app/controller/service/Siege.service';
import {VilleDto} from 'src/app/controller/model/Ville.model';
import {VilleService} from 'src/app/controller/service/Ville.service';
@Component({
  selector: 'app-station-view-admin',
  templateUrl: './station-view-admin.component.html'
})
export class StationViewAdminComponent extends AbstractViewController<StationDto, StationCriteria, StationService> implements OnInit {

    departements = new DepartementDto();
    departementss: Array<DepartementDto> = [];

    constructor(private stationService: StationService, private employeService: EmployeService, private departementService: DepartementService, private siegeService: SiegeService, private villeService: VilleService){
        super(stationService);
    }

    ngOnInit(): void {
        this.departements.siege = new SiegeDto();
        this.siegeService.findAll().subscribe((data) => this.sieges = data);
        this.departements.employe = new EmployeDto();
        this.employeService.findAll().subscribe((data) => this.employes = data);
        this.employe = new EmployeDto();
        this.employeService.findAll().subscribe((data) => this.employes = data);
        this.ville = new VilleDto();
        this.villeService.findAll().subscribe((data) => this.villes = data);
    }


    get ville(): VilleDto {
       return this.villeService.item;
    }
    set ville(value: VilleDto) {
        this.villeService.item = value;
    }
    get villes():Array<VilleDto> {
       return this.villeService.items;
    }
    set villes(value: Array<VilleDto>) {
        this.villeService.items = value;
    }
    get siege(): SiegeDto {
       return this.siegeService.item;
    }
    set siege(value: SiegeDto) {
        this.siegeService.item = value;
    }
    get sieges():Array<SiegeDto> {
       return this.siegeService.items;
    }
    set sieges(value: Array<SiegeDto>) {
        this.siegeService.items = value;
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

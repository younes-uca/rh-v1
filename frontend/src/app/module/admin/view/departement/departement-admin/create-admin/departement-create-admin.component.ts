import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {DepartementService} from 'src/app/controller/service/Departement.service';
import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {DepartementCriteria} from 'src/app/controller/criteria/DepartementCriteria.model';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeService} from 'src/app/controller/service/Employe.service';
import {StationDto} from 'src/app/controller/model/Station.model';
import {StationService} from 'src/app/controller/service/Station.service';
import {SiegeDto} from 'src/app/controller/model/Siege.model';
import {SiegeService} from 'src/app/controller/service/Siege.service';
@Component({
  selector: 'app-departement-create-admin',
  templateUrl: './departement-create-admin.component.html'
})
export class DepartementCreateAdminComponent extends AbstractCreateController<DepartementDto, DepartementCriteria, DepartementService>  implements OnInit {



    private _validSiegeCode = true;
    private _validSiegeLibelle = true;

    constructor( private departementService: DepartementService , private employeService: EmployeService, private stationService: StationService, private siegeService: SiegeService) {
        super(departementService);
    }

    ngOnInit(): void {
    this.siege = new SiegeDto();
    this.siegeService.findAll().subscribe((data) => this.sieges = data);
    this.employe = new EmployeDto();
    this.employeService.findAll().subscribe((data) => this.employes = data);
    this.station = new StationDto();
    this.stationService.findAll().subscribe((data) => this.stations = data);
}





    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }




    get siege(): SiegeDto {
        return this.siegeService.item;
    }
    set siege(value: SiegeDto) {
        this.siegeService.item = value;
    }
    get sieges(): Array<SiegeDto> {
        return this.siegeService.items;
    }
    set sieges(value: Array<SiegeDto>) {
        this.siegeService.items = value;
    }
    get createSiegeDialog(): boolean {
       return this.siegeService.createDialog;
    }
    set createSiegeDialog(value: boolean) {
        this.siegeService.createDialog= value;
    }
    get station(): StationDto {
        return this.stationService.item;
    }
    set station(value: StationDto) {
        this.stationService.item = value;
    }
    get stations(): Array<StationDto> {
        return this.stationService.items;
    }
    set stations(value: Array<StationDto>) {
        this.stationService.items = value;
    }
    get createStationDialog(): boolean {
       return this.stationService.createDialog;
    }
    set createStationDialog(value: boolean) {
        this.stationService.createDialog= value;
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




    get validSiegeCode(): boolean {
        return this._validSiegeCode;
    }
    set validSiegeCode(value: boolean) {
        this._validSiegeCode = value;
    }
    get validSiegeLibelle(): boolean {
        return this._validSiegeLibelle;
    }
    set validSiegeLibelle(value: boolean) {
        this._validSiegeLibelle = value;
    }


}

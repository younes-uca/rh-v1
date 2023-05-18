import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

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
  selector: 'app-station-create-admin',
  templateUrl: './station-create-admin.component.html'
})
export class StationCreateAdminComponent extends AbstractCreateController<StationDto, StationCriteria, StationService>  implements OnInit {

    private _departementsElement = new DepartementDto();


    private _validVilleCode = true;
    private _validVilleLibelle = true;

    constructor( private stationService: StationService , private employeService: EmployeService, private departementService: DepartementService, private siegeService: SiegeService, private villeService: VilleService) {
        super(stationService);
    }

    ngOnInit(): void {
        this.departementsElement.siege = new SiegeDto();
        this.siegeService.findAll().subscribe((data) => this.sieges = data);
        this.departementsElement.employe = new EmployeDto();
        this.employeService.findAll().subscribe((data) => this.employes = data);
    this.employe = new EmployeDto();
    this.employeService.findAll().subscribe((data) => this.employes = data);
    this.ville = new VilleDto();
    this.villeService.findAll().subscribe((data) => this.villes = data);
}



    validateDepartements(){
        this.errorMessages = new Array();
    }


    public setValidation(value: boolean){
    }

    public addDepartements() {
        if( this.item.departements == null )
            this.item.departements = new Array<DepartementDto>();
       this.validateDepartements();
       if (this.errorMessages.length === 0) {
              this.item.departements.push({... this.departementsElement});
              this.departementsElement = new DepartementDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deleteDepartement(p: DepartementDto) {
        this.item.departements.forEach((element, index) => {
            if (element === p) { this.item.departements.splice(index, 1); }
        });
    }

    public editDepartement(p: DepartementDto) {
        this.departementsElement = {... p};
        this.activeTab = 0;
    }


    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }




    get ville(): VilleDto {
        return this.villeService.item;
    }
    set ville(value: VilleDto) {
        this.villeService.item = value;
    }
    get villes(): Array<VilleDto> {
        return this.villeService.items;
    }
    set villes(value: Array<VilleDto>) {
        this.villeService.items = value;
    }
    get createVilleDialog(): boolean {
       return this.villeService.createDialog;
    }
    set createVilleDialog(value: boolean) {
        this.villeService.createDialog= value;
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




    get validVilleCode(): boolean {
        return this._validVilleCode;
    }
    set validVilleCode(value: boolean) {
        this._validVilleCode = value;
    }
    get validVilleLibelle(): boolean {
        return this._validVilleLibelle;
    }
    set validVilleLibelle(value: boolean) {
        this._validVilleLibelle = value;
    }

    get departementsElement(): DepartementDto {
        if( this._departementsElement == null )
            this._departementsElement = new DepartementDto();
        return this._departementsElement;
    }

    set departementsElement(value: DepartementDto) {
        this._departementsElement = value;
    }

}

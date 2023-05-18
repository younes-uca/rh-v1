import {Component, OnInit} from '@angular/core';
import {DepartementService} from 'src/app/controller/service/Departement.service';
import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {DepartementCriteria} from 'src/app/controller/criteria/DepartementCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { SiegeService } from 'src/app/controller/service/Siege.service';
import { EmployeService } from 'src/app/controller/service/Employe.service';
import { StationService } from 'src/app/controller/service/Station.service';

import {StationDto} from 'src/app/controller/model/Station.model';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {SiegeDto} from 'src/app/controller/model/Siege.model';


@Component({
  selector: 'app-departement-list-admin',
  templateUrl: './departement-list-admin.component.html'
})
export class DepartementListAdminComponent extends AbstractListController<DepartementDto, DepartementCriteria, DepartementService>  implements OnInit {

    fileName = 'Departement';

    sieges :Array<SiegeDto>;
    employes :Array<EmployeDto>;
    stations :Array<StationDto>;
  
    constructor(departementService: DepartementService, private siegeService: SiegeService, private employeService: EmployeService, private stationService: StationService) {
        super(departementService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadSiege();
      this.loadEmploye();
      this.loadStation();
    }

    public async loadDepartements(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Departement', 'list');
        isPermistted ? this.service.findAll().subscribe(departements => this.items = departements,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'siege?.libelle', header: 'Siege'},
            {field: 'nbrEmploye', header: 'Nbr employe'},
            {field: 'moyenneAge', header: 'Moyenne age'},
            {field: 'employe?.id', header: 'Employe'},
            {field: 'station?.id', header: 'Station'},
        ];
    }


    public async loadSiege(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Departement', 'list');
        isPermistted ? this.siegeService.findAllOptimized().subscribe(sieges => this.sieges = sieges,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadEmploye(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Departement', 'list');
        isPermistted ? this.employeService.findAll().subscribe(employes => this.employes = employes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadStation(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Departement', 'list');
        isPermistted ? this.stationService.findAll().subscribe(stations => this.stations = stations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: DepartementDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                'Siege': e.siege?.libelle ,
                 'Nbr employe': e.nbrEmploye ,
                 'Moyenne age': e.moyenneAge ,
                'Employe': e.employe?.id ,
                'Station': e.station?.id ,
            }
        });

        this.criteriaData = [{
        //'Siege': this.criteria.siege?.libelle ? this.criteria.siege?.libelle : environment.emptyForExport ,
            'Nbr employe Min': this.criteria.nbrEmployeMin ? this.criteria.nbrEmployeMin : environment.emptyForExport ,
            'Nbr employe Max': this.criteria.nbrEmployeMax ? this.criteria.nbrEmployeMax : environment.emptyForExport ,
            'Moyenne age Min': this.criteria.moyenneAgeMin ? this.criteria.moyenneAgeMin : environment.emptyForExport ,
            'Moyenne age Max': this.criteria.moyenneAgeMax ? this.criteria.moyenneAgeMax : environment.emptyForExport ,
        //'Employe': this.criteria.employe?.id ? this.criteria.employe?.id : environment.emptyForExport ,
        //'Station': this.criteria.station?.id ? this.criteria.station?.id : environment.emptyForExport ,
        }];
      }
}

import {Component, OnInit} from '@angular/core';
import {StationService} from 'src/app/controller/service/Station.service';
import {StationDto} from 'src/app/controller/model/Station.model';
import {StationCriteria} from 'src/app/controller/criteria/StationCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { EmployeService } from 'src/app/controller/service/Employe.service';
import { VilleService } from 'src/app/controller/service/Ville.service';

import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {VilleDto} from 'src/app/controller/model/Ville.model';
import {EmployeDto} from 'src/app/controller/model/Employe.model';


@Component({
  selector: 'app-station-list-admin',
  templateUrl: './station-list-admin.component.html'
})
export class StationListAdminComponent extends AbstractListController<StationDto, StationCriteria, StationService>  implements OnInit {

    fileName = 'Station';

    employes :Array<EmployeDto>;
    villes :Array<VilleDto>;
  
    constructor(stationService: StationService, private employeService: EmployeService, private villeService: VilleService) {
        super(stationService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadEmploye();
      this.loadVille();
    }

    public async loadStations(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Station', 'list');
        isPermistted ? this.service.findAll().subscribe(stations => this.items = stations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'employe?.id', header: 'Employe'},
            {field: 'ville?.libelle', header: 'Ville'},
        ];
    }


    public async loadEmploye(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Station', 'list');
        isPermistted ? this.employeService.findAll().subscribe(employes => this.employes = employes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadVille(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Station', 'list');
        isPermistted ? this.villeService.findAllOptimized().subscribe(villes => this.villes = villes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: StationDto) {
        if (res.departements != null) {
             res.departements.forEach(d => { d.station = null; d.id = null; });
        }
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                'Employe': e.employe?.id ,
                'Ville': e.ville?.libelle ,
                 'Adresse': e.adresse ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
        //'Employe': this.criteria.employe?.id ? this.criteria.employe?.id : environment.emptyForExport ,
        //'Ville': this.criteria.ville?.libelle ? this.criteria.ville?.libelle : environment.emptyForExport ,
            'Adresse': this.criteria.adresse ? this.criteria.adresse : environment.emptyForExport ,
        }];
      }
}

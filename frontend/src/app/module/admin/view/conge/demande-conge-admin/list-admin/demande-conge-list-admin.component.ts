import {Component, OnInit} from '@angular/core';
import {DemandeCongeService} from 'src/app/controller/service/DemandeConge.service';
import {DemandeCongeDto} from 'src/app/controller/model/DemandeConge.model';
import {DemandeCongeCriteria} from 'src/app/controller/criteria/DemandeCongeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { EmployeService } from 'src/app/controller/service/Employe.service';
import { DepartementService } from 'src/app/controller/service/Departement.service';
import { EtatDemandeCongeService } from 'src/app/controller/service/EtatDemandeConge.service';
import { TypeDemandeCongeService } from 'src/app/controller/service/TypeDemandeConge.service';

import {EtatDemandeCongeDto} from 'src/app/controller/model/EtatDemandeConge.model';
import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {TypeDemandeCongeDto} from 'src/app/controller/model/TypeDemandeConge.model';
import {EmployeDto} from 'src/app/controller/model/Employe.model';


@Component({
  selector: 'app-demande-conge-list-admin',
  templateUrl: './demande-conge-list-admin.component.html'
})
export class DemandeCongeListAdminComponent extends AbstractListController<DemandeCongeDto, DemandeCongeCriteria, DemandeCongeService>  implements OnInit {

    fileName = 'DemandeConge';

    employes :Array<EmployeDto>;
    departements :Array<DepartementDto>;
    etatDemandeConges :Array<EtatDemandeCongeDto>;
    typeDemandeConges :Array<TypeDemandeCongeDto>;
  
    constructor(demandeCongeService: DemandeCongeService, private employeService: EmployeService, private departementService: DepartementService, private etatDemandeCongeService: EtatDemandeCongeService, private typeDemandeCongeService: TypeDemandeCongeService) {
        super(demandeCongeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadEmploye();
      this.loadDepartement();
      this.loadEtatDemandeConge();
      this.loadTypeDemandeConge();
    }

    public async loadDemandeConges(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DemandeConge', 'list');
        isPermistted ? this.service.findAll().subscribe(demandeConges => this.items = demandeConges,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'ref', header: 'Ref'},
            {field: 'startTime', header: 'Start time'},
            {field: 'endTime', header: 'End time'},
            {field: 'nbrJourConge', header: 'Nbr jour conge'},
            {field: 'employe?.id', header: 'Employe'},
            {field: 'departement?.id', header: 'Departement'},
            {field: 'etatDemandeConge?.libelle', header: 'Etat demande conge'},
            {field: 'typeDemandeConge?.libelle', header: 'Type demande conge'},
        ];
    }


    public async loadEmploye(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DemandeConge', 'list');
        isPermistted ? this.employeService.findAll().subscribe(employes => this.employes = employes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDepartement(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DemandeConge', 'list');
        isPermistted ? this.departementService.findAll().subscribe(departements => this.departements = departements,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadEtatDemandeConge(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DemandeConge', 'list');
        isPermistted ? this.etatDemandeCongeService.findAllOptimized().subscribe(etatDemandeConges => this.etatDemandeConges = etatDemandeConges,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadTypeDemandeConge(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DemandeConge', 'list');
        isPermistted ? this.typeDemandeCongeService.findAllOptimized().subscribe(typeDemandeConges => this.typeDemandeConges = typeDemandeConges,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: DemandeCongeDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Ref': e.ref ,
                'Start time': this.datePipe.transform(e.startTime , 'dd/MM/yyyy hh:mm'),
                'End time': this.datePipe.transform(e.endTime , 'dd/MM/yyyy hh:mm'),
                 'Nbr jour conge': e.nbrJourConge ,
                'Employe': e.employe?.id ,
                'Departement': e.departement?.id ,
                'Etat demande conge': e.etatDemandeConge?.libelle ,
                'Type demande conge': e.typeDemandeConge?.libelle ,
            }
        });

        this.criteriaData = [{
            'Ref': this.criteria.ref ? this.criteria.ref : environment.emptyForExport ,
            'Start time Min': this.criteria.startTimeFrom ? this.datePipe.transform(this.criteria.startTimeFrom , this.dateFormat) : environment.emptyForExport ,
            'Start time Max': this.criteria.startTimeTo ? this.datePipe.transform(this.criteria.startTimeTo , this.dateFormat) : environment.emptyForExport ,
            'End time Min': this.criteria.endTimeFrom ? this.datePipe.transform(this.criteria.endTimeFrom , this.dateFormat) : environment.emptyForExport ,
            'End time Max': this.criteria.endTimeTo ? this.datePipe.transform(this.criteria.endTimeTo , this.dateFormat) : environment.emptyForExport ,
            'Nbr jour conge Min': this.criteria.nbrJourCongeMin ? this.criteria.nbrJourCongeMin : environment.emptyForExport ,
            'Nbr jour conge Max': this.criteria.nbrJourCongeMax ? this.criteria.nbrJourCongeMax : environment.emptyForExport ,
        //'Employe': this.criteria.employe?.id ? this.criteria.employe?.id : environment.emptyForExport ,
        //'Departement': this.criteria.departement?.id ? this.criteria.departement?.id : environment.emptyForExport ,
        //'Etat demande conge': this.criteria.etatDemandeConge?.libelle ? this.criteria.etatDemandeConge?.libelle : environment.emptyForExport ,
        //'Type demande conge': this.criteria.typeDemandeConge?.libelle ? this.criteria.typeDemandeConge?.libelle : environment.emptyForExport ,
        }];
      }
}

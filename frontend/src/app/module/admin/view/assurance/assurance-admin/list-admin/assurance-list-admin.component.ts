import {Component, OnInit} from '@angular/core';
import {AssuranceService} from 'src/app/controller/service/Assurance.service';
import {AssuranceDto} from 'src/app/controller/model/Assurance.model';
import {AssuranceCriteria} from 'src/app/controller/criteria/AssuranceCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { SocieteService } from 'src/app/controller/service/Societe.service';
import { CompagnieAssuranceService } from 'src/app/controller/service/CompagnieAssurance.service';
import { EmployeService } from 'src/app/controller/service/Employe.service';
import { LienParenteService } from 'src/app/controller/service/LienParente.service';

import {SocieteDto} from 'src/app/controller/model/Societe.model';
import {LienParenteDto} from 'src/app/controller/model/LienParente.model';
import {CompagnieAssuranceDto} from 'src/app/controller/model/CompagnieAssurance.model';
import {EmployeDto} from 'src/app/controller/model/Employe.model';


@Component({
  selector: 'app-assurance-list-admin',
  templateUrl: './assurance-list-admin.component.html'
})
export class AssuranceListAdminComponent extends AbstractListController<AssuranceDto, AssuranceCriteria, AssuranceService>  implements OnInit {

    fileName = 'Assurance';

    societes :Array<SocieteDto>;
    compagnieAssurances :Array<CompagnieAssuranceDto>;
    employes :Array<EmployeDto>;
    lienParentes :Array<LienParenteDto>;
  
    constructor(assuranceService: AssuranceService, private societeService: SocieteService, private compagnieAssuranceService: CompagnieAssuranceService, private employeService: EmployeService, private lienParenteService: LienParenteService) {
        super(assuranceService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadSociete();
      this.loadCompagnieAssurance();
      this.loadEmploye();
      this.loadLienParente();
    }

    public async loadAssurances(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Assurance', 'list');
        isPermistted ? this.service.findAll().subscribe(assurances => this.items = assurances,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'societe?.libelle', header: 'Societe'},
            {field: 'compagnieAssurance?.libelle', header: 'Compagnie assurance'},
            {field: 'numeroPolice', header: 'Numero police'},
            {field: 'courtier', header: 'Courtier'},
            {field: 'employe?.id', header: 'Employe'},
            {field: 'malade', header: 'Malade'},
            {field: 'lienParente?.libelle', header: 'Lien parente'},
            {field: 'dateConsultation', header: 'Date consultation'},
            {field: 'dateTransmission', header: 'Date transmission'},
            {field: 'natureBesoin', header: 'Nature besoin'},
            {field: 'fraisEnagage', header: 'Frais enagage'},
            {field: 'dateEnvoi', header: 'Date envoi'},
        ];
    }


    public async loadSociete(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Assurance', 'list');
        isPermistted ? this.societeService.findAllOptimized().subscribe(societes => this.societes = societes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadCompagnieAssurance(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Assurance', 'list');
        isPermistted ? this.compagnieAssuranceService.findAllOptimized().subscribe(compagnieAssurances => this.compagnieAssurances = compagnieAssurances,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadEmploye(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Assurance', 'list');
        isPermistted ? this.employeService.findAll().subscribe(employes => this.employes = employes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadLienParente(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Assurance', 'list');
        isPermistted ? this.lienParenteService.findAllOptimized().subscribe(lienParentes => this.lienParentes = lienParentes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: AssuranceDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                'Societe': e.societe?.libelle ,
                'Compagnie assurance': e.compagnieAssurance?.libelle ,
                 'Numero police': e.numeroPolice ,
                 'Courtier': e.courtier ,
                'Employe': e.employe?.id ,
                 'Malade': e.malade ,
                'Lien parente': e.lienParente?.libelle ,
                'Date consultation': this.datePipe.transform(e.dateConsultation , 'dd/MM/yyyy hh:mm'),
                'Date transmission': this.datePipe.transform(e.dateTransmission , 'dd/MM/yyyy hh:mm'),
                 'Nature besoin': e.natureBesoin ,
                 'Frais enagage': e.fraisEnagage ,
                'Date envoi': this.datePipe.transform(e.dateEnvoi , 'dd/MM/yyyy hh:mm'),
                 'Observation': e.observation ,
            }
        });

        this.criteriaData = [{
        //'Societe': this.criteria.societe?.libelle ? this.criteria.societe?.libelle : environment.emptyForExport ,
        //'Compagnie assurance': this.criteria.compagnieAssurance?.libelle ? this.criteria.compagnieAssurance?.libelle : environment.emptyForExport ,
            'Numero police': this.criteria.numeroPolice ? this.criteria.numeroPolice : environment.emptyForExport ,
            'Courtier': this.criteria.courtier ? this.criteria.courtier : environment.emptyForExport ,
        //'Employe': this.criteria.employe?.id ? this.criteria.employe?.id : environment.emptyForExport ,
            'Malade': this.criteria.malade ? this.criteria.malade : environment.emptyForExport ,
        //'Lien parente': this.criteria.lienParente?.libelle ? this.criteria.lienParente?.libelle : environment.emptyForExport ,
            'Date consultation Min': this.criteria.dateConsultationFrom ? this.datePipe.transform(this.criteria.dateConsultationFrom , this.dateFormat) : environment.emptyForExport ,
            'Date consultation Max': this.criteria.dateConsultationTo ? this.datePipe.transform(this.criteria.dateConsultationTo , this.dateFormat) : environment.emptyForExport ,
            'Date transmission Min': this.criteria.dateTransmissionFrom ? this.datePipe.transform(this.criteria.dateTransmissionFrom , this.dateFormat) : environment.emptyForExport ,
            'Date transmission Max': this.criteria.dateTransmissionTo ? this.datePipe.transform(this.criteria.dateTransmissionTo , this.dateFormat) : environment.emptyForExport ,
            'Nature besoin': this.criteria.natureBesoin ? this.criteria.natureBesoin : environment.emptyForExport ,
            'Frais enagage Min': this.criteria.fraisEnagageMin ? this.criteria.fraisEnagageMin : environment.emptyForExport ,
            'Frais enagage Max': this.criteria.fraisEnagageMax ? this.criteria.fraisEnagageMax : environment.emptyForExport ,
            'Date envoi Min': this.criteria.dateEnvoiFrom ? this.datePipe.transform(this.criteria.dateEnvoiFrom , this.dateFormat) : environment.emptyForExport ,
            'Date envoi Max': this.criteria.dateEnvoiTo ? this.datePipe.transform(this.criteria.dateEnvoiTo , this.dateFormat) : environment.emptyForExport ,
            'Observation': this.criteria.observation ? this.criteria.observation : environment.emptyForExport ,
        }];
      }
}

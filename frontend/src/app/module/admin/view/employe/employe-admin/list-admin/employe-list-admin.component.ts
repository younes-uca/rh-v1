import {Component, OnInit} from '@angular/core';
import {EmployeService} from 'src/app/controller/service/Employe.service';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeCriteria} from 'src/app/controller/criteria/EmployeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { SexeService } from 'src/app/controller/service/Sexe.service';
import { DepartementService } from 'src/app/controller/service/Departement.service';
import { CategorieEmployeService } from 'src/app/controller/service/CategorieEmploye.service';
import { PromotionService } from 'src/app/controller/service/Promotion.service';
import { EducationService } from 'src/app/controller/service/Education.service';

import {CategorieEmployeDto} from 'src/app/controller/model/CategorieEmploye.model';
import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {SexeDto} from 'src/app/controller/model/Sexe.model';
import {EducationDto} from 'src/app/controller/model/Education.model';
import {PromotionDto} from 'src/app/controller/model/Promotion.model';


@Component({
  selector: 'app-employe-list-admin',
  templateUrl: './employe-list-admin.component.html'
})
export class EmployeListAdminComponent extends AbstractListController<EmployeDto, EmployeCriteria, EmployeService>  implements OnInit {

    fileName = 'Employe';

     yesOrNoEtude :any[] =[];
     yesOrNoExperience :any[] =[];
    sexes :Array<SexeDto>;
    departements :Array<DepartementDto>;
    categorieEmployes :Array<CategorieEmployeDto>;
    promotions :Array<PromotionDto>;
    educations :Array<EducationDto>;
  
    constructor(employeService: EmployeService, private sexeService: SexeService, private departementService: DepartementService, private categorieEmployeService: CategorieEmployeService, private promotionService: PromotionService, private educationService: EducationService) {
        super(employeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadSexe();
      this.loadDepartement();
      this.loadCategorieEmploye();
      this.loadPromotion();
      this.loadEducation();
    this.yesOrNoEtude =  [{label: 'Etude', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    this.yesOrNoExperience =  [{label: 'Experience', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    }

    public async loadEmployes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Employe', 'list');
        isPermistted ? this.service.findAll().subscribe(employes => this.items = employes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'identifiantJlinx', header: 'Identifiant jlinx'},
            {field: 'matricule', header: 'Matricule'},
            {field: 'prenom', header: 'Prenom'},
            {field: 'nom', header: 'Nom'},
            {field: 'situation', header: 'Situation'},
            {field: 'dateNaissance', header: 'Date naissance'},
            {field: 'sexe?.libelle', header: 'Sexe'},
            {field: 'adresse', header: 'Adresse'},
            {field: 'ville', header: 'Ville'},
            {field: 'cin', header: 'Cin'},
            {field: 'numeroAdhesion', header: 'Numero adhesion'},
            {field: 'email', header: 'Email'},
            {field: 'rib', header: 'Rib'},
            {field: 'age', header: 'Age'},
            {field: 'numeroTelephone', header: 'Numero telephone'},
            {field: 'emergencyContact', header: 'Emergency contact'},
            {field: 'numeroSecuriteSociale', header: 'Numero securite sociale'},
            {field: 'departement?.id', header: 'Departement'},
            {field: 'categorieEmploye?.libelle', header: 'Categorie employe'},
            {field: 'promotion?.libelle', header: 'Promotion'},
            {field: 'warnningNotice', header: 'Warnning notice'},
            {field: 'cost', header: 'Cost'},
            {field: 'assuranceCost', header: 'Assurance cost'},
            {field: 'education?.libelle', header: 'Education'},
            {field: 'etude', header: 'Etude'},
            {field: 'experience', header: 'Experience'},
            {field: 'salaire', header: 'Salaire'},
        ];
    }


    public async loadSexe(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Employe', 'list');
        isPermistted ? this.sexeService.findAllOptimized().subscribe(sexes => this.sexes = sexes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDepartement(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Employe', 'list');
        isPermistted ? this.departementService.findAll().subscribe(departements => this.departements = departements,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadCategorieEmploye(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Employe', 'list');
        isPermistted ? this.categorieEmployeService.findAllOptimized().subscribe(categorieEmployes => this.categorieEmployes = categorieEmployes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadPromotion(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Employe', 'list');
        isPermistted ? this.promotionService.findAllOptimized().subscribe(promotions => this.promotions = promotions,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadEducation(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Employe', 'list');
        isPermistted ? this.educationService.findAllOptimized().subscribe(educations => this.educations = educations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: EmployeDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Identifiant jlinx': e.identifiantJlinx ,
                 'Matricule': e.matricule ,
                 'Prenom': e.prenom ,
                 'Nom': e.nom ,
                 'Situation': e.situation ,
                'Date naissance': this.datePipe.transform(e.dateNaissance , 'dd/MM/yyyy hh:mm'),
                'Sexe': e.sexe?.libelle ,
                 'Adresse': e.adresse ,
                 'Ville': e.ville ,
                 'Cin': e.cin ,
                 'Numero adhesion': e.numeroAdhesion ,
                 'Email': e.email ,
                 'Rib': e.rib ,
                 'Age': e.age ,
                 'Numero telephone': e.numeroTelephone ,
                 'Emergency contact': e.emergencyContact ,
                 'Numero securite sociale': e.numeroSecuriteSociale ,
                'Departement': e.departement?.id ,
                'Categorie employe': e.categorieEmploye?.libelle ,
                'Promotion': e.promotion?.libelle ,
                 'Warnning notice': e.warnningNotice ,
                 'Cost': e.cost ,
                 'Assurance cost': e.assuranceCost ,
                'Education': e.education?.libelle ,
                'Etude': e.etude? 'Vrai' : 'Faux' ,
                'Experience': e.experience? 'Vrai' : 'Faux' ,
                 'Salaire': e.salaire ,
            }
        });

        this.criteriaData = [{
            'Identifiant jlinx': this.criteria.identifiantJlinx ? this.criteria.identifiantJlinx : environment.emptyForExport ,
            'Matricule': this.criteria.matricule ? this.criteria.matricule : environment.emptyForExport ,
            'Prenom': this.criteria.prenom ? this.criteria.prenom : environment.emptyForExport ,
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
            'Situation': this.criteria.situation ? this.criteria.situation : environment.emptyForExport ,
            'Date naissance Min': this.criteria.dateNaissanceFrom ? this.datePipe.transform(this.criteria.dateNaissanceFrom , this.dateFormat) : environment.emptyForExport ,
            'Date naissance Max': this.criteria.dateNaissanceTo ? this.datePipe.transform(this.criteria.dateNaissanceTo , this.dateFormat) : environment.emptyForExport ,
        //'Sexe': this.criteria.sexe?.libelle ? this.criteria.sexe?.libelle : environment.emptyForExport ,
            'Adresse': this.criteria.adresse ? this.criteria.adresse : environment.emptyForExport ,
            'Ville': this.criteria.ville ? this.criteria.ville : environment.emptyForExport ,
            'Cin': this.criteria.cin ? this.criteria.cin : environment.emptyForExport ,
            'Numero adhesion': this.criteria.numeroAdhesion ? this.criteria.numeroAdhesion : environment.emptyForExport ,
            'Email': this.criteria.email ? this.criteria.email : environment.emptyForExport ,
            'Rib': this.criteria.rib ? this.criteria.rib : environment.emptyForExport ,
            'Age Min': this.criteria.ageMin ? this.criteria.ageMin : environment.emptyForExport ,
            'Age Max': this.criteria.ageMax ? this.criteria.ageMax : environment.emptyForExport ,
            'Numero telephone': this.criteria.numeroTelephone ? this.criteria.numeroTelephone : environment.emptyForExport ,
            'Emergency contact': this.criteria.emergencyContact ? this.criteria.emergencyContact : environment.emptyForExport ,
            'Numero securite sociale': this.criteria.numeroSecuriteSociale ? this.criteria.numeroSecuriteSociale : environment.emptyForExport ,
        //'Departement': this.criteria.departement?.id ? this.criteria.departement?.id : environment.emptyForExport ,
        //'Categorie employe': this.criteria.categorieEmploye?.libelle ? this.criteria.categorieEmploye?.libelle : environment.emptyForExport ,
        //'Promotion': this.criteria.promotion?.libelle ? this.criteria.promotion?.libelle : environment.emptyForExport ,
            'Warnning notice': this.criteria.warnningNotice ? this.criteria.warnningNotice : environment.emptyForExport ,
            'Cost Min': this.criteria.costMin ? this.criteria.costMin : environment.emptyForExport ,
            'Cost Max': this.criteria.costMax ? this.criteria.costMax : environment.emptyForExport ,
            'Assurance cost Min': this.criteria.assuranceCostMin ? this.criteria.assuranceCostMin : environment.emptyForExport ,
            'Assurance cost Max': this.criteria.assuranceCostMax ? this.criteria.assuranceCostMax : environment.emptyForExport ,
        //'Education': this.criteria.education?.libelle ? this.criteria.education?.libelle : environment.emptyForExport ,
            'Etude': this.criteria.etude ? (this.criteria.etude ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Experience': this.criteria.experience ? (this.criteria.experience ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Salaire Min': this.criteria.salaireMin ? this.criteria.salaireMin : environment.emptyForExport ,
            'Salaire Max': this.criteria.salaireMax ? this.criteria.salaireMax : environment.emptyForExport ,
        }];
      }
}

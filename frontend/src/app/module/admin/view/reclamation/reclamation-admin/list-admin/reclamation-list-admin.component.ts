import {Component, OnInit} from '@angular/core';
import {ReclamationService} from 'src/app/controller/service/Reclamation.service';
import {ReclamationDto} from 'src/app/controller/model/Reclamation.model';
import {ReclamationCriteria} from 'src/app/controller/criteria/ReclamationCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { TypeReclamationService } from 'src/app/controller/service/TypeReclamation.service';
import { EtatReclamationService } from 'src/app/controller/service/EtatReclamation.service';
import { EmployeService } from 'src/app/controller/service/Employe.service';

import {TypeReclamationDto} from 'src/app/controller/model/TypeReclamation.model';
import {EtatReclamationDto} from 'src/app/controller/model/EtatReclamation.model';
import {EmployeDto} from 'src/app/controller/model/Employe.model';


@Component({
  selector: 'app-reclamation-list-admin',
  templateUrl: './reclamation-list-admin.component.html'
})
export class ReclamationListAdminComponent extends AbstractListController<ReclamationDto, ReclamationCriteria, ReclamationService>  implements OnInit {

    fileName = 'Reclamation';

    typeReclamations :Array<TypeReclamationDto>;
    etatReclamations :Array<EtatReclamationDto>;
    employes :Array<EmployeDto>;
  
    constructor(reclamationService: ReclamationService, private typeReclamationService: TypeReclamationService, private etatReclamationService: EtatReclamationService, private employeService: EmployeService) {
        super(reclamationService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadTypeReclamation();
      this.loadEtatReclamation();
      this.loadEmploye();
    }

    public async loadReclamations(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Reclamation', 'list');
        isPermistted ? this.service.findAll().subscribe(reclamations => this.items = reclamations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'reference', header: 'Reference'},
            {field: 'dateReclamation', header: 'Date reclamation'},
            {field: 'dateTraitement', header: 'Date traitement'},
            {field: 'dateReponse', header: 'Date reponse'},
            {field: 'objetReclamation', header: 'Objet reclamation'},
            {field: 'typeReclamation?.libelle', header: 'Type reclamation'},
            {field: 'etatReclamation?.libelle', header: 'Etat reclamation'},
            {field: 'employe?.id', header: 'Employe'},
        ];
    }


    public async loadTypeReclamation(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Reclamation', 'list');
        isPermistted ? this.typeReclamationService.findAllOptimized().subscribe(typeReclamations => this.typeReclamations = typeReclamations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadEtatReclamation(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Reclamation', 'list');
        isPermistted ? this.etatReclamationService.findAllOptimized().subscribe(etatReclamations => this.etatReclamations = etatReclamations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadEmploye(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Reclamation', 'list');
        isPermistted ? this.employeService.findAll().subscribe(employes => this.employes = employes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: ReclamationDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Reference': e.reference ,
                'Date reclamation': this.datePipe.transform(e.dateReclamation , 'dd/MM/yyyy hh:mm'),
                 'Message': e.message ,
                'Date traitement': this.datePipe.transform(e.dateTraitement , 'dd/MM/yyyy hh:mm'),
                'Date reponse': this.datePipe.transform(e.dateReponse , 'dd/MM/yyyy hh:mm'),
                 'Commentaire traiteur': e.commentaireTraiteur ,
                 'Objet reclamation': e.objetReclamation ,
                'Type reclamation': e.typeReclamation?.libelle ,
                'Etat reclamation': e.etatReclamation?.libelle ,
                'Employe': e.employe?.id ,
            }
        });

        this.criteriaData = [{
            'Reference': this.criteria.reference ? this.criteria.reference : environment.emptyForExport ,
            'Date reclamation Min': this.criteria.dateReclamationFrom ? this.datePipe.transform(this.criteria.dateReclamationFrom , this.dateFormat) : environment.emptyForExport ,
            'Date reclamation Max': this.criteria.dateReclamationTo ? this.datePipe.transform(this.criteria.dateReclamationTo , this.dateFormat) : environment.emptyForExport ,
            'Message': this.criteria.message ? this.criteria.message : environment.emptyForExport ,
            'Date traitement Min': this.criteria.dateTraitementFrom ? this.datePipe.transform(this.criteria.dateTraitementFrom , this.dateFormat) : environment.emptyForExport ,
            'Date traitement Max': this.criteria.dateTraitementTo ? this.datePipe.transform(this.criteria.dateTraitementTo , this.dateFormat) : environment.emptyForExport ,
            'Date reponse Min': this.criteria.dateReponseFrom ? this.datePipe.transform(this.criteria.dateReponseFrom , this.dateFormat) : environment.emptyForExport ,
            'Date reponse Max': this.criteria.dateReponseTo ? this.datePipe.transform(this.criteria.dateReponseTo , this.dateFormat) : environment.emptyForExport ,
            'Commentaire traiteur': this.criteria.commentaireTraiteur ? this.criteria.commentaireTraiteur : environment.emptyForExport ,
            'Objet reclamation': this.criteria.objetReclamation ? this.criteria.objetReclamation : environment.emptyForExport ,
        //'Type reclamation': this.criteria.typeReclamation?.libelle ? this.criteria.typeReclamation?.libelle : environment.emptyForExport ,
        //'Etat reclamation': this.criteria.etatReclamation?.libelle ? this.criteria.etatReclamation?.libelle : environment.emptyForExport ,
        //'Employe': this.criteria.employe?.id ? this.criteria.employe?.id : environment.emptyForExport ,
        }];
      }
}

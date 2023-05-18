import {Component, OnInit} from '@angular/core';
import {SoldAnnuelCongeService} from 'src/app/controller/service/SoldAnnuelConge.service';
import {SoldAnnuelCongeDto} from 'src/app/controller/model/SoldAnnuelConge.model';
import {SoldAnnuelCongeCriteria} from 'src/app/controller/criteria/SoldAnnuelCongeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { EmployeService } from 'src/app/controller/service/Employe.service';

import {EmployeDto} from 'src/app/controller/model/Employe.model';


@Component({
  selector: 'app-sold-annuel-conge-list-admin',
  templateUrl: './sold-annuel-conge-list-admin.component.html'
})
export class SoldAnnuelCongeListAdminComponent extends AbstractListController<SoldAnnuelCongeDto, SoldAnnuelCongeCriteria, SoldAnnuelCongeService>  implements OnInit {

    fileName = 'SoldAnnuelConge';

    employes :Array<EmployeDto>;
  
    constructor(soldAnnuelCongeService: SoldAnnuelCongeService, private employeService: EmployeService) {
        super(soldAnnuelCongeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadEmploye();
    }

    public async loadSoldAnnuelConges(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('SoldAnnuelConge', 'list');
        isPermistted ? this.service.findAll().subscribe(soldAnnuelConges => this.items = soldAnnuelConges,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'employe?.id', header: 'Employe'},
            {field: 'annee', header: 'Annee'},
            {field: 'nbrJourTotale', header: 'Nbr jour totale'},
            {field: 'nbrJourConsome', header: 'Nbr jour consome'},
            {field: 'nbrJourRestant', header: 'Nbr jour restant'},
        ];
    }


    public async loadEmploye(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('SoldAnnuelConge', 'list');
        isPermistted ? this.employeService.findAll().subscribe(employes => this.employes = employes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: SoldAnnuelCongeDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                'Employe': e.employe?.id ,
                 'Annee': e.annee ,
                 'Nbr jour totale': e.nbrJourTotale ,
                 'Nbr jour consome': e.nbrJourConsome ,
                 'Nbr jour restant': e.nbrJourRestant ,
            }
        });

        this.criteriaData = [{
        //'Employe': this.criteria.employe?.id ? this.criteria.employe?.id : environment.emptyForExport ,
            'Annee Min': this.criteria.anneeMin ? this.criteria.anneeMin : environment.emptyForExport ,
            'Annee Max': this.criteria.anneeMax ? this.criteria.anneeMax : environment.emptyForExport ,
            'Nbr jour totale Min': this.criteria.nbrJourTotaleMin ? this.criteria.nbrJourTotaleMin : environment.emptyForExport ,
            'Nbr jour totale Max': this.criteria.nbrJourTotaleMax ? this.criteria.nbrJourTotaleMax : environment.emptyForExport ,
            'Nbr jour consome Min': this.criteria.nbrJourConsomeMin ? this.criteria.nbrJourConsomeMin : environment.emptyForExport ,
            'Nbr jour consome Max': this.criteria.nbrJourConsomeMax ? this.criteria.nbrJourConsomeMax : environment.emptyForExport ,
            'Nbr jour restant Min': this.criteria.nbrJourRestantMin ? this.criteria.nbrJourRestantMin : environment.emptyForExport ,
            'Nbr jour restant Max': this.criteria.nbrJourRestantMax ? this.criteria.nbrJourRestantMax : environment.emptyForExport ,
        }];
      }
}

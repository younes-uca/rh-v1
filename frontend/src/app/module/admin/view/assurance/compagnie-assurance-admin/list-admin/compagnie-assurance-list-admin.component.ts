import {Component, OnInit} from '@angular/core';
import {CompagnieAssuranceService} from 'src/app/controller/service/CompagnieAssurance.service';
import {CompagnieAssuranceDto} from 'src/app/controller/model/CompagnieAssurance.model';
import {CompagnieAssuranceCriteria} from 'src/app/controller/criteria/CompagnieAssuranceCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-compagnie-assurance-list-admin',
  templateUrl: './compagnie-assurance-list-admin.component.html'
})
export class CompagnieAssuranceListAdminComponent extends AbstractListController<CompagnieAssuranceDto, CompagnieAssuranceCriteria, CompagnieAssuranceService>  implements OnInit {

    fileName = 'CompagnieAssurance';

  
    constructor(compagnieAssuranceService: CompagnieAssuranceService) {
        super(compagnieAssuranceService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadCompagnieAssurances(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('CompagnieAssurance', 'list');
        isPermistted ? this.service.findAll().subscribe(compagnieAssurances => this.items = compagnieAssurances,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: CompagnieAssuranceDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
        }];
      }
}

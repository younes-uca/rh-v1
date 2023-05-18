import {Component, OnInit} from '@angular/core';
import {CategorieEmployeService} from 'src/app/controller/service/CategorieEmploye.service';
import {CategorieEmployeDto} from 'src/app/controller/model/CategorieEmploye.model';
import {CategorieEmployeCriteria} from 'src/app/controller/criteria/CategorieEmployeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-categorie-employe-list-admin',
  templateUrl: './categorie-employe-list-admin.component.html'
})
export class CategorieEmployeListAdminComponent extends AbstractListController<CategorieEmployeDto, CategorieEmployeCriteria, CategorieEmployeService>  implements OnInit {

    fileName = 'CategorieEmploye';

  
    constructor(categorieEmployeService: CategorieEmployeService) {
        super(categorieEmployeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadCategorieEmployes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('CategorieEmploye', 'list');
        isPermistted ? this.service.findAll().subscribe(categorieEmployes => this.items = categorieEmployes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: CategorieEmployeDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
                 'Description': e.description ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Description': this.criteria.description ? this.criteria.description : environment.emptyForExport ,
        }];
      }
}

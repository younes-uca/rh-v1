import {Component, OnInit} from '@angular/core';
import {TypeReclamationService} from 'src/app/controller/service/TypeReclamation.service';
import {TypeReclamationDto} from 'src/app/controller/model/TypeReclamation.model';
import {TypeReclamationCriteria} from 'src/app/controller/criteria/TypeReclamationCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-type-reclamation-list-admin',
  templateUrl: './type-reclamation-list-admin.component.html'
})
export class TypeReclamationListAdminComponent extends AbstractListController<TypeReclamationDto, TypeReclamationCriteria, TypeReclamationService>  implements OnInit {

    fileName = 'TypeReclamation';

  
    constructor(typeReclamationService: TypeReclamationService) {
        super(typeReclamationService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadTypeReclamations(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('TypeReclamation', 'list');
        isPermistted ? this.service.findAll().subscribe(typeReclamations => this.items = typeReclamations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: TypeReclamationDto) {
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

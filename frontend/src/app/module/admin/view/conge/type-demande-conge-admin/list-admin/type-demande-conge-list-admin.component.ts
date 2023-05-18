import {Component, OnInit} from '@angular/core';
import {TypeDemandeCongeService} from 'src/app/controller/service/TypeDemandeConge.service';
import {TypeDemandeCongeDto} from 'src/app/controller/model/TypeDemandeConge.model';
import {TypeDemandeCongeCriteria} from 'src/app/controller/criteria/TypeDemandeCongeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-type-demande-conge-list-admin',
  templateUrl: './type-demande-conge-list-admin.component.html'
})
export class TypeDemandeCongeListAdminComponent extends AbstractListController<TypeDemandeCongeDto, TypeDemandeCongeCriteria, TypeDemandeCongeService>  implements OnInit {

    fileName = 'TypeDemandeConge';

  
    constructor(typeDemandeCongeService: TypeDemandeCongeService) {
        super(typeDemandeCongeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadTypeDemandeConges(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('TypeDemandeConge', 'list');
        isPermistted ? this.service.findAll().subscribe(typeDemandeConges => this.items = typeDemandeConges,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'ref', header: 'Ref'},
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
            {field: 'nbrJourConge', header: 'Nbr jour conge'},
        ];
    }



	public initDuplicate(res: TypeDemandeCongeDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Ref': e.ref ,
                 'Code': e.code ,
                 'Libelle': e.libelle ,
                 'Nbr jour conge': e.nbrJourConge ,
            }
        });

        this.criteriaData = [{
            'Ref': this.criteria.ref ? this.criteria.ref : environment.emptyForExport ,
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Nbr jour conge Min': this.criteria.nbrJourCongeMin ? this.criteria.nbrJourCongeMin : environment.emptyForExport ,
            'Nbr jour conge Max': this.criteria.nbrJourCongeMax ? this.criteria.nbrJourCongeMax : environment.emptyForExport ,
        }];
      }
}

import {Component, OnInit} from '@angular/core';
import {LienParenteService} from 'src/app/controller/service/LienParente.service';
import {LienParenteDto} from 'src/app/controller/model/LienParente.model';
import {LienParenteCriteria} from 'src/app/controller/criteria/LienParenteCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-lien-parente-list-admin',
  templateUrl: './lien-parente-list-admin.component.html'
})
export class LienParenteListAdminComponent extends AbstractListController<LienParenteDto, LienParenteCriteria, LienParenteService>  implements OnInit {

    fileName = 'LienParente';

  
    constructor(lienParenteService: LienParenteService) {
        super(lienParenteService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadLienParentes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('LienParente', 'list');
        isPermistted ? this.service.findAll().subscribe(lienParentes => this.items = lienParentes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: LienParenteDto) {
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

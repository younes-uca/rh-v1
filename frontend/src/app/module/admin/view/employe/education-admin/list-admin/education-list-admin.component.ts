import {Component, OnInit} from '@angular/core';
import {EducationService} from 'src/app/controller/service/Education.service';
import {EducationDto} from 'src/app/controller/model/Education.model';
import {EducationCriteria} from 'src/app/controller/criteria/EducationCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-education-list-admin',
  templateUrl: './education-list-admin.component.html'
})
export class EducationListAdminComponent extends AbstractListController<EducationDto, EducationCriteria, EducationService>  implements OnInit {

    fileName = 'Education';

  
    constructor(educationService: EducationService) {
        super(educationService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadEducations(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Education', 'list');
        isPermistted ? this.service.findAll().subscribe(educations => this.items = educations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: EducationDto) {
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

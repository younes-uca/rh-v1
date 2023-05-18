import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {EducationService} from 'src/app/controller/service/Education.service';
import {EducationDto} from 'src/app/controller/model/Education.model';
import {EducationCriteria} from 'src/app/controller/criteria/EducationCriteria.model';

@Component({
  selector: 'app-education-view-admin',
  templateUrl: './education-view-admin.component.html'
})
export class EducationViewAdminComponent extends AbstractViewController<EducationDto, EducationCriteria, EducationService> implements OnInit {


    constructor(private educationService: EducationService){
        super(educationService);
    }

    ngOnInit(): void {
    }




}

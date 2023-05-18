import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {CompagnieAssuranceService} from 'src/app/controller/service/CompagnieAssurance.service';
import {CompagnieAssuranceDto} from 'src/app/controller/model/CompagnieAssurance.model';
import {CompagnieAssuranceCriteria} from 'src/app/controller/criteria/CompagnieAssuranceCriteria.model';

@Component({
  selector: 'app-compagnie-assurance-view-admin',
  templateUrl: './compagnie-assurance-view-admin.component.html'
})
export class CompagnieAssuranceViewAdminComponent extends AbstractViewController<CompagnieAssuranceDto, CompagnieAssuranceCriteria, CompagnieAssuranceService> implements OnInit {


    constructor(private compagnieAssuranceService: CompagnieAssuranceService){
        super(compagnieAssuranceService);
    }

    ngOnInit(): void {
    }




}

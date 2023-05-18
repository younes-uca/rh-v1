import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {CategorieEmployeService} from 'src/app/controller/service/CategorieEmploye.service';
import {CategorieEmployeDto} from 'src/app/controller/model/CategorieEmploye.model';
import {CategorieEmployeCriteria} from 'src/app/controller/criteria/CategorieEmployeCriteria.model';

@Component({
  selector: 'app-categorie-employe-view-admin',
  templateUrl: './categorie-employe-view-admin.component.html'
})
export class CategorieEmployeViewAdminComponent extends AbstractViewController<CategorieEmployeDto, CategorieEmployeCriteria, CategorieEmployeService> implements OnInit {


    constructor(private categorieEmployeService: CategorieEmployeService){
        super(categorieEmployeService);
    }

    ngOnInit(): void {
    }




}

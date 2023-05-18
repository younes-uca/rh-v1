import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {SexeService} from 'src/app/controller/service/Sexe.service';
import {SexeDto} from 'src/app/controller/model/Sexe.model';
import {SexeCriteria} from 'src/app/controller/criteria/SexeCriteria.model';

@Component({
  selector: 'app-sexe-view-admin',
  templateUrl: './sexe-view-admin.component.html'
})
export class SexeViewAdminComponent extends AbstractViewController<SexeDto, SexeCriteria, SexeService> implements OnInit {


    constructor(private sexeService: SexeService){
        super(sexeService);
    }

    ngOnInit(): void {
    }




}

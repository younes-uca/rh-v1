import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {LienParenteService} from 'src/app/controller/service/LienParente.service';
import {LienParenteDto} from 'src/app/controller/model/LienParente.model';
import {LienParenteCriteria} from 'src/app/controller/criteria/LienParenteCriteria.model';

@Component({
  selector: 'app-lien-parente-view-admin',
  templateUrl: './lien-parente-view-admin.component.html'
})
export class LienParenteViewAdminComponent extends AbstractViewController<LienParenteDto, LienParenteCriteria, LienParenteService> implements OnInit {


    constructor(private lienParenteService: LienParenteService){
        super(lienParenteService);
    }

    ngOnInit(): void {
    }




}

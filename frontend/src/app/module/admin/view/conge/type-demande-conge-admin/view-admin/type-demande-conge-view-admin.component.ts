import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {TypeDemandeCongeService} from 'src/app/controller/service/TypeDemandeConge.service';
import {TypeDemandeCongeDto} from 'src/app/controller/model/TypeDemandeConge.model';
import {TypeDemandeCongeCriteria} from 'src/app/controller/criteria/TypeDemandeCongeCriteria.model';

@Component({
  selector: 'app-type-demande-conge-view-admin',
  templateUrl: './type-demande-conge-view-admin.component.html'
})
export class TypeDemandeCongeViewAdminComponent extends AbstractViewController<TypeDemandeCongeDto, TypeDemandeCongeCriteria, TypeDemandeCongeService> implements OnInit {


    constructor(private typeDemandeCongeService: TypeDemandeCongeService){
        super(typeDemandeCongeService);
    }

    ngOnInit(): void {
    }




}

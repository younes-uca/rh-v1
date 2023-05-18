import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {TypeReclamationService} from 'src/app/controller/service/TypeReclamation.service';
import {TypeReclamationDto} from 'src/app/controller/model/TypeReclamation.model';
import {TypeReclamationCriteria} from 'src/app/controller/criteria/TypeReclamationCriteria.model';

@Component({
  selector: 'app-type-reclamation-view-admin',
  templateUrl: './type-reclamation-view-admin.component.html'
})
export class TypeReclamationViewAdminComponent extends AbstractViewController<TypeReclamationDto, TypeReclamationCriteria, TypeReclamationService> implements OnInit {


    constructor(private typeReclamationService: TypeReclamationService){
        super(typeReclamationService);
    }

    ngOnInit(): void {
    }




}

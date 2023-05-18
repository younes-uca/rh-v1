import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {EtatReclamationService} from 'src/app/controller/service/EtatReclamation.service';
import {EtatReclamationDto} from 'src/app/controller/model/EtatReclamation.model';
import {EtatReclamationCriteria} from 'src/app/controller/criteria/EtatReclamationCriteria.model';

@Component({
  selector: 'app-etat-reclamation-view-admin',
  templateUrl: './etat-reclamation-view-admin.component.html'
})
export class EtatReclamationViewAdminComponent extends AbstractViewController<EtatReclamationDto, EtatReclamationCriteria, EtatReclamationService> implements OnInit {


    constructor(private etatReclamationService: EtatReclamationService){
        super(etatReclamationService);
    }

    ngOnInit(): void {
    }




}

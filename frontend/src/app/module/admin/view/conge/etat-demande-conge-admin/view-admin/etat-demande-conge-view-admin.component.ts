import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {EtatDemandeCongeService} from 'src/app/controller/service/EtatDemandeConge.service';
import {EtatDemandeCongeDto} from 'src/app/controller/model/EtatDemandeConge.model';
import {EtatDemandeCongeCriteria} from 'src/app/controller/criteria/EtatDemandeCongeCriteria.model';

@Component({
  selector: 'app-etat-demande-conge-view-admin',
  templateUrl: './etat-demande-conge-view-admin.component.html'
})
export class EtatDemandeCongeViewAdminComponent extends AbstractViewController<EtatDemandeCongeDto, EtatDemandeCongeCriteria, EtatDemandeCongeService> implements OnInit {


    constructor(private etatDemandeCongeService: EtatDemandeCongeService){
        super(etatDemandeCongeService);
    }

    ngOnInit(): void {
    }




}

import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {VilleService} from 'src/app/controller/service/Ville.service';
import {VilleDto} from 'src/app/controller/model/Ville.model';
import {VilleCriteria} from 'src/app/controller/criteria/VilleCriteria.model';

@Component({
  selector: 'app-ville-view-admin',
  templateUrl: './ville-view-admin.component.html'
})
export class VilleViewAdminComponent extends AbstractViewController<VilleDto, VilleCriteria, VilleService> implements OnInit {


    constructor(private villeService: VilleService){
        super(villeService);
    }

    ngOnInit(): void {
    }




}

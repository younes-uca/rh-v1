import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {SiegeService} from 'src/app/controller/service/Siege.service';
import {SiegeDto} from 'src/app/controller/model/Siege.model';
import {SiegeCriteria} from 'src/app/controller/criteria/SiegeCriteria.model';

@Component({
  selector: 'app-siege-view-admin',
  templateUrl: './siege-view-admin.component.html'
})
export class SiegeViewAdminComponent extends AbstractViewController<SiegeDto, SiegeCriteria, SiegeService> implements OnInit {


    constructor(private siegeService: SiegeService){
        super(siegeService);
    }

    ngOnInit(): void {
    }




}

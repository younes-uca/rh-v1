import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PromotionService} from 'src/app/controller/service/Promotion.service';
import {PromotionDto} from 'src/app/controller/model/Promotion.model';
import {PromotionCriteria} from 'src/app/controller/criteria/PromotionCriteria.model';

@Component({
  selector: 'app-promotion-view-admin',
  templateUrl: './promotion-view-admin.component.html'
})
export class PromotionViewAdminComponent extends AbstractViewController<PromotionDto, PromotionCriteria, PromotionService> implements OnInit {


    constructor(private promotionService: PromotionService){
        super(promotionService);
    }

    ngOnInit(): void {
    }




}

import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {SoldAnnuelCongeService} from 'src/app/controller/service/SoldAnnuelConge.service';
import {SoldAnnuelCongeDto} from 'src/app/controller/model/SoldAnnuelConge.model';
import {SoldAnnuelCongeCriteria} from 'src/app/controller/criteria/SoldAnnuelCongeCriteria.model';

import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeService} from 'src/app/controller/service/Employe.service';
@Component({
  selector: 'app-sold-annuel-conge-view-admin',
  templateUrl: './sold-annuel-conge-view-admin.component.html'
})
export class SoldAnnuelCongeViewAdminComponent extends AbstractViewController<SoldAnnuelCongeDto, SoldAnnuelCongeCriteria, SoldAnnuelCongeService> implements OnInit {


    constructor(private soldAnnuelCongeService: SoldAnnuelCongeService, private employeService: EmployeService){
        super(soldAnnuelCongeService);
    }

    ngOnInit(): void {
        this.employe = new EmployeDto();
        this.employeService.findAll().subscribe((data) => this.employes = data);
    }


    get employe(): EmployeDto {
       return this.employeService.item;
    }
    set employe(value: EmployeDto) {
        this.employeService.item = value;
    }
    get employes():Array<EmployeDto> {
       return this.employeService.items;
    }
    set employes(value: Array<EmployeDto>) {
        this.employeService.items = value;
    }


}

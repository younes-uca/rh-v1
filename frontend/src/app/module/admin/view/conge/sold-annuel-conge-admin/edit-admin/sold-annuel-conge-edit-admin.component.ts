import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {SoldAnnuelCongeService} from 'src/app/controller/service/SoldAnnuelConge.service';
import {SoldAnnuelCongeDto} from 'src/app/controller/model/SoldAnnuelConge.model';
import {SoldAnnuelCongeCriteria} from 'src/app/controller/criteria/SoldAnnuelCongeCriteria.model';


import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeService} from 'src/app/controller/service/Employe.service';

@Component({
  selector: 'app-sold-annuel-conge-edit-admin',
  templateUrl: './sold-annuel-conge-edit-admin.component.html'
})
export class SoldAnnuelCongeEditAdminComponent extends AbstractEditController<SoldAnnuelCongeDto, SoldAnnuelCongeCriteria, SoldAnnuelCongeService>   implements OnInit {






    constructor( private soldAnnuelCongeService: SoldAnnuelCongeService , private employeService: EmployeService) {
        super(soldAnnuelCongeService);
    }

    ngOnInit(): void {
    this.employe = new EmployeDto();
    this.employeService.findAll().subscribe((data) => this.employes = data);
}


    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }




   get employe(): EmployeDto {
       return this.employeService.item;
   }
  set employe(value: EmployeDto) {
        this.employeService.item = value;
   }
   get employes(): Array<EmployeDto> {
        return this.employeService.items;
   }
   set employes(value: Array<EmployeDto>) {
        this.employeService.items = value;
   }
   get createEmployeDialog(): boolean {
       return this.employeService.createDialog;
   }
  set createEmployeDialog(value: boolean) {
       this.employeService.createDialog= value;
   }



}

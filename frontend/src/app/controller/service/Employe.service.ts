import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {EmployeDto} from '../model/Employe.model';
import {EmployeCriteria} from '../criteria/EmployeCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {CategorieEmployeDto} from '../model/CategorieEmploye.model';
import {DepartementDto} from '../model/Departement.model';
import {SexeDto} from '../model/Sexe.model';
import {EducationDto} from '../model/Education.model';
import {PromotionDto} from '../model/Promotion.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeService extends AbstractService<EmployeDto, EmployeCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/employe/');
    }

    public constrcutDto(): EmployeDto {
        return new EmployeDto();
    }

    public constrcutCriteria(): EmployeCriteria {
        return new EmployeCriteria();
    }
}

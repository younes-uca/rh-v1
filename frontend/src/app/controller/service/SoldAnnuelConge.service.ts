import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {SoldAnnuelCongeDto} from '../model/SoldAnnuelConge.model';
import {SoldAnnuelCongeCriteria} from '../criteria/SoldAnnuelCongeCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {EmployeDto} from '../model/Employe.model';

@Injectable({
  providedIn: 'root'
})
export class SoldAnnuelCongeService extends AbstractService<SoldAnnuelCongeDto, SoldAnnuelCongeCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/soldAnnuelConge/');
    }

    public constrcutDto(): SoldAnnuelCongeDto {
        return new SoldAnnuelCongeDto();
    }

    public constrcutCriteria(): SoldAnnuelCongeCriteria {
        return new SoldAnnuelCongeCriteria();
    }
}

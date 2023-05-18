import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {CompagnieAssuranceDto} from '../model/CompagnieAssurance.model';
import {CompagnieAssuranceCriteria} from '../criteria/CompagnieAssuranceCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class CompagnieAssuranceService extends AbstractService<CompagnieAssuranceDto, CompagnieAssuranceCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/compagnieAssurance/');
    }

    public constrcutDto(): CompagnieAssuranceDto {
        return new CompagnieAssuranceDto();
    }

    public constrcutCriteria(): CompagnieAssuranceCriteria {
        return new CompagnieAssuranceCriteria();
    }
}

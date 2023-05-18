import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {AssuranceDto} from '../model/Assurance.model';
import {AssuranceCriteria} from '../criteria/AssuranceCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {SocieteDto} from '../model/Societe.model';
import {LienParenteDto} from '../model/LienParente.model';
import {CompagnieAssuranceDto} from '../model/CompagnieAssurance.model';
import {EmployeDto} from '../model/Employe.model';

@Injectable({
  providedIn: 'root'
})
export class AssuranceService extends AbstractService<AssuranceDto, AssuranceCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/assurance/');
    }

    public constrcutDto(): AssuranceDto {
        return new AssuranceDto();
    }

    public constrcutCriteria(): AssuranceCriteria {
        return new AssuranceCriteria();
    }
}

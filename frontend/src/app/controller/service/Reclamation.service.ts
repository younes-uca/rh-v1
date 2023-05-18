import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {ReclamationDto} from '../model/Reclamation.model';
import {ReclamationCriteria} from '../criteria/ReclamationCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {TypeReclamationDto} from '../model/TypeReclamation.model';
import {EtatReclamationDto} from '../model/EtatReclamation.model';
import {EmployeDto} from '../model/Employe.model';

@Injectable({
  providedIn: 'root'
})
export class ReclamationService extends AbstractService<ReclamationDto, ReclamationCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/reclamation/');
    }

    public constrcutDto(): ReclamationDto {
        return new ReclamationDto();
    }

    public constrcutCriteria(): ReclamationCriteria {
        return new ReclamationCriteria();
    }
}

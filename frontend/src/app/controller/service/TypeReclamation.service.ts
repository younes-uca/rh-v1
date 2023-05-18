import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {TypeReclamationDto} from '../model/TypeReclamation.model';
import {TypeReclamationCriteria} from '../criteria/TypeReclamationCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class TypeReclamationService extends AbstractService<TypeReclamationDto, TypeReclamationCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/typeReclamation/');
    }

    public constrcutDto(): TypeReclamationDto {
        return new TypeReclamationDto();
    }

    public constrcutCriteria(): TypeReclamationCriteria {
        return new TypeReclamationCriteria();
    }
}

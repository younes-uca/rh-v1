import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {StationDto} from '../model/Station.model';
import {StationCriteria} from '../criteria/StationCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {DepartementDto} from '../model/Departement.model';
import {VilleDto} from '../model/Ville.model';
import {EmployeDto} from '../model/Employe.model';

@Injectable({
  providedIn: 'root'
})
export class StationService extends AbstractService<StationDto, StationCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/station/');
    }

    public constrcutDto(): StationDto {
        return new StationDto();
    }

    public constrcutCriteria(): StationCriteria {
        return new StationCriteria();
    }
}

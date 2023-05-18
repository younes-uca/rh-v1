import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {VilleDto} from '../model/Ville.model';
import {VilleCriteria} from '../criteria/VilleCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class VilleService extends AbstractService<VilleDto, VilleCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/ville/');
    }

    public constrcutDto(): VilleDto {
        return new VilleDto();
    }

    public constrcutCriteria(): VilleCriteria {
        return new VilleCriteria();
    }
}

import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {EtatDemandeCongeDto} from '../model/EtatDemandeConge.model';
import {EtatDemandeCongeCriteria} from '../criteria/EtatDemandeCongeCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class EtatDemandeCongeService extends AbstractService<EtatDemandeCongeDto, EtatDemandeCongeCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/etatDemandeConge/');
    }

    public constrcutDto(): EtatDemandeCongeDto {
        return new EtatDemandeCongeDto();
    }

    public constrcutCriteria(): EtatDemandeCongeCriteria {
        return new EtatDemandeCongeCriteria();
    }
}

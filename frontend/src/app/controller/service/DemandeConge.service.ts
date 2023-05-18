import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {DemandeCongeDto} from '../model/DemandeConge.model';
import {DemandeCongeCriteria} from '../criteria/DemandeCongeCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {EtatDemandeCongeDto} from '../model/EtatDemandeConge.model';
import {DepartementDto} from '../model/Departement.model';
import {TypeDemandeCongeDto} from '../model/TypeDemandeConge.model';
import {EmployeDto} from '../model/Employe.model';

@Injectable({
  providedIn: 'root'
})
export class DemandeCongeService extends AbstractService<DemandeCongeDto, DemandeCongeCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/demandeConge/');
    }

    public constrcutDto(): DemandeCongeDto {
        return new DemandeCongeDto();
    }

    public constrcutCriteria(): DemandeCongeCriteria {
        return new DemandeCongeCriteria();
    }
}

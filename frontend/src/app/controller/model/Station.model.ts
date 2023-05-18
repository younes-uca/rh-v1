import {DepartementDto} from './Departement.model';
import {VilleDto} from './Ville.model';
import {EmployeDto} from './Employe.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class StationDto  extends BaseDto{

    public id: number;
    public code: string;
    public adresse: string;
    public employe: EmployeDto ;
    public ville: VilleDto ;
     public departements: Array<DepartementDto>;

}

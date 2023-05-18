import {StationDto} from './Station.model';
import {EmployeDto} from './Employe.model';
import {SiegeDto} from './Siege.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class DepartementDto  extends BaseDto{

    public id: number;
   public nbrEmploye: number;
    public moyenneAge: number;
    public nbrEmployeMax: string ;
    public nbrEmployeMin: string ;
    public moyenneAgeMax: string ;
    public moyenneAgeMin: string ;
    public siege: SiegeDto ;
    public employe: EmployeDto ;
    public station: StationDto ;

}

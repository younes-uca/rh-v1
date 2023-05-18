import {StationCriteria} from './StationCriteria.model';
import {EmployeCriteria} from './EmployeCriteria.model';
import {SiegeCriteria} from './SiegeCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class DepartementCriteria  extends   BaseCriteria  {

    public id: number;
     public nbrEmploye: number;
     public nbrEmployeMin: number;
     public nbrEmployeMax: number;
     public moyenneAge: number;
     public moyenneAgeMin: number;
     public moyenneAgeMax: number;
  public siege: SiegeCriteria ;
  public sieges: Array<SiegeCriteria> ;
  public employe: EmployeCriteria ;
  public employes: Array<EmployeCriteria> ;
  public station: StationCriteria ;
  public stations: Array<StationCriteria> ;

}

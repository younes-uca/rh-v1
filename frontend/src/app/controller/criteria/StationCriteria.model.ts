import {DepartementCriteria} from './DepartementCriteria.model';
import {VilleCriteria} from './VilleCriteria.model';
import {EmployeCriteria} from './EmployeCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class StationCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public adresse: string;
    public adresseLike: string;
  public employe: EmployeCriteria ;
  public employes: Array<EmployeCriteria> ;
  public ville: VilleCriteria ;
  public villes: Array<VilleCriteria> ;
      public departements: Array<DepartementCriteria>;

}

import {EmployeCriteria} from './EmployeCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class SoldAnnuelCongeCriteria  extends   BaseCriteria  {

    public id: number;
     public annee: number;
     public anneeMin: number;
     public anneeMax: number;
     public nbrJourTotale: number;
     public nbrJourTotaleMin: number;
     public nbrJourTotaleMax: number;
     public nbrJourConsome: number;
     public nbrJourConsomeMin: number;
     public nbrJourConsomeMax: number;
     public nbrJourRestant: number;
     public nbrJourRestantMin: number;
     public nbrJourRestantMax: number;
  public employe: EmployeCriteria ;
  public employes: Array<EmployeCriteria> ;

}

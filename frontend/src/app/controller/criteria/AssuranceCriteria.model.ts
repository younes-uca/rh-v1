import {SocieteCriteria} from './SocieteCriteria.model';
import {LienParenteCriteria} from './LienParenteCriteria.model';
import {CompagnieAssuranceCriteria} from './CompagnieAssuranceCriteria.model';
import {EmployeCriteria} from './EmployeCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class AssuranceCriteria  extends   BaseCriteria  {

    public id: number;
    public numeroPolice: string;
    public numeroPoliceLike: string;
    public courtier: string;
    public courtierLike: string;
    public malade: string;
    public maladeLike: string;
    public dateConsultation: Date;
    public dateConsultationFrom: Date;
    public dateConsultationTo: Date;
    public dateTransmission: Date;
    public dateTransmissionFrom: Date;
    public dateTransmissionTo: Date;
    public natureBesoin: string;
    public natureBesoinLike: string;
     public fraisEnagage: number;
     public fraisEnagageMin: number;
     public fraisEnagageMax: number;
    public dateEnvoi: Date;
    public dateEnvoiFrom: Date;
    public dateEnvoiTo: Date;
    public observation: string;
    public observationLike: string;
  public societe: SocieteCriteria ;
  public societes: Array<SocieteCriteria> ;
  public compagnieAssurance: CompagnieAssuranceCriteria ;
  public compagnieAssurances: Array<CompagnieAssuranceCriteria> ;
  public employe: EmployeCriteria ;
  public employes: Array<EmployeCriteria> ;
  public lienParente: LienParenteCriteria ;
  public lienParentes: Array<LienParenteCriteria> ;

}

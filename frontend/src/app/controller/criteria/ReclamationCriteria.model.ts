import {TypeReclamationCriteria} from './TypeReclamationCriteria.model';
import {EtatReclamationCriteria} from './EtatReclamationCriteria.model';
import {EmployeCriteria} from './EmployeCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class ReclamationCriteria  extends   BaseCriteria  {

    public id: number;
    public reference: string;
    public referenceLike: string;
    public dateReclamation: Date;
    public dateReclamationFrom: Date;
    public dateReclamationTo: Date;
    public message: string;
    public messageLike: string;
    public dateTraitement: Date;
    public dateTraitementFrom: Date;
    public dateTraitementTo: Date;
    public dateReponse: Date;
    public dateReponseFrom: Date;
    public dateReponseTo: Date;
    public commentaireTraiteur: string;
    public commentaireTraiteurLike: string;
    public objetReclamation: string;
    public objetReclamationLike: string;
  public typeReclamation: TypeReclamationCriteria ;
  public typeReclamations: Array<TypeReclamationCriteria> ;
  public etatReclamation: EtatReclamationCriteria ;
  public etatReclamations: Array<EtatReclamationCriteria> ;
  public employe: EmployeCriteria ;
  public employes: Array<EmployeCriteria> ;

}

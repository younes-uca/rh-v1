import {TypeReclamationDto} from './TypeReclamation.model';
import {EtatReclamationDto} from './EtatReclamation.model';
import {EmployeDto} from './Employe.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class ReclamationDto  extends BaseDto{

    public id: number;
    public reference: string;
   public dateReclamation: Date;
    public message: string;
   public dateTraitement: Date;
   public dateReponse: Date;
    public commentaireTraiteur: string;
    public objetReclamation: string;
    public dateReclamationMax: string ;
    public dateReclamationMin: string ;
    public dateTraitementMax: string ;
    public dateTraitementMin: string ;
    public dateReponseMax: string ;
    public dateReponseMin: string ;
    public typeReclamation: TypeReclamationDto ;
    public etatReclamation: EtatReclamationDto ;
    public employe: EmployeDto ;

}

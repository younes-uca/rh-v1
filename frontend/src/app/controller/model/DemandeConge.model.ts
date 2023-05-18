import {EtatDemandeCongeDto} from './EtatDemandeConge.model';
import {DepartementDto} from './Departement.model';
import {TypeDemandeCongeDto} from './TypeDemandeConge.model';
import {EmployeDto} from './Employe.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class DemandeCongeDto  extends BaseDto{

    public id: number;
    public ref: string;
   public startTime: Date;
   public endTime: Date;
   public nbrJourConge: number;
    public startTimeMax: string ;
    public startTimeMin: string ;
    public endTimeMax: string ;
    public endTimeMin: string ;
    public nbrJourCongeMax: string ;
    public nbrJourCongeMin: string ;
    public employe: EmployeDto ;
    public departement: DepartementDto ;
    public etatDemandeConge: EtatDemandeCongeDto ;
    public typeDemandeConge: TypeDemandeCongeDto ;

}

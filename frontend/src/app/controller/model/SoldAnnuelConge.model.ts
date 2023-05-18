import {EmployeDto} from './Employe.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class SoldAnnuelCongeDto  extends BaseDto{

    public id: number;
   public annee: number;
   public nbrJourTotale: number;
   public nbrJourConsome: number;
   public nbrJourRestant: number;
    public anneeMax: string ;
    public anneeMin: string ;
    public nbrJourTotaleMax: string ;
    public nbrJourTotaleMin: string ;
    public nbrJourConsomeMax: string ;
    public nbrJourConsomeMin: string ;
    public nbrJourRestantMax: string ;
    public nbrJourRestantMin: string ;
    public employe: EmployeDto ;

}

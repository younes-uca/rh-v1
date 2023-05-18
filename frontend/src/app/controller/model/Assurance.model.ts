import {SocieteDto} from './Societe.model';
import {LienParenteDto} from './LienParente.model';
import {CompagnieAssuranceDto} from './CompagnieAssurance.model';
import {EmployeDto} from './Employe.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class AssuranceDto  extends BaseDto{

    public id: number;
    public numeroPolice: string;
    public courtier: string;
    public malade: string;
   public dateConsultation: Date;
   public dateTransmission: Date;
    public natureBesoin: string;
    public fraisEnagage: number;
   public dateEnvoi: Date;
    public observation: string;
    public dateConsultationMax: string ;
    public dateConsultationMin: string ;
    public dateTransmissionMax: string ;
    public dateTransmissionMin: string ;
    public fraisEnagageMax: string ;
    public fraisEnagageMin: string ;
    public dateEnvoiMax: string ;
    public dateEnvoiMin: string ;
    public societe: SocieteDto ;
    public compagnieAssurance: CompagnieAssuranceDto ;
    public employe: EmployeDto ;
    public lienParente: LienParenteDto ;

}

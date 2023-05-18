import {CategorieEmployeDto} from './CategorieEmploye.model';
import {DepartementDto} from './Departement.model';
import {SexeDto} from './Sexe.model';
import {EducationDto} from './Education.model';
import {PromotionDto} from './Promotion.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class EmployeDto  extends BaseDto{

    public id: number;
    public identifiantJlinx: string;
    public matricule: string;
    public prenom: string;
    public nom: string;
    public situation: string;
   public dateNaissance: Date;
    public adresse: string;
    public ville: string;
    public cin: string;
    public numeroAdhesion: string;
    public email: string;
    public rib: string;
   public age: number;
    public numeroTelephone: string;
    public emergencyContact: string;
    public numeroSecuriteSociale: string;
    public warnningNotice: string;
    public cost: number;
    public assuranceCost: number;
   public etude: null | boolean;
   public experience: null | boolean;
    public salaire: number;
    public dateNaissanceMax: string ;
    public dateNaissanceMin: string ;
    public ageMax: string ;
    public ageMin: string ;
    public costMax: string ;
    public costMin: string ;
    public assuranceCostMax: string ;
    public assuranceCostMin: string ;
    public salaireMax: string ;
    public salaireMin: string ;
    public sexe: SexeDto ;
    public departement: DepartementDto ;
    public categorieEmploye: CategorieEmployeDto ;
    public promotion: PromotionDto ;
    public education: EducationDto ;

}

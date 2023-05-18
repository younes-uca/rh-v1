import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PromotionDto  extends BaseDto{

    public id: number;
    public code: string;
    public libelle: string;
   public dateDebutProfession: Date;
   public dateDebutContrat: Date;
    public dateDebutProfessionMax: string ;
    public dateDebutProfessionMin: string ;
    public dateDebutContratMax: string ;
    public dateDebutContratMin: string ;

}

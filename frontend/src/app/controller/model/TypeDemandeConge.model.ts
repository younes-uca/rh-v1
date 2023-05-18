import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class TypeDemandeCongeDto  extends BaseDto{

    public id: number;
    public ref: string;
    public code: string;
    public libelle: string;
   public nbrJourConge: number;
    public nbrJourCongeMax: string ;
    public nbrJourCongeMin: string ;

}

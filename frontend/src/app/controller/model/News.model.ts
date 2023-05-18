import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class NewsDto  extends BaseDto{

    public id: number;
    public ref: string;
    public libelle: string;
    public image: string;
    public description: string;
   public dateNews: Date;
   public archive: null | boolean;
   public numeroOrdre: number;
    public destinataire: string;
    public dateNewsMax: string ;
    public dateNewsMin: string ;
    public numeroOrdreMax: string ;
    public numeroOrdreMin: string ;

}

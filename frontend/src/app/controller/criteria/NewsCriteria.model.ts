import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class NewsCriteria  extends   BaseCriteria  {

    public id: number;
    public ref: string;
    public refLike: string;
    public libelle: string;
    public libelleLike: string;
    public image: string;
    public imageLike: string;
    public description: string;
    public descriptionLike: string;
    public dateNews: Date;
    public dateNewsFrom: Date;
    public dateNewsTo: Date;
    public archive: null | boolean;
     public numeroOrdre: number;
     public numeroOrdreMin: number;
     public numeroOrdreMax: number;
    public destinataire: string;
    public destinataireLike: string;

}

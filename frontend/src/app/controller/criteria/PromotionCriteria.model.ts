import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class PromotionCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public libelle: string;
    public libelleLike: string;
    public dateDebutProfession: Date;
    public dateDebutProfessionFrom: Date;
    public dateDebutProfessionTo: Date;
    public dateDebutContrat: Date;
    public dateDebutContratFrom: Date;
    public dateDebutContratTo: Date;

}

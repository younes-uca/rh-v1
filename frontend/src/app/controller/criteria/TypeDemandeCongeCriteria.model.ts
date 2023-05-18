import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class TypeDemandeCongeCriteria  extends   BaseCriteria  {

    public id: number;
    public ref: string;
    public refLike: string;
    public code: string;
    public codeLike: string;
    public libelle: string;
    public libelleLike: string;
     public nbrJourConge: number;
     public nbrJourCongeMin: number;
     public nbrJourCongeMax: number;

}

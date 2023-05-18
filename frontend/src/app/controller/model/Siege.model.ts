import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class SiegeDto  extends BaseDto{

    public id: number;
    public code: string;
    public libelle: string;
    public adresse: string;
    public description: string;

}

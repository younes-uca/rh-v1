package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;

public class SiegeCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private String adresse;
    private String adresseLike;
    private String description;
    private String descriptionLike;



    public SiegeCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getAdresseLike(){
        return this.adresseLike;
    }
    public void setAdresseLike(String adresseLike){
        this.adresseLike = adresseLike;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }


}

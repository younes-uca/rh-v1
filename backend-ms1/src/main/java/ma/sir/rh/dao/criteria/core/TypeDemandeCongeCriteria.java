package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;

public class TypeDemandeCongeCriteria extends  BaseCriteria  {

    private String ref;
    private String refLike;
    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private String nbrJourConge;
    private String nbrJourCongeMin;
    private String nbrJourCongeMax;



    public TypeDemandeCongeCriteria(){}

    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getRefLike(){
        return this.refLike;
    }
    public void setRefLike(String refLike){
        this.refLike = refLike;
    }

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

    public String getNbrJourConge(){
        return this.nbrJourConge;
    }
    public void setNbrJourConge(String nbrJourConge){
        this.nbrJourConge = nbrJourConge;
    }   
    public String getNbrJourCongeMin(){
        return this.nbrJourCongeMin;
    }
    public void setNbrJourCongeMin(String nbrJourCongeMin){
        this.nbrJourCongeMin = nbrJourCongeMin;
    }
    public String getNbrJourCongeMax(){
        return this.nbrJourCongeMax;
    }
    public void setNbrJourCongeMax(String nbrJourCongeMax){
        this.nbrJourCongeMax = nbrJourCongeMax;
    }
      

}

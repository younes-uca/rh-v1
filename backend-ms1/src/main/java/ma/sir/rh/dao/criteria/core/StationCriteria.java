package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;

public class StationCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String adresse;
    private String adresseLike;

    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;
    private VilleCriteria ville ;
    private List<VilleCriteria> villes ;


    public StationCriteria(){}

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


    public EmployeCriteria getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeCriteria employe){
        this.employe = employe;
    }
    public List<EmployeCriteria> getEmployes(){
        return this.employes;
    }

    public void setEmployes(List<EmployeCriteria> employes){
        this.employes = employes;
    }
    public VilleCriteria getVille(){
        return this.ville;
    }

    public void setVille(VilleCriteria ville){
        this.ville = ville;
    }
    public List<VilleCriteria> getVilles(){
        return this.villes;
    }

    public void setVilles(List<VilleCriteria> villes){
        this.villes = villes;
    }
}

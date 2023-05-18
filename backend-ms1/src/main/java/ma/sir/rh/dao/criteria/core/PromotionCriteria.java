package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PromotionCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private LocalDateTime dateDebutProfession;
    private LocalDateTime dateDebutProfessionFrom;
    private LocalDateTime dateDebutProfessionTo;
    private LocalDateTime dateDebutContrat;
    private LocalDateTime dateDebutContratFrom;
    private LocalDateTime dateDebutContratTo;



    public PromotionCriteria(){}

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

    public LocalDateTime getDateDebutProfession(){
        return this.dateDebutProfession;
    }
    public void setDateDebutProfession(LocalDateTime dateDebutProfession){
        this.dateDebutProfession = dateDebutProfession;
    }
    public LocalDateTime getDateDebutProfessionFrom(){
        return this.dateDebutProfessionFrom;
    }
    public void setDateDebutProfessionFrom(LocalDateTime dateDebutProfessionFrom){
        this.dateDebutProfessionFrom = dateDebutProfessionFrom;
    }
    public LocalDateTime getDateDebutProfessionTo(){
        return this.dateDebutProfessionTo;
    }
    public void setDateDebutProfessionTo(LocalDateTime dateDebutProfessionTo){
        this.dateDebutProfessionTo = dateDebutProfessionTo;
    }
    public LocalDateTime getDateDebutContrat(){
        return this.dateDebutContrat;
    }
    public void setDateDebutContrat(LocalDateTime dateDebutContrat){
        this.dateDebutContrat = dateDebutContrat;
    }
    public LocalDateTime getDateDebutContratFrom(){
        return this.dateDebutContratFrom;
    }
    public void setDateDebutContratFrom(LocalDateTime dateDebutContratFrom){
        this.dateDebutContratFrom = dateDebutContratFrom;
    }
    public LocalDateTime getDateDebutContratTo(){
        return this.dateDebutContratTo;
    }
    public void setDateDebutContratTo(LocalDateTime dateDebutContratTo){
        this.dateDebutContratTo = dateDebutContratTo;
    }

}

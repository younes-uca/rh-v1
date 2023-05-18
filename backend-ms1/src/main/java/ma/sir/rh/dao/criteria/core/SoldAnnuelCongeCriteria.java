package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;

public class SoldAnnuelCongeCriteria extends  BaseCriteria  {

    private String annee;
    private String anneeMin;
    private String anneeMax;
    private String nbrJourTotale;
    private String nbrJourTotaleMin;
    private String nbrJourTotaleMax;
    private String nbrJourConsome;
    private String nbrJourConsomeMin;
    private String nbrJourConsomeMax;
    private String nbrJourRestant;
    private String nbrJourRestantMin;
    private String nbrJourRestantMax;

    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;


    public SoldAnnuelCongeCriteria(){}

    public String getAnnee(){
        return this.annee;
    }
    public void setAnnee(String annee){
        this.annee = annee;
    }   
    public String getAnneeMin(){
        return this.anneeMin;
    }
    public void setAnneeMin(String anneeMin){
        this.anneeMin = anneeMin;
    }
    public String getAnneeMax(){
        return this.anneeMax;
    }
    public void setAnneeMax(String anneeMax){
        this.anneeMax = anneeMax;
    }
      
    public String getNbrJourTotale(){
        return this.nbrJourTotale;
    }
    public void setNbrJourTotale(String nbrJourTotale){
        this.nbrJourTotale = nbrJourTotale;
    }   
    public String getNbrJourTotaleMin(){
        return this.nbrJourTotaleMin;
    }
    public void setNbrJourTotaleMin(String nbrJourTotaleMin){
        this.nbrJourTotaleMin = nbrJourTotaleMin;
    }
    public String getNbrJourTotaleMax(){
        return this.nbrJourTotaleMax;
    }
    public void setNbrJourTotaleMax(String nbrJourTotaleMax){
        this.nbrJourTotaleMax = nbrJourTotaleMax;
    }
      
    public String getNbrJourConsome(){
        return this.nbrJourConsome;
    }
    public void setNbrJourConsome(String nbrJourConsome){
        this.nbrJourConsome = nbrJourConsome;
    }   
    public String getNbrJourConsomeMin(){
        return this.nbrJourConsomeMin;
    }
    public void setNbrJourConsomeMin(String nbrJourConsomeMin){
        this.nbrJourConsomeMin = nbrJourConsomeMin;
    }
    public String getNbrJourConsomeMax(){
        return this.nbrJourConsomeMax;
    }
    public void setNbrJourConsomeMax(String nbrJourConsomeMax){
        this.nbrJourConsomeMax = nbrJourConsomeMax;
    }
      
    public String getNbrJourRestant(){
        return this.nbrJourRestant;
    }
    public void setNbrJourRestant(String nbrJourRestant){
        this.nbrJourRestant = nbrJourRestant;
    }   
    public String getNbrJourRestantMin(){
        return this.nbrJourRestantMin;
    }
    public void setNbrJourRestantMin(String nbrJourRestantMin){
        this.nbrJourRestantMin = nbrJourRestantMin;
    }
    public String getNbrJourRestantMax(){
        return this.nbrJourRestantMax;
    }
    public void setNbrJourRestantMax(String nbrJourRestantMax){
        this.nbrJourRestantMax = nbrJourRestantMax;
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
}

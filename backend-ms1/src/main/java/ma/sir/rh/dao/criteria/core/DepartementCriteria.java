package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;

public class DepartementCriteria extends  BaseCriteria  {

    private String nbrEmploye;
    private String nbrEmployeMin;
    private String nbrEmployeMax;
    private String moyenneAge;
    private String moyenneAgeMin;
    private String moyenneAgeMax;

    private SiegeCriteria siege ;
    private List<SiegeCriteria> sieges ;
    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;
    private StationCriteria station ;
    private List<StationCriteria> stations ;


    public DepartementCriteria(){}

    public String getNbrEmploye(){
        return this.nbrEmploye;
    }
    public void setNbrEmploye(String nbrEmploye){
        this.nbrEmploye = nbrEmploye;
    }   
    public String getNbrEmployeMin(){
        return this.nbrEmployeMin;
    }
    public void setNbrEmployeMin(String nbrEmployeMin){
        this.nbrEmployeMin = nbrEmployeMin;
    }
    public String getNbrEmployeMax(){
        return this.nbrEmployeMax;
    }
    public void setNbrEmployeMax(String nbrEmployeMax){
        this.nbrEmployeMax = nbrEmployeMax;
    }
      
    public String getMoyenneAge(){
        return this.moyenneAge;
    }
    public void setMoyenneAge(String moyenneAge){
        this.moyenneAge = moyenneAge;
    }   
    public String getMoyenneAgeMin(){
        return this.moyenneAgeMin;
    }
    public void setMoyenneAgeMin(String moyenneAgeMin){
        this.moyenneAgeMin = moyenneAgeMin;
    }
    public String getMoyenneAgeMax(){
        return this.moyenneAgeMax;
    }
    public void setMoyenneAgeMax(String moyenneAgeMax){
        this.moyenneAgeMax = moyenneAgeMax;
    }
      

    public SiegeCriteria getSiege(){
        return this.siege;
    }

    public void setSiege(SiegeCriteria siege){
        this.siege = siege;
    }
    public List<SiegeCriteria> getSieges(){
        return this.sieges;
    }

    public void setSieges(List<SiegeCriteria> sieges){
        this.sieges = sieges;
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
    public StationCriteria getStation(){
        return this.station;
    }

    public void setStation(StationCriteria station){
        this.station = station;
    }
    public List<StationCriteria> getStations(){
        return this.stations;
    }

    public void setStations(List<StationCriteria> stations){
        this.stations = stations;
    }
}

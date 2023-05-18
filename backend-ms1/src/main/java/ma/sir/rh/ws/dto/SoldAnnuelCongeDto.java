package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class SoldAnnuelCongeDto  extends AuditBaseDto {

    private Integer annee  = 0 ;
    private Integer nbrJourTotale  = 0 ;
    private Integer nbrJourConsome  = 0 ;
    private Integer nbrJourRestant  = 0 ;

    private EmployeDto employe ;



    public SoldAnnuelCongeDto(){
        super();
    }



    @Log
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }

    @Log
    public Integer getNbrJourTotale(){
        return this.nbrJourTotale;
    }
    public void setNbrJourTotale(Integer nbrJourTotale){
        this.nbrJourTotale = nbrJourTotale;
    }

    @Log
    public Integer getNbrJourConsome(){
        return this.nbrJourConsome;
    }
    public void setNbrJourConsome(Integer nbrJourConsome){
        this.nbrJourConsome = nbrJourConsome;
    }

    @Log
    public Integer getNbrJourRestant(){
        return this.nbrJourRestant;
    }
    public void setNbrJourRestant(Integer nbrJourRestant){
        this.nbrJourRestant = nbrJourRestant;
    }


    public EmployeDto getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeDto employe){
        this.employe = employe;
    }




}

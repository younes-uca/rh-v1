package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepartementDto  extends AuditBaseDto {

    private Integer nbrEmploye  = 0 ;
    private BigDecimal moyenneAge  ;

    private SiegeDto siege ;
    private EmployeDto employe ;
    private StationDto station ;



    public DepartementDto(){
        super();
    }



    @Log
    public Integer getNbrEmploye(){
        return this.nbrEmploye;
    }
    public void setNbrEmploye(Integer nbrEmploye){
        this.nbrEmploye = nbrEmploye;
    }

    @Log
    public BigDecimal getMoyenneAge(){
        return this.moyenneAge;
    }
    public void setMoyenneAge(BigDecimal moyenneAge){
        this.moyenneAge = moyenneAge;
    }


    public SiegeDto getSiege(){
        return this.siege;
    }

    public void setSiege(SiegeDto siege){
        this.siege = siege;
    }
    public EmployeDto getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeDto employe){
        this.employe = employe;
    }
    public StationDto getStation(){
        return this.station;
    }

    public void setStation(StationDto station){
        this.station = station;
    }




}

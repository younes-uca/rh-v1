package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class StationDto  extends AuditBaseDto {

    private String code  ;
    private String adresse  ;

    private EmployeDto employe ;
    private VilleDto ville ;

    private List<DepartementDto> departements ;


    public StationDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }


    public EmployeDto getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeDto employe){
        this.employe = employe;
    }
    public VilleDto getVille(){
        return this.ville;
    }

    public void setVille(VilleDto ville){
        this.ville = ville;
    }



    public List<DepartementDto> getDepartements(){
        return this.departements;
    }

    public void setDepartements(List<DepartementDto> departements){
        this.departements = departements;
    }

}

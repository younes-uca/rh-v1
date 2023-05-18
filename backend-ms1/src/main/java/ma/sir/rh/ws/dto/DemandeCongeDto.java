package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DemandeCongeDto  extends AuditBaseDto {

    private String ref  ;
    private String startTime ;
    private String endTime ;
    private Integer nbrJourConge  = 0 ;

    private EmployeDto employe ;
    private DepartementDto departement ;
    private EtatDemandeCongeDto etatDemandeConge ;
    private TypeDemandeCongeDto typeDemandeConge ;



    public DemandeCongeDto(){
        super();
    }



    @Log
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getStartTime(){
        return this.startTime;
    }
    public void setStartTime(String startTime){
        this.startTime = startTime;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getEndTime(){
        return this.endTime;
    }
    public void setEndTime(String endTime){
        this.endTime = endTime;
    }

    @Log
    public Integer getNbrJourConge(){
        return this.nbrJourConge;
    }
    public void setNbrJourConge(Integer nbrJourConge){
        this.nbrJourConge = nbrJourConge;
    }


    public EmployeDto getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeDto employe){
        this.employe = employe;
    }
    public DepartementDto getDepartement(){
        return this.departement;
    }

    public void setDepartement(DepartementDto departement){
        this.departement = departement;
    }
    public EtatDemandeCongeDto getEtatDemandeConge(){
        return this.etatDemandeConge;
    }

    public void setEtatDemandeConge(EtatDemandeCongeDto etatDemandeConge){
        this.etatDemandeConge = etatDemandeConge;
    }
    public TypeDemandeCongeDto getTypeDemandeConge(){
        return this.typeDemandeConge;
    }

    public void setTypeDemandeConge(TypeDemandeCongeDto typeDemandeConge){
        this.typeDemandeConge = typeDemandeConge;
    }




}

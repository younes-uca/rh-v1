package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssuranceDto  extends AuditBaseDto {

    private String numeroPolice  ;
    private String courtier  ;
    private String malade  ;
    private String dateConsultation ;
    private String dateTransmission ;
    private String natureBesoin  ;
    private BigDecimal fraisEnagage  ;
    private String dateEnvoi ;
    private String observation  ;

    private SocieteDto societe ;
    private CompagnieAssuranceDto compagnieAssurance ;
    private EmployeDto employe ;
    private LienParenteDto lienParente ;



    public AssuranceDto(){
        super();
    }



    @Log
    public String getNumeroPolice(){
        return this.numeroPolice;
    }
    public void setNumeroPolice(String numeroPolice){
        this.numeroPolice = numeroPolice;
    }

    @Log
    public String getCourtier(){
        return this.courtier;
    }
    public void setCourtier(String courtier){
        this.courtier = courtier;
    }

    @Log
    public String getMalade(){
        return this.malade;
    }
    public void setMalade(String malade){
        this.malade = malade;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateConsultation(){
        return this.dateConsultation;
    }
    public void setDateConsultation(String dateConsultation){
        this.dateConsultation = dateConsultation;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateTransmission(){
        return this.dateTransmission;
    }
    public void setDateTransmission(String dateTransmission){
        this.dateTransmission = dateTransmission;
    }

    @Log
    public String getNatureBesoin(){
        return this.natureBesoin;
    }
    public void setNatureBesoin(String natureBesoin){
        this.natureBesoin = natureBesoin;
    }

    @Log
    public BigDecimal getFraisEnagage(){
        return this.fraisEnagage;
    }
    public void setFraisEnagage(BigDecimal fraisEnagage){
        this.fraisEnagage = fraisEnagage;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEnvoi(){
        return this.dateEnvoi;
    }
    public void setDateEnvoi(String dateEnvoi){
        this.dateEnvoi = dateEnvoi;
    }

    @Log
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
        this.observation = observation;
    }


    public SocieteDto getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteDto societe){
        this.societe = societe;
    }
    public CompagnieAssuranceDto getCompagnieAssurance(){
        return this.compagnieAssurance;
    }

    public void setCompagnieAssurance(CompagnieAssuranceDto compagnieAssurance){
        this.compagnieAssurance = compagnieAssurance;
    }
    public EmployeDto getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeDto employe){
        this.employe = employe;
    }
    public LienParenteDto getLienParente(){
        return this.lienParente;
    }

    public void setLienParente(LienParenteDto lienParente){
        this.lienParente = lienParente;
    }




}

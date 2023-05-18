package ma.sir.rh.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "assurance")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="assurance_seq",sequenceName="assurance_seq",allocationSize=1, initialValue = 1)
public class Assurance   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String numeroPolice;
    @Column(length = 500)
    private String courtier;
    @Column(length = 500)
    private String malade;
    private LocalDateTime dateConsultation ;
    private LocalDateTime dateTransmission ;
    @Column(length = 500)
    private String natureBesoin;
    private BigDecimal fraisEnagage = BigDecimal.ZERO;
    private LocalDateTime dateEnvoi ;
    @Column(length = 500)
    private String observation;

    private Societe societe ;
    
    private CompagnieAssurance compagnieAssurance ;
    
    private Employe employe ;
    
    private LienParente lienParente ;
    


    public Assurance(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="assurance_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Societe getSociete(){
        return this.societe;
    }
    public void setSociete(Societe societe){
        this.societe = societe;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public CompagnieAssurance getCompagnieAssurance(){
        return this.compagnieAssurance;
    }
    public void setCompagnieAssurance(CompagnieAssurance compagnieAssurance){
        this.compagnieAssurance = compagnieAssurance;
    }
    public String getNumeroPolice(){
        return this.numeroPolice;
    }
    public void setNumeroPolice(String numeroPolice){
        this.numeroPolice = numeroPolice;
    }
    public String getCourtier(){
        return this.courtier;
    }
    public void setCourtier(String courtier){
        this.courtier = courtier;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }
    public String getMalade(){
        return this.malade;
    }
    public void setMalade(String malade){
        this.malade = malade;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public LienParente getLienParente(){
        return this.lienParente;
    }
    public void setLienParente(LienParente lienParente){
        this.lienParente = lienParente;
    }
    public LocalDateTime getDateConsultation(){
        return this.dateConsultation;
    }
    public void setDateConsultation(LocalDateTime dateConsultation){
        this.dateConsultation = dateConsultation;
    }
    public LocalDateTime getDateTransmission(){
        return this.dateTransmission;
    }
    public void setDateTransmission(LocalDateTime dateTransmission){
        this.dateTransmission = dateTransmission;
    }
    public String getNatureBesoin(){
        return this.natureBesoin;
    }
    public void setNatureBesoin(String natureBesoin){
        this.natureBesoin = natureBesoin;
    }
    public BigDecimal getFraisEnagage(){
        return this.fraisEnagage;
    }
    public void setFraisEnagage(BigDecimal fraisEnagage){
        this.fraisEnagage = fraisEnagage;
    }
    public LocalDateTime getDateEnvoi(){
        return this.dateEnvoi;
    }
    public void setDateEnvoi(LocalDateTime dateEnvoi){
        this.dateEnvoi = dateEnvoi;
    }
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
        this.observation = observation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assurance assurance = (Assurance) o;
        return id != null && id.equals(assurance.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


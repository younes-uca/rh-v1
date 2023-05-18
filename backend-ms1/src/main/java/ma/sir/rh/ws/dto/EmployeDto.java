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
public class EmployeDto  extends AuditBaseDto {

    private String identifiantJlinx  ;
    private String matricule  ;
    private String prenom  ;
    private String nom  ;
    private String situation  ;
    private String dateNaissance ;
    private String adresse  ;
    private String ville  ;
    private String cin  ;
    private String numeroAdhesion  ;
    private String email  ;
    private String rib  ;
    private Integer age  = 0 ;
    private String numeroTelephone  ;
    private String emergencyContact  ;
    private String numeroSecuriteSociale  ;
    private String warnningNotice  ;
    private BigDecimal cost  ;
    private BigDecimal assuranceCost  ;
    private Boolean etude  ;
    private Boolean experience  ;
    private BigDecimal salaire  ;

    private SexeDto sexe ;
    private DepartementDto departement ;
    private CategorieEmployeDto categorieEmploye ;
    private PromotionDto promotion ;
    private EducationDto education ;



    public EmployeDto(){
        super();
    }



    @Log
    public String getIdentifiantJlinx(){
        return this.identifiantJlinx;
    }
    public void setIdentifiantJlinx(String identifiantJlinx){
        this.identifiantJlinx = identifiantJlinx;
    }

    @Log
    public String getMatricule(){
        return this.matricule;
    }
    public void setMatricule(String matricule){
        this.matricule = matricule;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public String getSituation(){
        return this.situation;
    }
    public void setSituation(String situation){
        this.situation = situation;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(String dateNaissance){
        this.dateNaissance = dateNaissance;
    }

    @Log
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    @Log
    public String getVille(){
        return this.ville;
    }
    public void setVille(String ville){
        this.ville = ville;
    }

    @Log
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }

    @Log
    public String getNumeroAdhesion(){
        return this.numeroAdhesion;
    }
    public void setNumeroAdhesion(String numeroAdhesion){
        this.numeroAdhesion = numeroAdhesion;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Log
    public String getRib(){
        return this.rib;
    }
    public void setRib(String rib){
        this.rib = rib;
    }

    @Log
    public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    @Log
    public String getNumeroTelephone(){
        return this.numeroTelephone;
    }
    public void setNumeroTelephone(String numeroTelephone){
        this.numeroTelephone = numeroTelephone;
    }

    @Log
    public String getEmergencyContact(){
        return this.emergencyContact;
    }
    public void setEmergencyContact(String emergencyContact){
        this.emergencyContact = emergencyContact;
    }

    @Log
    public String getNumeroSecuriteSociale(){
        return this.numeroSecuriteSociale;
    }
    public void setNumeroSecuriteSociale(String numeroSecuriteSociale){
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    @Log
    public String getWarnningNotice(){
        return this.warnningNotice;
    }
    public void setWarnningNotice(String warnningNotice){
        this.warnningNotice = warnningNotice;
    }

    @Log
    public BigDecimal getCost(){
        return this.cost;
    }
    public void setCost(BigDecimal cost){
        this.cost = cost;
    }

    @Log
    public BigDecimal getAssuranceCost(){
        return this.assuranceCost;
    }
    public void setAssuranceCost(BigDecimal assuranceCost){
        this.assuranceCost = assuranceCost;
    }

    @Log
    public Boolean getEtude(){
        return this.etude;
    }
    public void setEtude(Boolean etude){
        this.etude = etude;
    }

    @Log
    public Boolean getExperience(){
        return this.experience;
    }
    public void setExperience(Boolean experience){
        this.experience = experience;
    }

    @Log
    public BigDecimal getSalaire(){
        return this.salaire;
    }
    public void setSalaire(BigDecimal salaire){
        this.salaire = salaire;
    }


    public SexeDto getSexe(){
        return this.sexe;
    }

    public void setSexe(SexeDto sexe){
        this.sexe = sexe;
    }
    public DepartementDto getDepartement(){
        return this.departement;
    }

    public void setDepartement(DepartementDto departement){
        this.departement = departement;
    }
    public CategorieEmployeDto getCategorieEmploye(){
        return this.categorieEmploye;
    }

    public void setCategorieEmploye(CategorieEmployeDto categorieEmploye){
        this.categorieEmploye = categorieEmploye;
    }
    public PromotionDto getPromotion(){
        return this.promotion;
    }

    public void setPromotion(PromotionDto promotion){
        this.promotion = promotion;
    }
    public EducationDto getEducation(){
        return this.education;
    }

    public void setEducation(EducationDto education){
        this.education = education;
    }




}

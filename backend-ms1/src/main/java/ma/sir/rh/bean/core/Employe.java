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
@Table(name = "employe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="employe_seq",sequenceName="employe_seq",allocationSize=1, initialValue = 1)
public class Employe   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String identifiantJlinx;
    @Column(length = 500)
    private String matricule;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String situation;
    private LocalDateTime dateNaissance ;
    @Column(length = 500)
    private String adresse;
    @Column(length = 500)
    private String ville;
    @Column(length = 500)
    private String cin;
    @Column(length = 500)
    private String numeroAdhesion;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String rib;
    private Integer age = 0;
    @Column(length = 500)
    private String numeroTelephone;
    @Column(length = 500)
    private String emergencyContact;
    @Column(length = 500)
    private String numeroSecuriteSociale;
    @Column(length = 500)
    private String warnningNotice;
    private BigDecimal cost = BigDecimal.ZERO;
    private BigDecimal assuranceCost = BigDecimal.ZERO;
    @Column(columnDefinition = "boolean default false")
    private Boolean etude = false;
    @Column(columnDefinition = "boolean default false")
    private Boolean experience = false;
    private BigDecimal salaire = BigDecimal.ZERO;

    private Sexe sexe ;
    
    private Departement departement ;
    
    private CategorieEmploye categorieEmploye ;
    
    private Promotion promotion ;
    
    private Education education ;
    


    public Employe(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="employe_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getIdentifiantJlinx(){
        return this.identifiantJlinx;
    }
    public void setIdentifiantJlinx(String identifiantJlinx){
        this.identifiantJlinx = identifiantJlinx;
    }
    public String getMatricule(){
        return this.matricule;
    }
    public void setMatricule(String matricule){
        this.matricule = matricule;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getSituation(){
        return this.situation;
    }
    public void setSituation(String situation){
        this.situation = situation;
    }
    public LocalDateTime getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(LocalDateTime dateNaissance){
        this.dateNaissance = dateNaissance;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Sexe getSexe(){
        return this.sexe;
    }
    public void setSexe(Sexe sexe){
        this.sexe = sexe;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getVille(){
        return this.ville;
    }
    public void setVille(String ville){
        this.ville = ville;
    }
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getNumeroAdhesion(){
        return this.numeroAdhesion;
    }
    public void setNumeroAdhesion(String numeroAdhesion){
        this.numeroAdhesion = numeroAdhesion;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getRib(){
        return this.rib;
    }
    public void setRib(String rib){
        this.rib = rib;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public String getNumeroTelephone(){
        return this.numeroTelephone;
    }
    public void setNumeroTelephone(String numeroTelephone){
        this.numeroTelephone = numeroTelephone;
    }
    public String getEmergencyContact(){
        return this.emergencyContact;
    }
    public void setEmergencyContact(String emergencyContact){
        this.emergencyContact = emergencyContact;
    }
    public String getNumeroSecuriteSociale(){
        return this.numeroSecuriteSociale;
    }
    public void setNumeroSecuriteSociale(String numeroSecuriteSociale){
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Departement getDepartement(){
        return this.departement;
    }
    public void setDepartement(Departement departement){
        this.departement = departement;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public CategorieEmploye getCategorieEmploye(){
        return this.categorieEmploye;
    }
    public void setCategorieEmploye(CategorieEmploye categorieEmploye){
        this.categorieEmploye = categorieEmploye;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Promotion getPromotion(){
        return this.promotion;
    }
    public void setPromotion(Promotion promotion){
        this.promotion = promotion;
    }
    public String getWarnningNotice(){
        return this.warnningNotice;
    }
    public void setWarnningNotice(String warnningNotice){
        this.warnningNotice = warnningNotice;
    }
    public BigDecimal getCost(){
        return this.cost;
    }
    public void setCost(BigDecimal cost){
        this.cost = cost;
    }
    public BigDecimal getAssuranceCost(){
        return this.assuranceCost;
    }
    public void setAssuranceCost(BigDecimal assuranceCost){
        this.assuranceCost = assuranceCost;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Education getEducation(){
        return this.education;
    }
    public void setEducation(Education education){
        this.education = education;
    }
    public Boolean  getEtude(){
        return this.etude;
    }
    public void setEtude(Boolean etude){
        this.etude = etude;
    }
    public Boolean  getExperience(){
        return this.experience;
    }
    public void setExperience(Boolean experience){
        this.experience = experience;
    }
    public BigDecimal getSalaire(){
        return this.salaire;
    }
    public void setSalaire(BigDecimal salaire){
        this.salaire = salaire;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id != null && id.equals(employe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


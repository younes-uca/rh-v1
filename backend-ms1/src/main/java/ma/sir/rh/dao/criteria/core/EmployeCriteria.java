package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class EmployeCriteria extends  BaseCriteria  {

    private String identifiantJlinx;
    private String identifiantJlinxLike;
    private String matricule;
    private String matriculeLike;
    private String prenom;
    private String prenomLike;
    private String nom;
    private String nomLike;
    private String situation;
    private String situationLike;
    private LocalDateTime dateNaissance;
    private LocalDateTime dateNaissanceFrom;
    private LocalDateTime dateNaissanceTo;
    private String adresse;
    private String adresseLike;
    private String ville;
    private String villeLike;
    private String cin;
    private String cinLike;
    private String numeroAdhesion;
    private String numeroAdhesionLike;
    private String email;
    private String emailLike;
    private String rib;
    private String ribLike;
    private String age;
    private String ageMin;
    private String ageMax;
    private String numeroTelephone;
    private String numeroTelephoneLike;
    private String emergencyContact;
    private String emergencyContactLike;
    private String numeroSecuriteSociale;
    private String numeroSecuriteSocialeLike;
    private String warnningNotice;
    private String warnningNoticeLike;
    private String cost;
    private String costMin;
    private String costMax;
    private String assuranceCost;
    private String assuranceCostMin;
    private String assuranceCostMax;
    private Boolean etude;
    private Boolean experience;
    private String salaire;
    private String salaireMin;
    private String salaireMax;

    private SexeCriteria sexe ;
    private List<SexeCriteria> sexes ;
    private DepartementCriteria departement ;
    private List<DepartementCriteria> departements ;
    private CategorieEmployeCriteria categorieEmploye ;
    private List<CategorieEmployeCriteria> categorieEmployes ;
    private PromotionCriteria promotion ;
    private List<PromotionCriteria> promotions ;
    private EducationCriteria education ;
    private List<EducationCriteria> educations ;


    public EmployeCriteria(){}

    public String getIdentifiantJlinx(){
        return this.identifiantJlinx;
    }
    public void setIdentifiantJlinx(String identifiantJlinx){
        this.identifiantJlinx = identifiantJlinx;
    }
    public String getIdentifiantJlinxLike(){
        return this.identifiantJlinxLike;
    }
    public void setIdentifiantJlinxLike(String identifiantJlinxLike){
        this.identifiantJlinxLike = identifiantJlinxLike;
    }

    public String getMatricule(){
        return this.matricule;
    }
    public void setMatricule(String matricule){
        this.matricule = matricule;
    }
    public String getMatriculeLike(){
        return this.matriculeLike;
    }
    public void setMatriculeLike(String matriculeLike){
        this.matriculeLike = matriculeLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public String getSituation(){
        return this.situation;
    }
    public void setSituation(String situation){
        this.situation = situation;
    }
    public String getSituationLike(){
        return this.situationLike;
    }
    public void setSituationLike(String situationLike){
        this.situationLike = situationLike;
    }

    public LocalDateTime getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(LocalDateTime dateNaissance){
        this.dateNaissance = dateNaissance;
    }
    public LocalDateTime getDateNaissanceFrom(){
        return this.dateNaissanceFrom;
    }
    public void setDateNaissanceFrom(LocalDateTime dateNaissanceFrom){
        this.dateNaissanceFrom = dateNaissanceFrom;
    }
    public LocalDateTime getDateNaissanceTo(){
        return this.dateNaissanceTo;
    }
    public void setDateNaissanceTo(LocalDateTime dateNaissanceTo){
        this.dateNaissanceTo = dateNaissanceTo;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getAdresseLike(){
        return this.adresseLike;
    }
    public void setAdresseLike(String adresseLike){
        this.adresseLike = adresseLike;
    }

    public String getVille(){
        return this.ville;
    }
    public void setVille(String ville){
        this.ville = ville;
    }
    public String getVilleLike(){
        return this.villeLike;
    }
    public void setVilleLike(String villeLike){
        this.villeLike = villeLike;
    }

    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCinLike(){
        return this.cinLike;
    }
    public void setCinLike(String cinLike){
        this.cinLike = cinLike;
    }

    public String getNumeroAdhesion(){
        return this.numeroAdhesion;
    }
    public void setNumeroAdhesion(String numeroAdhesion){
        this.numeroAdhesion = numeroAdhesion;
    }
    public String getNumeroAdhesionLike(){
        return this.numeroAdhesionLike;
    }
    public void setNumeroAdhesionLike(String numeroAdhesionLike){
        this.numeroAdhesionLike = numeroAdhesionLike;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmailLike(){
        return this.emailLike;
    }
    public void setEmailLike(String emailLike){
        this.emailLike = emailLike;
    }

    public String getRib(){
        return this.rib;
    }
    public void setRib(String rib){
        this.rib = rib;
    }
    public String getRibLike(){
        return this.ribLike;
    }
    public void setRibLike(String ribLike){
        this.ribLike = ribLike;
    }

    public String getAge(){
        return this.age;
    }
    public void setAge(String age){
        this.age = age;
    }   
    public String getAgeMin(){
        return this.ageMin;
    }
    public void setAgeMin(String ageMin){
        this.ageMin = ageMin;
    }
    public String getAgeMax(){
        return this.ageMax;
    }
    public void setAgeMax(String ageMax){
        this.ageMax = ageMax;
    }
      
    public String getNumeroTelephone(){
        return this.numeroTelephone;
    }
    public void setNumeroTelephone(String numeroTelephone){
        this.numeroTelephone = numeroTelephone;
    }
    public String getNumeroTelephoneLike(){
        return this.numeroTelephoneLike;
    }
    public void setNumeroTelephoneLike(String numeroTelephoneLike){
        this.numeroTelephoneLike = numeroTelephoneLike;
    }

    public String getEmergencyContact(){
        return this.emergencyContact;
    }
    public void setEmergencyContact(String emergencyContact){
        this.emergencyContact = emergencyContact;
    }
    public String getEmergencyContactLike(){
        return this.emergencyContactLike;
    }
    public void setEmergencyContactLike(String emergencyContactLike){
        this.emergencyContactLike = emergencyContactLike;
    }

    public String getNumeroSecuriteSociale(){
        return this.numeroSecuriteSociale;
    }
    public void setNumeroSecuriteSociale(String numeroSecuriteSociale){
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }
    public String getNumeroSecuriteSocialeLike(){
        return this.numeroSecuriteSocialeLike;
    }
    public void setNumeroSecuriteSocialeLike(String numeroSecuriteSocialeLike){
        this.numeroSecuriteSocialeLike = numeroSecuriteSocialeLike;
    }

    public String getWarnningNotice(){
        return this.warnningNotice;
    }
    public void setWarnningNotice(String warnningNotice){
        this.warnningNotice = warnningNotice;
    }
    public String getWarnningNoticeLike(){
        return this.warnningNoticeLike;
    }
    public void setWarnningNoticeLike(String warnningNoticeLike){
        this.warnningNoticeLike = warnningNoticeLike;
    }

    public String getCost(){
        return this.cost;
    }
    public void setCost(String cost){
        this.cost = cost;
    }   
    public String getCostMin(){
        return this.costMin;
    }
    public void setCostMin(String costMin){
        this.costMin = costMin;
    }
    public String getCostMax(){
        return this.costMax;
    }
    public void setCostMax(String costMax){
        this.costMax = costMax;
    }
      
    public String getAssuranceCost(){
        return this.assuranceCost;
    }
    public void setAssuranceCost(String assuranceCost){
        this.assuranceCost = assuranceCost;
    }   
    public String getAssuranceCostMin(){
        return this.assuranceCostMin;
    }
    public void setAssuranceCostMin(String assuranceCostMin){
        this.assuranceCostMin = assuranceCostMin;
    }
    public String getAssuranceCostMax(){
        return this.assuranceCostMax;
    }
    public void setAssuranceCostMax(String assuranceCostMax){
        this.assuranceCostMax = assuranceCostMax;
    }
      
    public Boolean getEtude(){
        return this.etude;
    }
    public void setEtude(Boolean etude){
        this.etude = etude;
    }
    public Boolean getExperience(){
        return this.experience;
    }
    public void setExperience(Boolean experience){
        this.experience = experience;
    }
    public String getSalaire(){
        return this.salaire;
    }
    public void setSalaire(String salaire){
        this.salaire = salaire;
    }   
    public String getSalaireMin(){
        return this.salaireMin;
    }
    public void setSalaireMin(String salaireMin){
        this.salaireMin = salaireMin;
    }
    public String getSalaireMax(){
        return this.salaireMax;
    }
    public void setSalaireMax(String salaireMax){
        this.salaireMax = salaireMax;
    }
      

    public SexeCriteria getSexe(){
        return this.sexe;
    }

    public void setSexe(SexeCriteria sexe){
        this.sexe = sexe;
    }
    public List<SexeCriteria> getSexes(){
        return this.sexes;
    }

    public void setSexes(List<SexeCriteria> sexes){
        this.sexes = sexes;
    }
    public DepartementCriteria getDepartement(){
        return this.departement;
    }

    public void setDepartement(DepartementCriteria departement){
        this.departement = departement;
    }
    public List<DepartementCriteria> getDepartements(){
        return this.departements;
    }

    public void setDepartements(List<DepartementCriteria> departements){
        this.departements = departements;
    }
    public CategorieEmployeCriteria getCategorieEmploye(){
        return this.categorieEmploye;
    }

    public void setCategorieEmploye(CategorieEmployeCriteria categorieEmploye){
        this.categorieEmploye = categorieEmploye;
    }
    public List<CategorieEmployeCriteria> getCategorieEmployes(){
        return this.categorieEmployes;
    }

    public void setCategorieEmployes(List<CategorieEmployeCriteria> categorieEmployes){
        this.categorieEmployes = categorieEmployes;
    }
    public PromotionCriteria getPromotion(){
        return this.promotion;
    }

    public void setPromotion(PromotionCriteria promotion){
        this.promotion = promotion;
    }
    public List<PromotionCriteria> getPromotions(){
        return this.promotions;
    }

    public void setPromotions(List<PromotionCriteria> promotions){
        this.promotions = promotions;
    }
    public EducationCriteria getEducation(){
        return this.education;
    }

    public void setEducation(EducationCriteria education){
        this.education = education;
    }
    public List<EducationCriteria> getEducations(){
        return this.educations;
    }

    public void setEducations(List<EducationCriteria> educations){
        this.educations = educations;
    }
}

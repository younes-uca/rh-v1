package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class AssuranceCriteria extends  BaseCriteria  {

    private String numeroPolice;
    private String numeroPoliceLike;
    private String courtier;
    private String courtierLike;
    private String malade;
    private String maladeLike;
    private LocalDateTime dateConsultation;
    private LocalDateTime dateConsultationFrom;
    private LocalDateTime dateConsultationTo;
    private LocalDateTime dateTransmission;
    private LocalDateTime dateTransmissionFrom;
    private LocalDateTime dateTransmissionTo;
    private String natureBesoin;
    private String natureBesoinLike;
    private String fraisEnagage;
    private String fraisEnagageMin;
    private String fraisEnagageMax;
    private LocalDateTime dateEnvoi;
    private LocalDateTime dateEnvoiFrom;
    private LocalDateTime dateEnvoiTo;
    private String observation;
    private String observationLike;

    private SocieteCriteria societe ;
    private List<SocieteCriteria> societes ;
    private CompagnieAssuranceCriteria compagnieAssurance ;
    private List<CompagnieAssuranceCriteria> compagnieAssurances ;
    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;
    private LienParenteCriteria lienParente ;
    private List<LienParenteCriteria> lienParentes ;


    public AssuranceCriteria(){}

    public String getNumeroPolice(){
        return this.numeroPolice;
    }
    public void setNumeroPolice(String numeroPolice){
        this.numeroPolice = numeroPolice;
    }
    public String getNumeroPoliceLike(){
        return this.numeroPoliceLike;
    }
    public void setNumeroPoliceLike(String numeroPoliceLike){
        this.numeroPoliceLike = numeroPoliceLike;
    }

    public String getCourtier(){
        return this.courtier;
    }
    public void setCourtier(String courtier){
        this.courtier = courtier;
    }
    public String getCourtierLike(){
        return this.courtierLike;
    }
    public void setCourtierLike(String courtierLike){
        this.courtierLike = courtierLike;
    }

    public String getMalade(){
        return this.malade;
    }
    public void setMalade(String malade){
        this.malade = malade;
    }
    public String getMaladeLike(){
        return this.maladeLike;
    }
    public void setMaladeLike(String maladeLike){
        this.maladeLike = maladeLike;
    }

    public LocalDateTime getDateConsultation(){
        return this.dateConsultation;
    }
    public void setDateConsultation(LocalDateTime dateConsultation){
        this.dateConsultation = dateConsultation;
    }
    public LocalDateTime getDateConsultationFrom(){
        return this.dateConsultationFrom;
    }
    public void setDateConsultationFrom(LocalDateTime dateConsultationFrom){
        this.dateConsultationFrom = dateConsultationFrom;
    }
    public LocalDateTime getDateConsultationTo(){
        return this.dateConsultationTo;
    }
    public void setDateConsultationTo(LocalDateTime dateConsultationTo){
        this.dateConsultationTo = dateConsultationTo;
    }
    public LocalDateTime getDateTransmission(){
        return this.dateTransmission;
    }
    public void setDateTransmission(LocalDateTime dateTransmission){
        this.dateTransmission = dateTransmission;
    }
    public LocalDateTime getDateTransmissionFrom(){
        return this.dateTransmissionFrom;
    }
    public void setDateTransmissionFrom(LocalDateTime dateTransmissionFrom){
        this.dateTransmissionFrom = dateTransmissionFrom;
    }
    public LocalDateTime getDateTransmissionTo(){
        return this.dateTransmissionTo;
    }
    public void setDateTransmissionTo(LocalDateTime dateTransmissionTo){
        this.dateTransmissionTo = dateTransmissionTo;
    }
    public String getNatureBesoin(){
        return this.natureBesoin;
    }
    public void setNatureBesoin(String natureBesoin){
        this.natureBesoin = natureBesoin;
    }
    public String getNatureBesoinLike(){
        return this.natureBesoinLike;
    }
    public void setNatureBesoinLike(String natureBesoinLike){
        this.natureBesoinLike = natureBesoinLike;
    }

    public String getFraisEnagage(){
        return this.fraisEnagage;
    }
    public void setFraisEnagage(String fraisEnagage){
        this.fraisEnagage = fraisEnagage;
    }   
    public String getFraisEnagageMin(){
        return this.fraisEnagageMin;
    }
    public void setFraisEnagageMin(String fraisEnagageMin){
        this.fraisEnagageMin = fraisEnagageMin;
    }
    public String getFraisEnagageMax(){
        return this.fraisEnagageMax;
    }
    public void setFraisEnagageMax(String fraisEnagageMax){
        this.fraisEnagageMax = fraisEnagageMax;
    }
      
    public LocalDateTime getDateEnvoi(){
        return this.dateEnvoi;
    }
    public void setDateEnvoi(LocalDateTime dateEnvoi){
        this.dateEnvoi = dateEnvoi;
    }
    public LocalDateTime getDateEnvoiFrom(){
        return this.dateEnvoiFrom;
    }
    public void setDateEnvoiFrom(LocalDateTime dateEnvoiFrom){
        this.dateEnvoiFrom = dateEnvoiFrom;
    }
    public LocalDateTime getDateEnvoiTo(){
        return this.dateEnvoiTo;
    }
    public void setDateEnvoiTo(LocalDateTime dateEnvoiTo){
        this.dateEnvoiTo = dateEnvoiTo;
    }
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
        this.observation = observation;
    }
    public String getObservationLike(){
        return this.observationLike;
    }
    public void setObservationLike(String observationLike){
        this.observationLike = observationLike;
    }


    public SocieteCriteria getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteCriteria societe){
        this.societe = societe;
    }
    public List<SocieteCriteria> getSocietes(){
        return this.societes;
    }

    public void setSocietes(List<SocieteCriteria> societes){
        this.societes = societes;
    }
    public CompagnieAssuranceCriteria getCompagnieAssurance(){
        return this.compagnieAssurance;
    }

    public void setCompagnieAssurance(CompagnieAssuranceCriteria compagnieAssurance){
        this.compagnieAssurance = compagnieAssurance;
    }
    public List<CompagnieAssuranceCriteria> getCompagnieAssurances(){
        return this.compagnieAssurances;
    }

    public void setCompagnieAssurances(List<CompagnieAssuranceCriteria> compagnieAssurances){
        this.compagnieAssurances = compagnieAssurances;
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
    public LienParenteCriteria getLienParente(){
        return this.lienParente;
    }

    public void setLienParente(LienParenteCriteria lienParente){
        this.lienParente = lienParente;
    }
    public List<LienParenteCriteria> getLienParentes(){
        return this.lienParentes;
    }

    public void setLienParentes(List<LienParenteCriteria> lienParentes){
        this.lienParentes = lienParentes;
    }
}

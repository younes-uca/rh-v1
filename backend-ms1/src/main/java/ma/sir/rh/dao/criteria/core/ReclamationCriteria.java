package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class ReclamationCriteria extends  BaseCriteria  {

    private String reference;
    private String referenceLike;
    private LocalDateTime dateReclamation;
    private LocalDateTime dateReclamationFrom;
    private LocalDateTime dateReclamationTo;
    private String message;
    private String messageLike;
    private LocalDateTime dateTraitement;
    private LocalDateTime dateTraitementFrom;
    private LocalDateTime dateTraitementTo;
    private LocalDateTime dateReponse;
    private LocalDateTime dateReponseFrom;
    private LocalDateTime dateReponseTo;
    private String commentaireTraiteur;
    private String commentaireTraiteurLike;
    private String objetReclamation;
    private String objetReclamationLike;

    private TypeReclamationCriteria typeReclamation ;
    private List<TypeReclamationCriteria> typeReclamations ;
    private EtatReclamationCriteria etatReclamation ;
    private List<EtatReclamationCriteria> etatReclamations ;
    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;


    public ReclamationCriteria(){}

    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getReferenceLike(){
        return this.referenceLike;
    }
    public void setReferenceLike(String referenceLike){
        this.referenceLike = referenceLike;
    }

    public LocalDateTime getDateReclamation(){
        return this.dateReclamation;
    }
    public void setDateReclamation(LocalDateTime dateReclamation){
        this.dateReclamation = dateReclamation;
    }
    public LocalDateTime getDateReclamationFrom(){
        return this.dateReclamationFrom;
    }
    public void setDateReclamationFrom(LocalDateTime dateReclamationFrom){
        this.dateReclamationFrom = dateReclamationFrom;
    }
    public LocalDateTime getDateReclamationTo(){
        return this.dateReclamationTo;
    }
    public void setDateReclamationTo(LocalDateTime dateReclamationTo){
        this.dateReclamationTo = dateReclamationTo;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessageLike(){
        return this.messageLike;
    }
    public void setMessageLike(String messageLike){
        this.messageLike = messageLike;
    }

    public LocalDateTime getDateTraitement(){
        return this.dateTraitement;
    }
    public void setDateTraitement(LocalDateTime dateTraitement){
        this.dateTraitement = dateTraitement;
    }
    public LocalDateTime getDateTraitementFrom(){
        return this.dateTraitementFrom;
    }
    public void setDateTraitementFrom(LocalDateTime dateTraitementFrom){
        this.dateTraitementFrom = dateTraitementFrom;
    }
    public LocalDateTime getDateTraitementTo(){
        return this.dateTraitementTo;
    }
    public void setDateTraitementTo(LocalDateTime dateTraitementTo){
        this.dateTraitementTo = dateTraitementTo;
    }
    public LocalDateTime getDateReponse(){
        return this.dateReponse;
    }
    public void setDateReponse(LocalDateTime dateReponse){
        this.dateReponse = dateReponse;
    }
    public LocalDateTime getDateReponseFrom(){
        return this.dateReponseFrom;
    }
    public void setDateReponseFrom(LocalDateTime dateReponseFrom){
        this.dateReponseFrom = dateReponseFrom;
    }
    public LocalDateTime getDateReponseTo(){
        return this.dateReponseTo;
    }
    public void setDateReponseTo(LocalDateTime dateReponseTo){
        this.dateReponseTo = dateReponseTo;
    }
    public String getCommentaireTraiteur(){
        return this.commentaireTraiteur;
    }
    public void setCommentaireTraiteur(String commentaireTraiteur){
        this.commentaireTraiteur = commentaireTraiteur;
    }
    public String getCommentaireTraiteurLike(){
        return this.commentaireTraiteurLike;
    }
    public void setCommentaireTraiteurLike(String commentaireTraiteurLike){
        this.commentaireTraiteurLike = commentaireTraiteurLike;
    }

    public String getObjetReclamation(){
        return this.objetReclamation;
    }
    public void setObjetReclamation(String objetReclamation){
        this.objetReclamation = objetReclamation;
    }
    public String getObjetReclamationLike(){
        return this.objetReclamationLike;
    }
    public void setObjetReclamationLike(String objetReclamationLike){
        this.objetReclamationLike = objetReclamationLike;
    }


    public TypeReclamationCriteria getTypeReclamation(){
        return this.typeReclamation;
    }

    public void setTypeReclamation(TypeReclamationCriteria typeReclamation){
        this.typeReclamation = typeReclamation;
    }
    public List<TypeReclamationCriteria> getTypeReclamations(){
        return this.typeReclamations;
    }

    public void setTypeReclamations(List<TypeReclamationCriteria> typeReclamations){
        this.typeReclamations = typeReclamations;
    }
    public EtatReclamationCriteria getEtatReclamation(){
        return this.etatReclamation;
    }

    public void setEtatReclamation(EtatReclamationCriteria etatReclamation){
        this.etatReclamation = etatReclamation;
    }
    public List<EtatReclamationCriteria> getEtatReclamations(){
        return this.etatReclamations;
    }

    public void setEtatReclamations(List<EtatReclamationCriteria> etatReclamations){
        this.etatReclamations = etatReclamations;
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
}

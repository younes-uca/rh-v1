package ma.sir.rh.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "reclamation")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reclamation_seq",sequenceName="reclamation_seq",allocationSize=1, initialValue = 1)
public class Reclamation   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String reference;
    private LocalDateTime dateReclamation ;
    @Column(length = 500)
    private String message;
    private LocalDateTime dateTraitement ;
    private LocalDateTime dateReponse ;
    @Column(length = 500)
    private String commentaireTraiteur;
    @Column(length = 500)
    private String objetReclamation;

    private TypeReclamation typeReclamation ;
    
    private EtatReclamation etatReclamation ;
    
    private Employe employe ;
    


    public Reclamation(){
        super();
    }

    public Reclamation(Long id,String reference){
        this.id = id;
        this.reference = reference ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reclamation_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public LocalDateTime getDateReclamation(){
        return this.dateReclamation;
    }
    public void setDateReclamation(LocalDateTime dateReclamation){
        this.dateReclamation = dateReclamation;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public LocalDateTime getDateTraitement(){
        return this.dateTraitement;
    }
    public void setDateTraitement(LocalDateTime dateTraitement){
        this.dateTraitement = dateTraitement;
    }
    public LocalDateTime getDateReponse(){
        return this.dateReponse;
    }
    public void setDateReponse(LocalDateTime dateReponse){
        this.dateReponse = dateReponse;
    }
    public String getCommentaireTraiteur(){
        return this.commentaireTraiteur;
    }
    public void setCommentaireTraiteur(String commentaireTraiteur){
        this.commentaireTraiteur = commentaireTraiteur;
    }
    public String getObjetReclamation(){
        return this.objetReclamation;
    }
    public void setObjetReclamation(String objetReclamation){
        this.objetReclamation = objetReclamation;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeReclamation getTypeReclamation(){
        return this.typeReclamation;
    }
    public void setTypeReclamation(TypeReclamation typeReclamation){
        this.typeReclamation = typeReclamation;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public EtatReclamation getEtatReclamation(){
        return this.etatReclamation;
    }
    public void setEtatReclamation(EtatReclamation etatReclamation){
        this.etatReclamation = etatReclamation;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }

    @Transient
    public String getLabel() {
        label = reference;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reclamation reclamation = (Reclamation) o;
        return id != null && id.equals(reclamation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}


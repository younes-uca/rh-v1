package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReclamationDto  extends AuditBaseDto {

    private String reference  ;
    private String dateReclamation ;
    private String message  ;
    private String dateTraitement ;
    private String dateReponse ;
    private String commentaireTraiteur  ;
    private String objetReclamation  ;

    private TypeReclamationDto typeReclamation ;
    private EtatReclamationDto etatReclamation ;
    private EmployeDto employe ;



    public ReclamationDto(){
        super();
    }



    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateReclamation(){
        return this.dateReclamation;
    }
    public void setDateReclamation(String dateReclamation){
        this.dateReclamation = dateReclamation;
    }

    @Log
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateTraitement(){
        return this.dateTraitement;
    }
    public void setDateTraitement(String dateTraitement){
        this.dateTraitement = dateTraitement;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateReponse(){
        return this.dateReponse;
    }
    public void setDateReponse(String dateReponse){
        this.dateReponse = dateReponse;
    }

    @Log
    public String getCommentaireTraiteur(){
        return this.commentaireTraiteur;
    }
    public void setCommentaireTraiteur(String commentaireTraiteur){
        this.commentaireTraiteur = commentaireTraiteur;
    }

    @Log
    public String getObjetReclamation(){
        return this.objetReclamation;
    }
    public void setObjetReclamation(String objetReclamation){
        this.objetReclamation = objetReclamation;
    }


    public TypeReclamationDto getTypeReclamation(){
        return this.typeReclamation;
    }

    public void setTypeReclamation(TypeReclamationDto typeReclamation){
        this.typeReclamation = typeReclamation;
    }
    public EtatReclamationDto getEtatReclamation(){
        return this.etatReclamation;
    }

    public void setEtatReclamation(EtatReclamationDto etatReclamation){
        this.etatReclamation = etatReclamation;
    }
    public EmployeDto getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeDto employe){
        this.employe = employe;
    }




}

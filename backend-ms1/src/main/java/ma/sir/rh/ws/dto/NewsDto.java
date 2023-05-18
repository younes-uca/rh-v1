package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewsDto  extends AuditBaseDto {

    private String ref  ;
    private String libelle  ;
    private String image  ;
    private String description  ;
    private String dateNews ;
    private Boolean archive  ;
    private Integer numeroOrdre  = 0 ;
    private String destinataire  ;




    public NewsDto(){
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
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateNews(){
        return this.dateNews;
    }
    public void setDateNews(String dateNews){
        this.dateNews = dateNews;
    }

    @Log
    public Boolean getArchive(){
        return this.archive;
    }
    public void setArchive(Boolean archive){
        this.archive = archive;
    }

    @Log
    public Integer getNumeroOrdre(){
        return this.numeroOrdre;
    }
    public void setNumeroOrdre(Integer numeroOrdre){
        this.numeroOrdre = numeroOrdre;
    }

    @Log
    public String getDestinataire(){
        return this.destinataire;
    }
    public void setDestinataire(String destinataire){
        this.destinataire = destinataire;
    }






}

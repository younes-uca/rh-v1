package  ma.sir.rh.dao.criteria.core;


import ma.sir.rh.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class NewsCriteria extends  BaseCriteria  {

    private String ref;
    private String refLike;
    private String libelle;
    private String libelleLike;
    private String image;
    private String imageLike;
    private String description;
    private String descriptionLike;
    private LocalDateTime dateNews;
    private LocalDateTime dateNewsFrom;
    private LocalDateTime dateNewsTo;
    private Boolean archive;
    private String numeroOrdre;
    private String numeroOrdreMin;
    private String numeroOrdreMax;
    private String destinataire;
    private String destinataireLike;



    public NewsCriteria(){}

    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getRefLike(){
        return this.refLike;
    }
    public void setRefLike(String refLike){
        this.refLike = refLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getImageLike(){
        return this.imageLike;
    }
    public void setImageLike(String imageLike){
        this.imageLike = imageLike;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }

    public LocalDateTime getDateNews(){
        return this.dateNews;
    }
    public void setDateNews(LocalDateTime dateNews){
        this.dateNews = dateNews;
    }
    public LocalDateTime getDateNewsFrom(){
        return this.dateNewsFrom;
    }
    public void setDateNewsFrom(LocalDateTime dateNewsFrom){
        this.dateNewsFrom = dateNewsFrom;
    }
    public LocalDateTime getDateNewsTo(){
        return this.dateNewsTo;
    }
    public void setDateNewsTo(LocalDateTime dateNewsTo){
        this.dateNewsTo = dateNewsTo;
    }
    public Boolean getArchive(){
        return this.archive;
    }
    public void setArchive(Boolean archive){
        this.archive = archive;
    }
    public String getNumeroOrdre(){
        return this.numeroOrdre;
    }
    public void setNumeroOrdre(String numeroOrdre){
        this.numeroOrdre = numeroOrdre;
    }   
    public String getNumeroOrdreMin(){
        return this.numeroOrdreMin;
    }
    public void setNumeroOrdreMin(String numeroOrdreMin){
        this.numeroOrdreMin = numeroOrdreMin;
    }
    public String getNumeroOrdreMax(){
        return this.numeroOrdreMax;
    }
    public void setNumeroOrdreMax(String numeroOrdreMax){
        this.numeroOrdreMax = numeroOrdreMax;
    }
      
    public String getDestinataire(){
        return this.destinataire;
    }
    public void setDestinataire(String destinataire){
        this.destinataire = destinataire;
    }
    public String getDestinataireLike(){
        return this.destinataireLike;
    }
    public void setDestinataireLike(String destinataireLike){
        this.destinataireLike = destinataireLike;
    }


}

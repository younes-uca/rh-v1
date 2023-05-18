package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromotionDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private String dateDebutProfession ;
    private String dateDebutContrat ;




    public PromotionDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDebutProfession(){
        return this.dateDebutProfession;
    }
    public void setDateDebutProfession(String dateDebutProfession){
        this.dateDebutProfession = dateDebutProfession;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDebutContrat(){
        return this.dateDebutContrat;
    }
    public void setDateDebutContrat(String dateDebutContrat){
        this.dateDebutContrat = dateDebutContrat;
    }






}

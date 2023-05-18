package  ma.sir.rh.ws.dto;

import ma.sir.rh.zynerator.audit.Log;
import ma.sir.rh.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDemandeCongeDto  extends AuditBaseDto {

    private String ref  ;
    private String code  ;
    private String libelle  ;
    private Integer nbrJourConge  = 0 ;




    public TypeDemandeCongeDto(){
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
    public Integer getNbrJourConge(){
        return this.nbrJourConge;
    }
    public void setNbrJourConge(Integer nbrJourConge){
        this.nbrJourConge = nbrJourConge;
    }






}

package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.ReclamationHistory;
import ma.sir.rh.bean.core.Reclamation;
import ma.sir.rh.ws.dto.ReclamationDto;

@Component
public class ReclamationConverter extends AbstractConverter<Reclamation, ReclamationDto, ReclamationHistory> {

    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private TypeReclamationConverter typeReclamationConverter ;
    @Autowired
    private EtatReclamationConverter etatReclamationConverter ;
    private boolean typeReclamation;
    private boolean etatReclamation;
    private boolean employe;

    public  ReclamationConverter(){
        super(Reclamation.class, ReclamationDto.class, ReclamationHistory.class);
    }

    @Override
    public Reclamation toItem(ReclamationDto dto) {
        if (dto == null) {
            return null;
        } else {
        Reclamation item = new Reclamation();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getDateReclamation()))
                item.setDateReclamation(DateUtil.stringEnToDate(dto.getDateReclamation()));
            if(StringUtil.isNotEmpty(dto.getMessage()))
                item.setMessage(dto.getMessage());
            if(StringUtil.isNotEmpty(dto.getDateTraitement()))
                item.setDateTraitement(DateUtil.stringEnToDate(dto.getDateTraitement()));
            if(StringUtil.isNotEmpty(dto.getDateReponse()))
                item.setDateReponse(DateUtil.stringEnToDate(dto.getDateReponse()));
            if(StringUtil.isNotEmpty(dto.getCommentaireTraiteur()))
                item.setCommentaireTraiteur(dto.getCommentaireTraiteur());
            if(StringUtil.isNotEmpty(dto.getObjetReclamation()))
                item.setObjetReclamation(dto.getObjetReclamation());
            if(this.typeReclamation && dto.getTypeReclamation()!=null)
                item.setTypeReclamation(typeReclamationConverter.toItem(dto.getTypeReclamation())) ;

            if(this.etatReclamation && dto.getEtatReclamation()!=null)
                item.setEtatReclamation(etatReclamationConverter.toItem(dto.getEtatReclamation())) ;

            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;



        return item;
        }
    }

    @Override
    public ReclamationDto toDto(Reclamation item) {
        if (item == null) {
            return null;
        } else {
            ReclamationDto dto = new ReclamationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(item.getDateReclamation()!=null)
                dto.setDateReclamation(DateUtil.dateTimeToString(item.getDateReclamation()));
            if(StringUtil.isNotEmpty(item.getMessage()))
                dto.setMessage(item.getMessage());
            if(item.getDateTraitement()!=null)
                dto.setDateTraitement(DateUtil.dateTimeToString(item.getDateTraitement()));
            if(item.getDateReponse()!=null)
                dto.setDateReponse(DateUtil.dateTimeToString(item.getDateReponse()));
            if(StringUtil.isNotEmpty(item.getCommentaireTraiteur()))
                dto.setCommentaireTraiteur(item.getCommentaireTraiteur());
            if(StringUtil.isNotEmpty(item.getObjetReclamation()))
                dto.setObjetReclamation(item.getObjetReclamation());
        if(this.typeReclamation && item.getTypeReclamation()!=null) {
            dto.setTypeReclamation(typeReclamationConverter.toDto(item.getTypeReclamation())) ;
        }
        if(this.etatReclamation && item.getEtatReclamation()!=null) {
            dto.setEtatReclamation(etatReclamationConverter.toDto(item.getEtatReclamation())) ;
        }
        if(this.employe && item.getEmploye()!=null) {
            dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.typeReclamation = value;
        this.etatReclamation = value;
        this.employe = value;
    }


    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public TypeReclamationConverter getTypeReclamationConverter(){
        return this.typeReclamationConverter;
    }
    public void setTypeReclamationConverter(TypeReclamationConverter typeReclamationConverter ){
        this.typeReclamationConverter = typeReclamationConverter;
    }
    public EtatReclamationConverter getEtatReclamationConverter(){
        return this.etatReclamationConverter;
    }
    public void setEtatReclamationConverter(EtatReclamationConverter etatReclamationConverter ){
        this.etatReclamationConverter = etatReclamationConverter;
    }
    public boolean  isTypeReclamation(){
        return this.typeReclamation;
    }
    public void  setTypeReclamation(boolean typeReclamation){
        this.typeReclamation = typeReclamation;
    }
    public boolean  isEtatReclamation(){
        return this.etatReclamation;
    }
    public void  setEtatReclamation(boolean etatReclamation){
        this.etatReclamation = etatReclamation;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
}

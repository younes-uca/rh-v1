package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.DemandeCongeHistory;
import ma.sir.rh.bean.core.DemandeConge;
import ma.sir.rh.ws.dto.DemandeCongeDto;

@Component
public class DemandeCongeConverter extends AbstractConverter<DemandeConge, DemandeCongeDto, DemandeCongeHistory> {

    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private EtatDemandeCongeConverter etatDemandeCongeConverter ;
    @Autowired
    private DepartementConverter departementConverter ;
    @Autowired
    private TypeDemandeCongeConverter typeDemandeCongeConverter ;
    private boolean employe;
    private boolean departement;
    private boolean etatDemandeConge;
    private boolean typeDemandeConge;

    public  DemandeCongeConverter(){
        super(DemandeConge.class, DemandeCongeDto.class, DemandeCongeHistory.class);
    }

    @Override
    public DemandeConge toItem(DemandeCongeDto dto) {
        if (dto == null) {
            return null;
        } else {
        DemandeConge item = new DemandeConge();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getStartTime()))
                item.setStartTime(DateUtil.stringEnToDate(dto.getStartTime()));
            if(StringUtil.isNotEmpty(dto.getEndTime()))
                item.setEndTime(DateUtil.stringEnToDate(dto.getEndTime()));
            if(StringUtil.isNotEmpty(dto.getNbrJourConge()))
                item.setNbrJourConge(dto.getNbrJourConge());
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;

            if(this.departement && dto.getDepartement()!=null)
                item.setDepartement(departementConverter.toItem(dto.getDepartement())) ;

            if(this.etatDemandeConge && dto.getEtatDemandeConge()!=null)
                item.setEtatDemandeConge(etatDemandeCongeConverter.toItem(dto.getEtatDemandeConge())) ;

            if(this.typeDemandeConge && dto.getTypeDemandeConge()!=null)
                item.setTypeDemandeConge(typeDemandeCongeConverter.toItem(dto.getTypeDemandeConge())) ;



        return item;
        }
    }

    @Override
    public DemandeCongeDto toDto(DemandeConge item) {
        if (item == null) {
            return null;
        } else {
            DemandeCongeDto dto = new DemandeCongeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(item.getStartTime()!=null)
                dto.setStartTime(DateUtil.dateTimeToString(item.getStartTime()));
            if(item.getEndTime()!=null)
                dto.setEndTime(DateUtil.dateTimeToString(item.getEndTime()));
            if(StringUtil.isNotEmpty(item.getNbrJourConge()))
                dto.setNbrJourConge(item.getNbrJourConge());
        if(this.employe && item.getEmploye()!=null) {
            dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;
        }
        if(this.departement && item.getDepartement()!=null) {
            dto.setDepartement(departementConverter.toDto(item.getDepartement())) ;
        }
        if(this.etatDemandeConge && item.getEtatDemandeConge()!=null) {
            dto.setEtatDemandeConge(etatDemandeCongeConverter.toDto(item.getEtatDemandeConge())) ;
        }
        if(this.typeDemandeConge && item.getTypeDemandeConge()!=null) {
            dto.setTypeDemandeConge(typeDemandeCongeConverter.toDto(item.getTypeDemandeConge())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.employe = value;
        this.departement = value;
        this.etatDemandeConge = value;
        this.typeDemandeConge = value;
    }


    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public EtatDemandeCongeConverter getEtatDemandeCongeConverter(){
        return this.etatDemandeCongeConverter;
    }
    public void setEtatDemandeCongeConverter(EtatDemandeCongeConverter etatDemandeCongeConverter ){
        this.etatDemandeCongeConverter = etatDemandeCongeConverter;
    }
    public DepartementConverter getDepartementConverter(){
        return this.departementConverter;
    }
    public void setDepartementConverter(DepartementConverter departementConverter ){
        this.departementConverter = departementConverter;
    }
    public TypeDemandeCongeConverter getTypeDemandeCongeConverter(){
        return this.typeDemandeCongeConverter;
    }
    public void setTypeDemandeCongeConverter(TypeDemandeCongeConverter typeDemandeCongeConverter ){
        this.typeDemandeCongeConverter = typeDemandeCongeConverter;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
    public boolean  isDepartement(){
        return this.departement;
    }
    public void  setDepartement(boolean departement){
        this.departement = departement;
    }
    public boolean  isEtatDemandeConge(){
        return this.etatDemandeConge;
    }
    public void  setEtatDemandeConge(boolean etatDemandeConge){
        this.etatDemandeConge = etatDemandeConge;
    }
    public boolean  isTypeDemandeConge(){
        return this.typeDemandeConge;
    }
    public void  setTypeDemandeConge(boolean typeDemandeConge){
        this.typeDemandeConge = typeDemandeConge;
    }
}

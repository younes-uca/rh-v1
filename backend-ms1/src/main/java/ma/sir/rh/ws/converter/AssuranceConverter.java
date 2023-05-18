package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.AssuranceHistory;
import ma.sir.rh.bean.core.Assurance;
import ma.sir.rh.ws.dto.AssuranceDto;

@Component
public class AssuranceConverter extends AbstractConverter<Assurance, AssuranceDto, AssuranceHistory> {

    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private SocieteConverter societeConverter ;
    @Autowired
    private CompagnieAssuranceConverter compagnieAssuranceConverter ;
    @Autowired
    private LienParenteConverter lienParenteConverter ;
    private boolean societe;
    private boolean compagnieAssurance;
    private boolean employe;
    private boolean lienParente;

    public  AssuranceConverter(){
        super(Assurance.class, AssuranceDto.class, AssuranceHistory.class);
    }

    @Override
    public Assurance toItem(AssuranceDto dto) {
        if (dto == null) {
            return null;
        } else {
        Assurance item = new Assurance();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNumeroPolice()))
                item.setNumeroPolice(dto.getNumeroPolice());
            if(StringUtil.isNotEmpty(dto.getCourtier()))
                item.setCourtier(dto.getCourtier());
            if(StringUtil.isNotEmpty(dto.getMalade()))
                item.setMalade(dto.getMalade());
            if(StringUtil.isNotEmpty(dto.getDateConsultation()))
                item.setDateConsultation(DateUtil.stringEnToDate(dto.getDateConsultation()));
            if(StringUtil.isNotEmpty(dto.getDateTransmission()))
                item.setDateTransmission(DateUtil.stringEnToDate(dto.getDateTransmission()));
            if(StringUtil.isNotEmpty(dto.getNatureBesoin()))
                item.setNatureBesoin(dto.getNatureBesoin());
            if(StringUtil.isNotEmpty(dto.getFraisEnagage()))
                item.setFraisEnagage(dto.getFraisEnagage());
            if(StringUtil.isNotEmpty(dto.getDateEnvoi()))
                item.setDateEnvoi(DateUtil.stringEnToDate(dto.getDateEnvoi()));
            if(StringUtil.isNotEmpty(dto.getObservation()))
                item.setObservation(dto.getObservation());
            if(this.societe && dto.getSociete()!=null)
                item.setSociete(societeConverter.toItem(dto.getSociete())) ;

            if(this.compagnieAssurance && dto.getCompagnieAssurance()!=null)
                item.setCompagnieAssurance(compagnieAssuranceConverter.toItem(dto.getCompagnieAssurance())) ;

            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;

            if(this.lienParente && dto.getLienParente()!=null)
                item.setLienParente(lienParenteConverter.toItem(dto.getLienParente())) ;



        return item;
        }
    }

    @Override
    public AssuranceDto toDto(Assurance item) {
        if (item == null) {
            return null;
        } else {
            AssuranceDto dto = new AssuranceDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNumeroPolice()))
                dto.setNumeroPolice(item.getNumeroPolice());
            if(StringUtil.isNotEmpty(item.getCourtier()))
                dto.setCourtier(item.getCourtier());
            if(StringUtil.isNotEmpty(item.getMalade()))
                dto.setMalade(item.getMalade());
            if(item.getDateConsultation()!=null)
                dto.setDateConsultation(DateUtil.dateTimeToString(item.getDateConsultation()));
            if(item.getDateTransmission()!=null)
                dto.setDateTransmission(DateUtil.dateTimeToString(item.getDateTransmission()));
            if(StringUtil.isNotEmpty(item.getNatureBesoin()))
                dto.setNatureBesoin(item.getNatureBesoin());
            if(StringUtil.isNotEmpty(item.getFraisEnagage()))
                dto.setFraisEnagage(item.getFraisEnagage());
            if(item.getDateEnvoi()!=null)
                dto.setDateEnvoi(DateUtil.dateTimeToString(item.getDateEnvoi()));
            if(StringUtil.isNotEmpty(item.getObservation()))
                dto.setObservation(item.getObservation());
        if(this.societe && item.getSociete()!=null) {
            dto.setSociete(societeConverter.toDto(item.getSociete())) ;
        }
        if(this.compagnieAssurance && item.getCompagnieAssurance()!=null) {
            dto.setCompagnieAssurance(compagnieAssuranceConverter.toDto(item.getCompagnieAssurance())) ;
        }
        if(this.employe && item.getEmploye()!=null) {
            dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;
        }
        if(this.lienParente && item.getLienParente()!=null) {
            dto.setLienParente(lienParenteConverter.toDto(item.getLienParente())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.societe = value;
        this.compagnieAssurance = value;
        this.employe = value;
        this.lienParente = value;
    }


    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public SocieteConverter getSocieteConverter(){
        return this.societeConverter;
    }
    public void setSocieteConverter(SocieteConverter societeConverter ){
        this.societeConverter = societeConverter;
    }
    public CompagnieAssuranceConverter getCompagnieAssuranceConverter(){
        return this.compagnieAssuranceConverter;
    }
    public void setCompagnieAssuranceConverter(CompagnieAssuranceConverter compagnieAssuranceConverter ){
        this.compagnieAssuranceConverter = compagnieAssuranceConverter;
    }
    public LienParenteConverter getLienParenteConverter(){
        return this.lienParenteConverter;
    }
    public void setLienParenteConverter(LienParenteConverter lienParenteConverter ){
        this.lienParenteConverter = lienParenteConverter;
    }
    public boolean  isSociete(){
        return this.societe;
    }
    public void  setSociete(boolean societe){
        this.societe = societe;
    }
    public boolean  isCompagnieAssurance(){
        return this.compagnieAssurance;
    }
    public void  setCompagnieAssurance(boolean compagnieAssurance){
        this.compagnieAssurance = compagnieAssurance;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
    public boolean  isLienParente(){
        return this.lienParente;
    }
    public void  setLienParente(boolean lienParente){
        this.lienParente = lienParente;
    }
}

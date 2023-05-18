package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.SoldAnnuelCongeHistory;
import ma.sir.rh.bean.core.SoldAnnuelConge;
import ma.sir.rh.ws.dto.SoldAnnuelCongeDto;

@Component
public class SoldAnnuelCongeConverter extends AbstractConverter<SoldAnnuelConge, SoldAnnuelCongeDto, SoldAnnuelCongeHistory> {

    @Autowired
    private EmployeConverter employeConverter ;
    private boolean employe;

    public  SoldAnnuelCongeConverter(){
        super(SoldAnnuelConge.class, SoldAnnuelCongeDto.class, SoldAnnuelCongeHistory.class);
    }

    @Override
    public SoldAnnuelConge toItem(SoldAnnuelCongeDto dto) {
        if (dto == null) {
            return null;
        } else {
        SoldAnnuelConge item = new SoldAnnuelConge();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(StringUtil.isNotEmpty(dto.getNbrJourTotale()))
                item.setNbrJourTotale(dto.getNbrJourTotale());
            if(StringUtil.isNotEmpty(dto.getNbrJourConsome()))
                item.setNbrJourConsome(dto.getNbrJourConsome());
            if(StringUtil.isNotEmpty(dto.getNbrJourRestant()))
                item.setNbrJourRestant(dto.getNbrJourRestant());
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;



        return item;
        }
    }

    @Override
    public SoldAnnuelCongeDto toDto(SoldAnnuelConge item) {
        if (item == null) {
            return null;
        } else {
            SoldAnnuelCongeDto dto = new SoldAnnuelCongeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
            if(StringUtil.isNotEmpty(item.getNbrJourTotale()))
                dto.setNbrJourTotale(item.getNbrJourTotale());
            if(StringUtil.isNotEmpty(item.getNbrJourConsome()))
                dto.setNbrJourConsome(item.getNbrJourConsome());
            if(StringUtil.isNotEmpty(item.getNbrJourRestant()))
                dto.setNbrJourRestant(item.getNbrJourRestant());
        if(this.employe && item.getEmploye()!=null) {
            dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.employe = value;
    }


    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
}

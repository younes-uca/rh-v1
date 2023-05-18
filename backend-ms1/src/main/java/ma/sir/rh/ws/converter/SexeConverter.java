package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.SexeHistory;
import ma.sir.rh.bean.core.Sexe;
import ma.sir.rh.ws.dto.SexeDto;

@Component
public class SexeConverter extends AbstractConverter<Sexe, SexeDto, SexeHistory> {


    public  SexeConverter(){
        super(Sexe.class, SexeDto.class, SexeHistory.class);
    }

    @Override
    public Sexe toItem(SexeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Sexe item = new Sexe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public SexeDto toDto(Sexe item) {
        if (item == null) {
            return null;
        } else {
            SexeDto dto = new SexeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}

package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.EducationHistory;
import ma.sir.rh.bean.core.Education;
import ma.sir.rh.ws.dto.EducationDto;

@Component
public class EducationConverter extends AbstractConverter<Education, EducationDto, EducationHistory> {


    public  EducationConverter(){
        super(Education.class, EducationDto.class, EducationHistory.class);
    }

    @Override
    public Education toItem(EducationDto dto) {
        if (dto == null) {
            return null;
        } else {
        Education item = new Education();
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
    public EducationDto toDto(Education item) {
        if (item == null) {
            return null;
        } else {
            EducationDto dto = new EducationDto();
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

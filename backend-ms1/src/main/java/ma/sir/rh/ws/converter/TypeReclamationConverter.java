package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.TypeReclamationHistory;
import ma.sir.rh.bean.core.TypeReclamation;
import ma.sir.rh.ws.dto.TypeReclamationDto;

@Component
public class TypeReclamationConverter extends AbstractConverter<TypeReclamation, TypeReclamationDto, TypeReclamationHistory> {


    public  TypeReclamationConverter(){
        super(TypeReclamation.class, TypeReclamationDto.class, TypeReclamationHistory.class);
    }

    @Override
    public TypeReclamation toItem(TypeReclamationDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeReclamation item = new TypeReclamation();
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
    public TypeReclamationDto toDto(TypeReclamation item) {
        if (item == null) {
            return null;
        } else {
            TypeReclamationDto dto = new TypeReclamationDto();
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

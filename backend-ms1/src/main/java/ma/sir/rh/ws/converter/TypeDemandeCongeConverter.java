package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.TypeDemandeCongeHistory;
import ma.sir.rh.bean.core.TypeDemandeConge;
import ma.sir.rh.ws.dto.TypeDemandeCongeDto;

@Component
public class TypeDemandeCongeConverter extends AbstractConverter<TypeDemandeConge, TypeDemandeCongeDto, TypeDemandeCongeHistory> {


    public  TypeDemandeCongeConverter(){
        super(TypeDemandeConge.class, TypeDemandeCongeDto.class, TypeDemandeCongeHistory.class);
    }

    @Override
    public TypeDemandeConge toItem(TypeDemandeCongeDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeDemandeConge item = new TypeDemandeConge();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getNbrJourConge()))
                item.setNbrJourConge(dto.getNbrJourConge());


        return item;
        }
    }

    @Override
    public TypeDemandeCongeDto toDto(TypeDemandeConge item) {
        if (item == null) {
            return null;
        } else {
            TypeDemandeCongeDto dto = new TypeDemandeCongeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getNbrJourConge()))
                dto.setNbrJourConge(item.getNbrJourConge());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}

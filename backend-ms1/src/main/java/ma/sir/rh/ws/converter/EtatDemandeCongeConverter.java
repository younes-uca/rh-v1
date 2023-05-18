package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.EtatDemandeCongeHistory;
import ma.sir.rh.bean.core.EtatDemandeConge;
import ma.sir.rh.ws.dto.EtatDemandeCongeDto;

@Component
public class EtatDemandeCongeConverter extends AbstractConverter<EtatDemandeConge, EtatDemandeCongeDto, EtatDemandeCongeHistory> {


    public  EtatDemandeCongeConverter(){
        super(EtatDemandeConge.class, EtatDemandeCongeDto.class, EtatDemandeCongeHistory.class);
    }

    @Override
    public EtatDemandeConge toItem(EtatDemandeCongeDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatDemandeConge item = new EtatDemandeConge();
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
    public EtatDemandeCongeDto toDto(EtatDemandeConge item) {
        if (item == null) {
            return null;
        } else {
            EtatDemandeCongeDto dto = new EtatDemandeCongeDto();
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

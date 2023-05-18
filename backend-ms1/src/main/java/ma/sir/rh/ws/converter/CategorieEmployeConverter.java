package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.CategorieEmployeHistory;
import ma.sir.rh.bean.core.CategorieEmploye;
import ma.sir.rh.ws.dto.CategorieEmployeDto;

@Component
public class CategorieEmployeConverter extends AbstractConverter<CategorieEmploye, CategorieEmployeDto, CategorieEmployeHistory> {


    public  CategorieEmployeConverter(){
        super(CategorieEmploye.class, CategorieEmployeDto.class, CategorieEmployeHistory.class);
    }

    @Override
    public CategorieEmploye toItem(CategorieEmployeDto dto) {
        if (dto == null) {
            return null;
        } else {
        CategorieEmploye item = new CategorieEmploye();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());


        return item;
        }
    }

    @Override
    public CategorieEmployeDto toDto(CategorieEmploye item) {
        if (item == null) {
            return null;
        } else {
            CategorieEmployeDto dto = new CategorieEmployeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}

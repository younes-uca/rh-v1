package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.PromotionHistory;
import ma.sir.rh.bean.core.Promotion;
import ma.sir.rh.ws.dto.PromotionDto;

@Component
public class PromotionConverter extends AbstractConverter<Promotion, PromotionDto, PromotionHistory> {


    public  PromotionConverter(){
        super(Promotion.class, PromotionDto.class, PromotionHistory.class);
    }

    @Override
    public Promotion toItem(PromotionDto dto) {
        if (dto == null) {
            return null;
        } else {
        Promotion item = new Promotion();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDateDebutProfession()))
                item.setDateDebutProfession(DateUtil.stringEnToDate(dto.getDateDebutProfession()));
            if(StringUtil.isNotEmpty(dto.getDateDebutContrat()))
                item.setDateDebutContrat(DateUtil.stringEnToDate(dto.getDateDebutContrat()));


        return item;
        }
    }

    @Override
    public PromotionDto toDto(Promotion item) {
        if (item == null) {
            return null;
        } else {
            PromotionDto dto = new PromotionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(item.getDateDebutProfession()!=null)
                dto.setDateDebutProfession(DateUtil.dateTimeToString(item.getDateDebutProfession()));
            if(item.getDateDebutContrat()!=null)
                dto.setDateDebutContrat(DateUtil.dateTimeToString(item.getDateDebutContrat()));


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}

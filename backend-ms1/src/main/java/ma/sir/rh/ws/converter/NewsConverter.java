package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.NewsHistory;
import ma.sir.rh.bean.core.News;
import ma.sir.rh.ws.dto.NewsDto;

@Component
public class NewsConverter extends AbstractConverter<News, NewsDto, NewsHistory> {


    public  NewsConverter(){
        super(News.class, NewsDto.class, NewsHistory.class);
    }

    @Override
    public News toItem(NewsDto dto) {
        if (dto == null) {
            return null;
        } else {
        News item = new News();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getImage()))
                item.setImage(dto.getImage());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getDateNews()))
                item.setDateNews(DateUtil.stringEnToDate(dto.getDateNews()));
            if(dto.getArchive() != null)
                item.setArchive(dto.getArchive());
            if(StringUtil.isNotEmpty(dto.getNumeroOrdre()))
                item.setNumeroOrdre(dto.getNumeroOrdre());
            if(StringUtil.isNotEmpty(dto.getDestinataire()))
                item.setDestinataire(dto.getDestinataire());


        return item;
        }
    }

    @Override
    public NewsDto toDto(News item) {
        if (item == null) {
            return null;
        } else {
            NewsDto dto = new NewsDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getImage()))
                dto.setImage(item.getImage());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(item.getDateNews()!=null)
                dto.setDateNews(DateUtil.dateTimeToString(item.getDateNews()));
                dto.setArchive(item.getArchive());
            if(StringUtil.isNotEmpty(item.getNumeroOrdre()))
                dto.setNumeroOrdre(item.getNumeroOrdre());
            if(StringUtil.isNotEmpty(item.getDestinataire()))
                dto.setDestinataire(item.getDestinataire());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}

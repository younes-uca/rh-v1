package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.EmployeHistory;
import ma.sir.rh.bean.core.Employe;
import ma.sir.rh.ws.dto.EmployeDto;

@Component
public class EmployeConverter extends AbstractConverter<Employe, EmployeDto, EmployeHistory> {

    @Autowired
    private EducationConverter educationConverter ;
    @Autowired
    private DepartementConverter departementConverter ;
    @Autowired
    private SexeConverter sexeConverter ;
    @Autowired
    private PromotionConverter promotionConverter ;
    @Autowired
    private CategorieEmployeConverter categorieEmployeConverter ;
    private boolean sexe;
    private boolean departement;
    private boolean categorieEmploye;
    private boolean promotion;
    private boolean education;

    public  EmployeConverter(){
        super(Employe.class, EmployeDto.class, EmployeHistory.class);
    }

    @Override
    public Employe toItem(EmployeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Employe item = new Employe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getIdentifiantJlinx()))
                item.setIdentifiantJlinx(dto.getIdentifiantJlinx());
            if(StringUtil.isNotEmpty(dto.getMatricule()))
                item.setMatricule(dto.getMatricule());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getSituation()))
                item.setSituation(dto.getSituation());
            if(StringUtil.isNotEmpty(dto.getDateNaissance()))
                item.setDateNaissance(DateUtil.stringEnToDate(dto.getDateNaissance()));
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());
            if(StringUtil.isNotEmpty(dto.getVille()))
                item.setVille(dto.getVille());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getNumeroAdhesion()))
                item.setNumeroAdhesion(dto.getNumeroAdhesion());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getRib()))
                item.setRib(dto.getRib());
            if(StringUtil.isNotEmpty(dto.getAge()))
                item.setAge(dto.getAge());
            if(StringUtil.isNotEmpty(dto.getNumeroTelephone()))
                item.setNumeroTelephone(dto.getNumeroTelephone());
            if(StringUtil.isNotEmpty(dto.getEmergencyContact()))
                item.setEmergencyContact(dto.getEmergencyContact());
            if(StringUtil.isNotEmpty(dto.getNumeroSecuriteSociale()))
                item.setNumeroSecuriteSociale(dto.getNumeroSecuriteSociale());
            if(StringUtil.isNotEmpty(dto.getWarnningNotice()))
                item.setWarnningNotice(dto.getWarnningNotice());
            if(StringUtil.isNotEmpty(dto.getCost()))
                item.setCost(dto.getCost());
            if(StringUtil.isNotEmpty(dto.getAssuranceCost()))
                item.setAssuranceCost(dto.getAssuranceCost());
            if(dto.getEtude() != null)
                item.setEtude(dto.getEtude());
            if(dto.getExperience() != null)
                item.setExperience(dto.getExperience());
            if(StringUtil.isNotEmpty(dto.getSalaire()))
                item.setSalaire(dto.getSalaire());
            if(this.sexe && dto.getSexe()!=null)
                item.setSexe(sexeConverter.toItem(dto.getSexe())) ;

            if(this.departement && dto.getDepartement()!=null)
                item.setDepartement(departementConverter.toItem(dto.getDepartement())) ;

            if(this.categorieEmploye && dto.getCategorieEmploye()!=null)
                item.setCategorieEmploye(categorieEmployeConverter.toItem(dto.getCategorieEmploye())) ;

            if(this.promotion && dto.getPromotion()!=null)
                item.setPromotion(promotionConverter.toItem(dto.getPromotion())) ;

            if(this.education && dto.getEducation()!=null)
                item.setEducation(educationConverter.toItem(dto.getEducation())) ;



        return item;
        }
    }

    @Override
    public EmployeDto toDto(Employe item) {
        if (item == null) {
            return null;
        } else {
            EmployeDto dto = new EmployeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getIdentifiantJlinx()))
                dto.setIdentifiantJlinx(item.getIdentifiantJlinx());
            if(StringUtil.isNotEmpty(item.getMatricule()))
                dto.setMatricule(item.getMatricule());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getSituation()))
                dto.setSituation(item.getSituation());
            if(item.getDateNaissance()!=null)
                dto.setDateNaissance(DateUtil.dateTimeToString(item.getDateNaissance()));
            if(StringUtil.isNotEmpty(item.getAdresse()))
                dto.setAdresse(item.getAdresse());
            if(StringUtil.isNotEmpty(item.getVille()))
                dto.setVille(item.getVille());
            if(StringUtil.isNotEmpty(item.getCin()))
                dto.setCin(item.getCin());
            if(StringUtil.isNotEmpty(item.getNumeroAdhesion()))
                dto.setNumeroAdhesion(item.getNumeroAdhesion());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getRib()))
                dto.setRib(item.getRib());
            if(StringUtil.isNotEmpty(item.getAge()))
                dto.setAge(item.getAge());
            if(StringUtil.isNotEmpty(item.getNumeroTelephone()))
                dto.setNumeroTelephone(item.getNumeroTelephone());
            if(StringUtil.isNotEmpty(item.getEmergencyContact()))
                dto.setEmergencyContact(item.getEmergencyContact());
            if(StringUtil.isNotEmpty(item.getNumeroSecuriteSociale()))
                dto.setNumeroSecuriteSociale(item.getNumeroSecuriteSociale());
            if(StringUtil.isNotEmpty(item.getWarnningNotice()))
                dto.setWarnningNotice(item.getWarnningNotice());
            if(StringUtil.isNotEmpty(item.getCost()))
                dto.setCost(item.getCost());
            if(StringUtil.isNotEmpty(item.getAssuranceCost()))
                dto.setAssuranceCost(item.getAssuranceCost());
                dto.setEtude(item.getEtude());
                dto.setExperience(item.getExperience());
            if(StringUtil.isNotEmpty(item.getSalaire()))
                dto.setSalaire(item.getSalaire());
        if(this.sexe && item.getSexe()!=null) {
            dto.setSexe(sexeConverter.toDto(item.getSexe())) ;
        }
        if(this.departement && item.getDepartement()!=null) {
            departementConverter.setEmploye(false);
            dto.setDepartement(departementConverter.toDto(item.getDepartement())) ;
            departementConverter.setEmploye(true);
        }
        if(this.categorieEmploye && item.getCategorieEmploye()!=null) {
            dto.setCategorieEmploye(categorieEmployeConverter.toDto(item.getCategorieEmploye())) ;
        }
        if(this.promotion && item.getPromotion()!=null) {
            dto.setPromotion(promotionConverter.toDto(item.getPromotion())) ;
        }
        if(this.education && item.getEducation()!=null) {
            dto.setEducation(educationConverter.toDto(item.getEducation())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.sexe = value;
        this.departement = value;
        this.categorieEmploye = value;
        this.promotion = value;
        this.education = value;
    }


    public EducationConverter getEducationConverter(){
        return this.educationConverter;
    }
    public void setEducationConverter(EducationConverter educationConverter ){
        this.educationConverter = educationConverter;
    }
    public DepartementConverter getDepartementConverter(){
        return this.departementConverter;
    }
    public void setDepartementConverter(DepartementConverter departementConverter ){
        this.departementConverter = departementConverter;
    }
    public SexeConverter getSexeConverter(){
        return this.sexeConverter;
    }
    public void setSexeConverter(SexeConverter sexeConverter ){
        this.sexeConverter = sexeConverter;
    }
    public PromotionConverter getPromotionConverter(){
        return this.promotionConverter;
    }
    public void setPromotionConverter(PromotionConverter promotionConverter ){
        this.promotionConverter = promotionConverter;
    }
    public CategorieEmployeConverter getCategorieEmployeConverter(){
        return this.categorieEmployeConverter;
    }
    public void setCategorieEmployeConverter(CategorieEmployeConverter categorieEmployeConverter ){
        this.categorieEmployeConverter = categorieEmployeConverter;
    }
    public boolean  isSexe(){
        return this.sexe;
    }
    public void  setSexe(boolean sexe){
        this.sexe = sexe;
    }
    public boolean  isDepartement(){
        return this.departement;
    }
    public void  setDepartement(boolean departement){
        this.departement = departement;
    }
    public boolean  isCategorieEmploye(){
        return this.categorieEmploye;
    }
    public void  setCategorieEmploye(boolean categorieEmploye){
        this.categorieEmploye = categorieEmploye;
    }
    public boolean  isPromotion(){
        return this.promotion;
    }
    public void  setPromotion(boolean promotion){
        this.promotion = promotion;
    }
    public boolean  isEducation(){
        return this.education;
    }
    public void  setEducation(boolean education){
        this.education = education;
    }
}

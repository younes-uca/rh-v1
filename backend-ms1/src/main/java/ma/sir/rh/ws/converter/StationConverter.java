package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.rh.zynerator.util.ListUtil;


import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.StationHistory;
import ma.sir.rh.bean.core.Station;
import ma.sir.rh.ws.dto.StationDto;

@Component
public class StationConverter extends AbstractConverter<Station, StationDto, StationHistory> {

    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private DepartementConverter departementConverter ;
    @Autowired
    private SiegeConverter siegeConverter ;
    @Autowired
    private VilleConverter villeConverter ;
    private boolean employe;
    private boolean ville;
    private boolean departements;

    public  StationConverter(){
        super(Station.class, StationDto.class, StationHistory.class);
        init(true);
    }

    @Override
    public Station toItem(StationDto dto) {
        if (dto == null) {
            return null;
        } else {
        Station item = new Station();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;

            if(this.ville && dto.getVille()!=null)
                item.setVille(villeConverter.toItem(dto.getVille())) ;


            if(this.departements && ListUtil.isNotEmpty(dto.getDepartements()))
                item.setDepartements(departementConverter.toItem(dto.getDepartements()));

        return item;
        }
    }

    @Override
    public StationDto toDto(Station item) {
        if (item == null) {
            return null;
        } else {
            StationDto dto = new StationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getAdresse()))
                dto.setAdresse(item.getAdresse());
        if(this.employe && item.getEmploye()!=null) {
            dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;
        }
        if(this.ville && item.getVille()!=null) {
            dto.setVille(villeConverter.toDto(item.getVille())) ;
        }
        if(this.departements && ListUtil.isNotEmpty(item.getDepartements())){
            departementConverter.init(true);
            departementConverter.setStation(false);
            dto.setDepartements(departementConverter.toDto(item.getDepartements()));
            departementConverter.setStation(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.departements = value;
    }

    public void initObject(boolean value) {
        this.employe = value;
        this.ville = value;
    }


    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public DepartementConverter getDepartementConverter(){
        return this.departementConverter;
    }
    public void setDepartementConverter(DepartementConverter departementConverter ){
        this.departementConverter = departementConverter;
    }
    public SiegeConverter getSiegeConverter(){
        return this.siegeConverter;
    }
    public void setSiegeConverter(SiegeConverter siegeConverter ){
        this.siegeConverter = siegeConverter;
    }
    public VilleConverter getVilleConverter(){
        return this.villeConverter;
    }
    public void setVilleConverter(VilleConverter villeConverter ){
        this.villeConverter = villeConverter;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
    public boolean  isVille(){
        return this.ville;
    }
    public void  setVille(boolean ville){
        this.ville = ville;
    }
    public boolean  isDepartements(){
        return this.departements ;
    }
    public void  setDepartements(boolean departements ){
        this.departements  = departements ;
    }
}

package  ma.sir.rh.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.rh.bean.core.Station;

import ma.sir.rh.zynerator.util.StringUtil;
import ma.sir.rh.zynerator.converter.AbstractConverter;
import ma.sir.rh.zynerator.util.DateUtil;
import ma.sir.rh.bean.history.DepartementHistory;
import ma.sir.rh.bean.core.Departement;
import ma.sir.rh.ws.dto.DepartementDto;

@Component
public class DepartementConverter extends AbstractConverter<Departement, DepartementDto, DepartementHistory> {

    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private StationConverter stationConverter ;
    @Autowired
    private SiegeConverter siegeConverter ;
    private boolean siege;
    private boolean employe;
    private boolean station;

    public  DepartementConverter(){
        super(Departement.class, DepartementDto.class, DepartementHistory.class);
    }

    @Override
    public Departement toItem(DepartementDto dto) {
        if (dto == null) {
            return null;
        } else {
        Departement item = new Departement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNbrEmploye()))
                item.setNbrEmploye(dto.getNbrEmploye());
            if(StringUtil.isNotEmpty(dto.getMoyenneAge()))
                item.setMoyenneAge(dto.getMoyenneAge());
            if(this.siege && dto.getSiege()!=null)
                item.setSiege(siegeConverter.toItem(dto.getSiege())) ;

            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;

            if(dto.getStation() != null && dto.getStation().getId() != null){
                item.setStation(new Station());
                item.getStation().setId(dto.getStation().getId());
            }



        return item;
        }
    }

    @Override
    public DepartementDto toDto(Departement item) {
        if (item == null) {
            return null;
        } else {
            DepartementDto dto = new DepartementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNbrEmploye()))
                dto.setNbrEmploye(item.getNbrEmploye());
            if(StringUtil.isNotEmpty(item.getMoyenneAge()))
                dto.setMoyenneAge(item.getMoyenneAge());
        if(this.siege && item.getSiege()!=null) {
            dto.setSiege(siegeConverter.toDto(item.getSiege())) ;
        }
        if(this.employe && item.getEmploye()!=null) {
            employeConverter.setDepartement(false);
            dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;
            employeConverter.setDepartement(true);
        }
        if(this.station && item.getStation()!=null) {
            dto.setStation(stationConverter.toDto(item.getStation())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.siege = value;
        this.employe = value;
        this.station = value;
    }


    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public StationConverter getStationConverter(){
        return this.stationConverter;
    }
    public void setStationConverter(StationConverter stationConverter ){
        this.stationConverter = stationConverter;
    }
    public SiegeConverter getSiegeConverter(){
        return this.siegeConverter;
    }
    public void setSiegeConverter(SiegeConverter siegeConverter ){
        this.siegeConverter = siegeConverter;
    }
    public boolean  isSiege(){
        return this.siege;
    }
    public void  setSiege(boolean siege){
        this.siege = siege;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
    public boolean  isStation(){
        return this.station;
    }
    public void  setStation(boolean station){
        this.station = station;
    }
}

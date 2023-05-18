package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Station;
import ma.sir.rh.dao.criteria.core.StationCriteria;
import ma.sir.rh.dao.criteria.history.StationHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface StationAdminService extends  IService<Station,StationCriteria, StationHistoryCriteria>  {

    List<Station> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<Station> findByVilleId(Long id);
    int deleteByVilleId(Long id);



}

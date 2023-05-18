package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Departement;
import ma.sir.rh.dao.criteria.core.DepartementCriteria;
import ma.sir.rh.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface DepartementAdminService extends  IService<Departement,DepartementCriteria, DepartementHistoryCriteria>  {

    List<Departement> findBySiegeId(Long id);
    int deleteBySiegeId(Long id);
    List<Departement> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<Departement> findByStationId(Long id);
    int deleteByStationId(Long id);



}

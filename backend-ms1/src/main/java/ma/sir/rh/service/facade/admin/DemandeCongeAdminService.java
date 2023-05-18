package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.DemandeConge;
import ma.sir.rh.dao.criteria.core.DemandeCongeCriteria;
import ma.sir.rh.dao.criteria.history.DemandeCongeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface DemandeCongeAdminService extends  IService<DemandeConge,DemandeCongeCriteria, DemandeCongeHistoryCriteria>  {

    List<DemandeConge> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<DemandeConge> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<DemandeConge> findByEtatDemandeCongeId(Long id);
    int deleteByEtatDemandeCongeId(Long id);
    List<DemandeConge> findByTypeDemandeCongeId(Long id);
    int deleteByTypeDemandeCongeId(Long id);



}

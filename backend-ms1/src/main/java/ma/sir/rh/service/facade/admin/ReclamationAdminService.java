package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Reclamation;
import ma.sir.rh.dao.criteria.core.ReclamationCriteria;
import ma.sir.rh.dao.criteria.history.ReclamationHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface ReclamationAdminService extends  IService<Reclamation,ReclamationCriteria, ReclamationHistoryCriteria>  {

    List<Reclamation> findByTypeReclamationId(Long id);
    int deleteByTypeReclamationId(Long id);
    List<Reclamation> findByEtatReclamationId(Long id);
    int deleteByEtatReclamationId(Long id);
    List<Reclamation> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);



}

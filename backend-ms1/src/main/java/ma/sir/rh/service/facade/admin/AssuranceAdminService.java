package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Assurance;
import ma.sir.rh.dao.criteria.core.AssuranceCriteria;
import ma.sir.rh.dao.criteria.history.AssuranceHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface AssuranceAdminService extends  IService<Assurance,AssuranceCriteria, AssuranceHistoryCriteria>  {

    List<Assurance> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    List<Assurance> findByCompagnieAssuranceId(Long id);
    int deleteByCompagnieAssuranceId(Long id);
    List<Assurance> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<Assurance> findByLienParenteId(Long id);
    int deleteByLienParenteId(Long id);



}

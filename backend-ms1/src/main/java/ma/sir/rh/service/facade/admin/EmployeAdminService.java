package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Employe;
import ma.sir.rh.dao.criteria.core.EmployeCriteria;
import ma.sir.rh.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface EmployeAdminService extends  IService<Employe,EmployeCriteria, EmployeHistoryCriteria>  {

    List<Employe> findBySexeId(Long id);
    int deleteBySexeId(Long id);
    List<Employe> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<Employe> findByCategorieEmployeId(Long id);
    int deleteByCategorieEmployeId(Long id);
    List<Employe> findByPromotionId(Long id);
    int deleteByPromotionId(Long id);
    List<Employe> findByEducationId(Long id);
    int deleteByEducationId(Long id);



}

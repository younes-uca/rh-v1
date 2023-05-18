package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Employe;
import ma.sir.rh.bean.history.EmployeHistory;
import ma.sir.rh.dao.criteria.core.EmployeCriteria;
import ma.sir.rh.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.rh.dao.facade.core.EmployeDao;
import ma.sir.rh.dao.facade.history.EmployeHistoryDao;
import ma.sir.rh.dao.specification.core.EmployeSpecification;
import ma.sir.rh.service.facade.admin.EmployeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.EducationAdminService ;
import ma.sir.rh.service.facade.admin.DepartementAdminService ;
import ma.sir.rh.service.facade.admin.SexeAdminService ;
import ma.sir.rh.service.facade.admin.PromotionAdminService ;
import ma.sir.rh.service.facade.admin.CategorieEmployeAdminService ;


import java.util.List;
@Service
public class EmployeAdminServiceImpl extends AbstractServiceImpl<Employe,EmployeHistory, EmployeCriteria, EmployeHistoryCriteria, EmployeDao,
EmployeHistoryDao> implements EmployeAdminService {



    public List<Employe> findBySexeId(Long id){
        return dao.findBySexeId(id);
    }
    public int deleteBySexeId(Long id){
        return dao.deleteBySexeId(id);
    }
    public List<Employe> findByDepartementId(Long id){
        return dao.findByDepartementId(id);
    }
    public int deleteByDepartementId(Long id){
        return dao.deleteByDepartementId(id);
    }
    public List<Employe> findByCategorieEmployeId(Long id){
        return dao.findByCategorieEmployeId(id);
    }
    public int deleteByCategorieEmployeId(Long id){
        return dao.deleteByCategorieEmployeId(id);
    }
    public List<Employe> findByPromotionId(Long id){
        return dao.findByPromotionId(id);
    }
    public int deleteByPromotionId(Long id){
        return dao.deleteByPromotionId(id);
    }
    public List<Employe> findByEducationId(Long id){
        return dao.findByEducationId(id);
    }
    public int deleteByEducationId(Long id){
        return dao.deleteByEducationId(id);
    }



    public void configure() {
        super.configure(Employe.class,EmployeHistory.class, EmployeHistoryCriteria.class, EmployeSpecification.class);
    }

    @Autowired
    private EducationAdminService educationService ;
    @Autowired
    private DepartementAdminService departementService ;
    @Autowired
    private SexeAdminService sexeService ;
    @Autowired
    private PromotionAdminService promotionService ;
    @Autowired
    private CategorieEmployeAdminService categorieEmployeService ;

    public EmployeAdminServiceImpl(EmployeDao dao, EmployeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.DemandeConge;
import ma.sir.rh.bean.history.DemandeCongeHistory;
import ma.sir.rh.dao.criteria.core.DemandeCongeCriteria;
import ma.sir.rh.dao.criteria.history.DemandeCongeHistoryCriteria;
import ma.sir.rh.dao.facade.core.DemandeCongeDao;
import ma.sir.rh.dao.facade.history.DemandeCongeHistoryDao;
import ma.sir.rh.dao.specification.core.DemandeCongeSpecification;
import ma.sir.rh.service.facade.admin.DemandeCongeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.EmployeAdminService ;
import ma.sir.rh.service.facade.admin.EtatDemandeCongeAdminService ;
import ma.sir.rh.service.facade.admin.DepartementAdminService ;
import ma.sir.rh.service.facade.admin.TypeDemandeCongeAdminService ;


import java.util.List;
@Service
public class DemandeCongeAdminServiceImpl extends AbstractServiceImpl<DemandeConge,DemandeCongeHistory, DemandeCongeCriteria, DemandeCongeHistoryCriteria, DemandeCongeDao,
DemandeCongeHistoryDao> implements DemandeCongeAdminService {



    public List<DemandeConge> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public List<DemandeConge> findByDepartementId(Long id){
        return dao.findByDepartementId(id);
    }
    public int deleteByDepartementId(Long id){
        return dao.deleteByDepartementId(id);
    }
    public List<DemandeConge> findByEtatDemandeCongeId(Long id){
        return dao.findByEtatDemandeCongeId(id);
    }
    public int deleteByEtatDemandeCongeId(Long id){
        return dao.deleteByEtatDemandeCongeId(id);
    }
    public List<DemandeConge> findByTypeDemandeCongeId(Long id){
        return dao.findByTypeDemandeCongeId(id);
    }
    public int deleteByTypeDemandeCongeId(Long id){
        return dao.deleteByTypeDemandeCongeId(id);
    }



    public void configure() {
        super.configure(DemandeConge.class,DemandeCongeHistory.class, DemandeCongeHistoryCriteria.class, DemandeCongeSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;
    @Autowired
    private EtatDemandeCongeAdminService etatDemandeCongeService ;
    @Autowired
    private DepartementAdminService departementService ;
    @Autowired
    private TypeDemandeCongeAdminService typeDemandeCongeService ;

    public DemandeCongeAdminServiceImpl(DemandeCongeDao dao, DemandeCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
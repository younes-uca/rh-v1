package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Assurance;
import ma.sir.rh.bean.history.AssuranceHistory;
import ma.sir.rh.dao.criteria.core.AssuranceCriteria;
import ma.sir.rh.dao.criteria.history.AssuranceHistoryCriteria;
import ma.sir.rh.dao.facade.core.AssuranceDao;
import ma.sir.rh.dao.facade.history.AssuranceHistoryDao;
import ma.sir.rh.dao.specification.core.AssuranceSpecification;
import ma.sir.rh.service.facade.admin.AssuranceAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.EmployeAdminService ;
import ma.sir.rh.service.facade.admin.SocieteAdminService ;
import ma.sir.rh.service.facade.admin.CompagnieAssuranceAdminService ;
import ma.sir.rh.service.facade.admin.LienParenteAdminService ;


import java.util.List;
@Service
public class AssuranceAdminServiceImpl extends AbstractServiceImpl<Assurance,AssuranceHistory, AssuranceCriteria, AssuranceHistoryCriteria, AssuranceDao,
AssuranceHistoryDao> implements AssuranceAdminService {



    public List<Assurance> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }
    public List<Assurance> findByCompagnieAssuranceId(Long id){
        return dao.findByCompagnieAssuranceId(id);
    }
    public int deleteByCompagnieAssuranceId(Long id){
        return dao.deleteByCompagnieAssuranceId(id);
    }
    public List<Assurance> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public List<Assurance> findByLienParenteId(Long id){
        return dao.findByLienParenteId(id);
    }
    public int deleteByLienParenteId(Long id){
        return dao.deleteByLienParenteId(id);
    }



    public void configure() {
        super.configure(Assurance.class,AssuranceHistory.class, AssuranceHistoryCriteria.class, AssuranceSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;
    @Autowired
    private SocieteAdminService societeService ;
    @Autowired
    private CompagnieAssuranceAdminService compagnieAssuranceService ;
    @Autowired
    private LienParenteAdminService lienParenteService ;

    public AssuranceAdminServiceImpl(AssuranceDao dao, AssuranceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
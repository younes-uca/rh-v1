package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.SoldAnnuelConge;
import ma.sir.rh.bean.history.SoldAnnuelCongeHistory;
import ma.sir.rh.dao.criteria.core.SoldAnnuelCongeCriteria;
import ma.sir.rh.dao.criteria.history.SoldAnnuelCongeHistoryCriteria;
import ma.sir.rh.dao.facade.core.SoldAnnuelCongeDao;
import ma.sir.rh.dao.facade.history.SoldAnnuelCongeHistoryDao;
import ma.sir.rh.dao.specification.core.SoldAnnuelCongeSpecification;
import ma.sir.rh.service.facade.admin.SoldAnnuelCongeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.EmployeAdminService ;


import java.util.List;
@Service
public class SoldAnnuelCongeAdminServiceImpl extends AbstractServiceImpl<SoldAnnuelConge,SoldAnnuelCongeHistory, SoldAnnuelCongeCriteria, SoldAnnuelCongeHistoryCriteria, SoldAnnuelCongeDao,
SoldAnnuelCongeHistoryDao> implements SoldAnnuelCongeAdminService {



    public List<SoldAnnuelConge> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }



    public void configure() {
        super.configure(SoldAnnuelConge.class,SoldAnnuelCongeHistory.class, SoldAnnuelCongeHistoryCriteria.class, SoldAnnuelCongeSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;

    public SoldAnnuelCongeAdminServiceImpl(SoldAnnuelCongeDao dao, SoldAnnuelCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
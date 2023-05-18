package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.CompagnieAssurance;
import ma.sir.rh.bean.history.CompagnieAssuranceHistory;
import ma.sir.rh.dao.criteria.core.CompagnieAssuranceCriteria;
import ma.sir.rh.dao.criteria.history.CompagnieAssuranceHistoryCriteria;
import ma.sir.rh.dao.facade.core.CompagnieAssuranceDao;
import ma.sir.rh.dao.facade.history.CompagnieAssuranceHistoryDao;
import ma.sir.rh.dao.specification.core.CompagnieAssuranceSpecification;
import ma.sir.rh.service.facade.admin.CompagnieAssuranceAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class CompagnieAssuranceAdminServiceImpl extends AbstractServiceImpl<CompagnieAssurance,CompagnieAssuranceHistory, CompagnieAssuranceCriteria, CompagnieAssuranceHistoryCriteria, CompagnieAssuranceDao,
CompagnieAssuranceHistoryDao> implements CompagnieAssuranceAdminService {


    public CompagnieAssurance findByReferenceEntity(CompagnieAssurance t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(CompagnieAssurance.class,CompagnieAssuranceHistory.class, CompagnieAssuranceHistoryCriteria.class, CompagnieAssuranceSpecification.class);
    }


    public CompagnieAssuranceAdminServiceImpl(CompagnieAssuranceDao dao, CompagnieAssuranceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
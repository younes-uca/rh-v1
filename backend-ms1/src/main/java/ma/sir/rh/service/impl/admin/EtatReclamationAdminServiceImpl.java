package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatReclamation;
import ma.sir.rh.bean.history.EtatReclamationHistory;
import ma.sir.rh.dao.criteria.core.EtatReclamationCriteria;
import ma.sir.rh.dao.criteria.history.EtatReclamationHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatReclamationDao;
import ma.sir.rh.dao.facade.history.EtatReclamationHistoryDao;
import ma.sir.rh.dao.specification.core.EtatReclamationSpecification;
import ma.sir.rh.service.facade.admin.EtatReclamationAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatReclamationAdminServiceImpl extends AbstractServiceImpl<EtatReclamation,EtatReclamationHistory, EtatReclamationCriteria, EtatReclamationHistoryCriteria, EtatReclamationDao,
EtatReclamationHistoryDao> implements EtatReclamationAdminService {


    public EtatReclamation findByReferenceEntity(EtatReclamation t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatReclamation.class,EtatReclamationHistory.class, EtatReclamationHistoryCriteria.class, EtatReclamationSpecification.class);
    }


    public EtatReclamationAdminServiceImpl(EtatReclamationDao dao, EtatReclamationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
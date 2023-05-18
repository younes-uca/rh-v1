package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.EtatDemandeConge;
import ma.sir.rh.bean.history.EtatDemandeCongeHistory;
import ma.sir.rh.dao.criteria.core.EtatDemandeCongeCriteria;
import ma.sir.rh.dao.criteria.history.EtatDemandeCongeHistoryCriteria;
import ma.sir.rh.dao.facade.core.EtatDemandeCongeDao;
import ma.sir.rh.dao.facade.history.EtatDemandeCongeHistoryDao;
import ma.sir.rh.dao.specification.core.EtatDemandeCongeSpecification;
import ma.sir.rh.service.facade.admin.EtatDemandeCongeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatDemandeCongeAdminServiceImpl extends AbstractServiceImpl<EtatDemandeConge,EtatDemandeCongeHistory, EtatDemandeCongeCriteria, EtatDemandeCongeHistoryCriteria, EtatDemandeCongeDao,
EtatDemandeCongeHistoryDao> implements EtatDemandeCongeAdminService {


    public EtatDemandeConge findByReferenceEntity(EtatDemandeConge t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatDemandeConge.class,EtatDemandeCongeHistory.class, EtatDemandeCongeHistoryCriteria.class, EtatDemandeCongeSpecification.class);
    }


    public EtatDemandeCongeAdminServiceImpl(EtatDemandeCongeDao dao, EtatDemandeCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Siege;
import ma.sir.rh.bean.history.SiegeHistory;
import ma.sir.rh.dao.criteria.core.SiegeCriteria;
import ma.sir.rh.dao.criteria.history.SiegeHistoryCriteria;
import ma.sir.rh.dao.facade.core.SiegeDao;
import ma.sir.rh.dao.facade.history.SiegeHistoryDao;
import ma.sir.rh.dao.specification.core.SiegeSpecification;
import ma.sir.rh.service.facade.admin.SiegeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SiegeAdminServiceImpl extends AbstractServiceImpl<Siege,SiegeHistory, SiegeCriteria, SiegeHistoryCriteria, SiegeDao,
SiegeHistoryDao> implements SiegeAdminService {


    public Siege findByReferenceEntity(Siege t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Siege.class,SiegeHistory.class, SiegeHistoryCriteria.class, SiegeSpecification.class);
    }


    public SiegeAdminServiceImpl(SiegeDao dao, SiegeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Sexe;
import ma.sir.rh.bean.history.SexeHistory;
import ma.sir.rh.dao.criteria.core.SexeCriteria;
import ma.sir.rh.dao.criteria.history.SexeHistoryCriteria;
import ma.sir.rh.dao.facade.core.SexeDao;
import ma.sir.rh.dao.facade.history.SexeHistoryDao;
import ma.sir.rh.dao.specification.core.SexeSpecification;
import ma.sir.rh.service.facade.admin.SexeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SexeAdminServiceImpl extends AbstractServiceImpl<Sexe,SexeHistory, SexeCriteria, SexeHistoryCriteria, SexeDao,
SexeHistoryDao> implements SexeAdminService {


    public Sexe findByReferenceEntity(Sexe t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Sexe.class,SexeHistory.class, SexeHistoryCriteria.class, SexeSpecification.class);
    }


    public SexeAdminServiceImpl(SexeDao dao, SexeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
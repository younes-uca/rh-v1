package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Societe;
import ma.sir.rh.bean.history.SocieteHistory;
import ma.sir.rh.dao.criteria.core.SocieteCriteria;
import ma.sir.rh.dao.criteria.history.SocieteHistoryCriteria;
import ma.sir.rh.dao.facade.core.SocieteDao;
import ma.sir.rh.dao.facade.history.SocieteHistoryDao;
import ma.sir.rh.dao.specification.core.SocieteSpecification;
import ma.sir.rh.service.facade.admin.SocieteAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SocieteAdminServiceImpl extends AbstractServiceImpl<Societe,SocieteHistory, SocieteCriteria, SocieteHistoryCriteria, SocieteDao,
SocieteHistoryDao> implements SocieteAdminService {


    public Societe findByReferenceEntity(Societe t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Societe.class,SocieteHistory.class, SocieteHistoryCriteria.class, SocieteSpecification.class);
    }


    public SocieteAdminServiceImpl(SocieteDao dao, SocieteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
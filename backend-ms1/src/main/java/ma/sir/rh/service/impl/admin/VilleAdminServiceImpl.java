package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Ville;
import ma.sir.rh.bean.history.VilleHistory;
import ma.sir.rh.dao.criteria.core.VilleCriteria;
import ma.sir.rh.dao.criteria.history.VilleHistoryCriteria;
import ma.sir.rh.dao.facade.core.VilleDao;
import ma.sir.rh.dao.facade.history.VilleHistoryDao;
import ma.sir.rh.dao.specification.core.VilleSpecification;
import ma.sir.rh.service.facade.admin.VilleAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class VilleAdminServiceImpl extends AbstractServiceImpl<Ville,VilleHistory, VilleCriteria, VilleHistoryCriteria, VilleDao,
VilleHistoryDao> implements VilleAdminService {


    public Ville findByReferenceEntity(Ville t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Ville.class,VilleHistory.class, VilleHistoryCriteria.class, VilleSpecification.class);
    }


    public VilleAdminServiceImpl(VilleDao dao, VilleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
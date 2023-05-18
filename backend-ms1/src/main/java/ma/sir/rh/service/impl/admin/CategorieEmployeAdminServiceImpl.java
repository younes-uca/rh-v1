package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.CategorieEmploye;
import ma.sir.rh.bean.history.CategorieEmployeHistory;
import ma.sir.rh.dao.criteria.core.CategorieEmployeCriteria;
import ma.sir.rh.dao.criteria.history.CategorieEmployeHistoryCriteria;
import ma.sir.rh.dao.facade.core.CategorieEmployeDao;
import ma.sir.rh.dao.facade.history.CategorieEmployeHistoryDao;
import ma.sir.rh.dao.specification.core.CategorieEmployeSpecification;
import ma.sir.rh.service.facade.admin.CategorieEmployeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class CategorieEmployeAdminServiceImpl extends AbstractServiceImpl<CategorieEmploye,CategorieEmployeHistory, CategorieEmployeCriteria, CategorieEmployeHistoryCriteria, CategorieEmployeDao,
CategorieEmployeHistoryDao> implements CategorieEmployeAdminService {


    public CategorieEmploye findByReferenceEntity(CategorieEmploye t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(CategorieEmploye.class,CategorieEmployeHistory.class, CategorieEmployeHistoryCriteria.class, CategorieEmployeSpecification.class);
    }


    public CategorieEmployeAdminServiceImpl(CategorieEmployeDao dao, CategorieEmployeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
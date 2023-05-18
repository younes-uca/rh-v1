package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.LienParente;
import ma.sir.rh.bean.history.LienParenteHistory;
import ma.sir.rh.dao.criteria.core.LienParenteCriteria;
import ma.sir.rh.dao.criteria.history.LienParenteHistoryCriteria;
import ma.sir.rh.dao.facade.core.LienParenteDao;
import ma.sir.rh.dao.facade.history.LienParenteHistoryDao;
import ma.sir.rh.dao.specification.core.LienParenteSpecification;
import ma.sir.rh.service.facade.admin.LienParenteAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class LienParenteAdminServiceImpl extends AbstractServiceImpl<LienParente,LienParenteHistory, LienParenteCriteria, LienParenteHistoryCriteria, LienParenteDao,
LienParenteHistoryDao> implements LienParenteAdminService {


    public LienParente findByReferenceEntity(LienParente t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(LienParente.class,LienParenteHistory.class, LienParenteHistoryCriteria.class, LienParenteSpecification.class);
    }


    public LienParenteAdminServiceImpl(LienParenteDao dao, LienParenteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
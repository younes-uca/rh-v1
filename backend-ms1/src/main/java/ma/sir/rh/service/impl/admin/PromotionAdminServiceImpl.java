package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Promotion;
import ma.sir.rh.bean.history.PromotionHistory;
import ma.sir.rh.dao.criteria.core.PromotionCriteria;
import ma.sir.rh.dao.criteria.history.PromotionHistoryCriteria;
import ma.sir.rh.dao.facade.core.PromotionDao;
import ma.sir.rh.dao.facade.history.PromotionHistoryDao;
import ma.sir.rh.dao.specification.core.PromotionSpecification;
import ma.sir.rh.service.facade.admin.PromotionAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class PromotionAdminServiceImpl extends AbstractServiceImpl<Promotion,PromotionHistory, PromotionCriteria, PromotionHistoryCriteria, PromotionDao,
PromotionHistoryDao> implements PromotionAdminService {


    public Promotion findByReferenceEntity(Promotion t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Promotion.class,PromotionHistory.class, PromotionHistoryCriteria.class, PromotionSpecification.class);
    }


    public PromotionAdminServiceImpl(PromotionDao dao, PromotionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
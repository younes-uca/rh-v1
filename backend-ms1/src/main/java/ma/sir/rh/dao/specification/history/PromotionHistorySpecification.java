package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.PromotionHistoryCriteria;
import ma.sir.rh.bean.history.PromotionHistory;


public class PromotionHistorySpecification extends AbstractHistorySpecification<PromotionHistoryCriteria, PromotionHistory> {

    public PromotionHistorySpecification(PromotionHistoryCriteria criteria) {
        super(criteria);
    }

    public PromotionHistorySpecification(PromotionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

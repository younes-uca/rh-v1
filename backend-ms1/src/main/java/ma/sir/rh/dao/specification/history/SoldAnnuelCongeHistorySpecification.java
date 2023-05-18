package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.SoldAnnuelCongeHistoryCriteria;
import ma.sir.rh.bean.history.SoldAnnuelCongeHistory;


public class SoldAnnuelCongeHistorySpecification extends AbstractHistorySpecification<SoldAnnuelCongeHistoryCriteria, SoldAnnuelCongeHistory> {

    public SoldAnnuelCongeHistorySpecification(SoldAnnuelCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public SoldAnnuelCongeHistorySpecification(SoldAnnuelCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

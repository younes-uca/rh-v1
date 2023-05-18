package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.SiegeHistoryCriteria;
import ma.sir.rh.bean.history.SiegeHistory;


public class SiegeHistorySpecification extends AbstractHistorySpecification<SiegeHistoryCriteria, SiegeHistory> {

    public SiegeHistorySpecification(SiegeHistoryCriteria criteria) {
        super(criteria);
    }

    public SiegeHistorySpecification(SiegeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

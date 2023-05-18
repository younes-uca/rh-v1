package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.SexeHistoryCriteria;
import ma.sir.rh.bean.history.SexeHistory;


public class SexeHistorySpecification extends AbstractHistorySpecification<SexeHistoryCriteria, SexeHistory> {

    public SexeHistorySpecification(SexeHistoryCriteria criteria) {
        super(criteria);
    }

    public SexeHistorySpecification(SexeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

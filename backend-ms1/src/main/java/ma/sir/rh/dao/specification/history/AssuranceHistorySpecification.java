package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.AssuranceHistoryCriteria;
import ma.sir.rh.bean.history.AssuranceHistory;


public class AssuranceHistorySpecification extends AbstractHistorySpecification<AssuranceHistoryCriteria, AssuranceHistory> {

    public AssuranceHistorySpecification(AssuranceHistoryCriteria criteria) {
        super(criteria);
    }

    public AssuranceHistorySpecification(AssuranceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

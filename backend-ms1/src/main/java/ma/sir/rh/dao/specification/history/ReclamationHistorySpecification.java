package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.ReclamationHistoryCriteria;
import ma.sir.rh.bean.history.ReclamationHistory;


public class ReclamationHistorySpecification extends AbstractHistorySpecification<ReclamationHistoryCriteria, ReclamationHistory> {

    public ReclamationHistorySpecification(ReclamationHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationHistorySpecification(ReclamationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

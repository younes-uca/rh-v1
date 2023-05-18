package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.StationHistoryCriteria;
import ma.sir.rh.bean.history.StationHistory;


public class StationHistorySpecification extends AbstractHistorySpecification<StationHistoryCriteria, StationHistory> {

    public StationHistorySpecification(StationHistoryCriteria criteria) {
        super(criteria);
    }

    public StationHistorySpecification(StationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

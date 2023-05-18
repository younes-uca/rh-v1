package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.rh.bean.history.DepartementHistory;


public class DepartementHistorySpecification extends AbstractHistorySpecification<DepartementHistoryCriteria, DepartementHistory> {

    public DepartementHistorySpecification(DepartementHistoryCriteria criteria) {
        super(criteria);
    }

    public DepartementHistorySpecification(DepartementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

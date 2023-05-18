package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.rh.bean.history.EmployeHistory;


public class EmployeHistorySpecification extends AbstractHistorySpecification<EmployeHistoryCriteria, EmployeHistory> {

    public EmployeHistorySpecification(EmployeHistoryCriteria criteria) {
        super(criteria);
    }

    public EmployeHistorySpecification(EmployeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

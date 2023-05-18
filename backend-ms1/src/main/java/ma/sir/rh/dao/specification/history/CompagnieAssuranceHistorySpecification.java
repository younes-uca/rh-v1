package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.CompagnieAssuranceHistoryCriteria;
import ma.sir.rh.bean.history.CompagnieAssuranceHistory;


public class CompagnieAssuranceHistorySpecification extends AbstractHistorySpecification<CompagnieAssuranceHistoryCriteria, CompagnieAssuranceHistory> {

    public CompagnieAssuranceHistorySpecification(CompagnieAssuranceHistoryCriteria criteria) {
        super(criteria);
    }

    public CompagnieAssuranceHistorySpecification(CompagnieAssuranceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

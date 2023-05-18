package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EducationHistoryCriteria;
import ma.sir.rh.bean.history.EducationHistory;


public class EducationHistorySpecification extends AbstractHistorySpecification<EducationHistoryCriteria, EducationHistory> {

    public EducationHistorySpecification(EducationHistoryCriteria criteria) {
        super(criteria);
    }

    public EducationHistorySpecification(EducationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

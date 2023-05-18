package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.CategorieEmployeHistoryCriteria;
import ma.sir.rh.bean.history.CategorieEmployeHistory;


public class CategorieEmployeHistorySpecification extends AbstractHistorySpecification<CategorieEmployeHistoryCriteria, CategorieEmployeHistory> {

    public CategorieEmployeHistorySpecification(CategorieEmployeHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieEmployeHistorySpecification(CategorieEmployeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

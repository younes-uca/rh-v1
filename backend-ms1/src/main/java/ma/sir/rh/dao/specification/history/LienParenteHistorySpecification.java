package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.LienParenteHistoryCriteria;
import ma.sir.rh.bean.history.LienParenteHistory;


public class LienParenteHistorySpecification extends AbstractHistorySpecification<LienParenteHistoryCriteria, LienParenteHistory> {

    public LienParenteHistorySpecification(LienParenteHistoryCriteria criteria) {
        super(criteria);
    }

    public LienParenteHistorySpecification(LienParenteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

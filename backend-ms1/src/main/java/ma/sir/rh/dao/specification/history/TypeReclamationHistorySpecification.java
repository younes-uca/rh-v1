package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.TypeReclamationHistoryCriteria;
import ma.sir.rh.bean.history.TypeReclamationHistory;


public class TypeReclamationHistorySpecification extends AbstractHistorySpecification<TypeReclamationHistoryCriteria, TypeReclamationHistory> {

    public TypeReclamationHistorySpecification(TypeReclamationHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationHistorySpecification(TypeReclamationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.TypeDemandeCongeHistoryCriteria;
import ma.sir.rh.bean.history.TypeDemandeCongeHistory;


public class TypeDemandeCongeHistorySpecification extends AbstractHistorySpecification<TypeDemandeCongeHistoryCriteria, TypeDemandeCongeHistory> {

    public TypeDemandeCongeHistorySpecification(TypeDemandeCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeDemandeCongeHistorySpecification(TypeDemandeCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

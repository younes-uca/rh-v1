package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.DemandeCongeHistoryCriteria;
import ma.sir.rh.bean.history.DemandeCongeHistory;


public class DemandeCongeHistorySpecification extends AbstractHistorySpecification<DemandeCongeHistoryCriteria, DemandeCongeHistory> {

    public DemandeCongeHistorySpecification(DemandeCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public DemandeCongeHistorySpecification(DemandeCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

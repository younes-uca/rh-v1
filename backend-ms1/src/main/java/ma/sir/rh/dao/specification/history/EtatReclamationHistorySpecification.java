package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatReclamationHistoryCriteria;
import ma.sir.rh.bean.history.EtatReclamationHistory;


public class EtatReclamationHistorySpecification extends AbstractHistorySpecification<EtatReclamationHistoryCriteria, EtatReclamationHistory> {

    public EtatReclamationHistorySpecification(EtatReclamationHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatReclamationHistorySpecification(EtatReclamationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

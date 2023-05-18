package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.EtatDemandeCongeHistoryCriteria;
import ma.sir.rh.bean.history.EtatDemandeCongeHistory;


public class EtatDemandeCongeHistorySpecification extends AbstractHistorySpecification<EtatDemandeCongeHistoryCriteria, EtatDemandeCongeHistory> {

    public EtatDemandeCongeHistorySpecification(EtatDemandeCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatDemandeCongeHistorySpecification(EtatDemandeCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

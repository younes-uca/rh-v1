package  ma.sir.rh.dao.specification.history;

import ma.sir.rh.zynerator.specification.AbstractHistorySpecification;
import ma.sir.rh.dao.criteria.history.VilleHistoryCriteria;
import ma.sir.rh.bean.history.VilleHistory;


public class VilleHistorySpecification extends AbstractHistorySpecification<VilleHistoryCriteria, VilleHistory> {

    public VilleHistorySpecification(VilleHistoryCriteria criteria) {
        super(criteria);
    }

    public VilleHistorySpecification(VilleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

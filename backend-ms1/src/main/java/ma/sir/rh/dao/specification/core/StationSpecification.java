package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.StationCriteria;
import ma.sir.rh.bean.core.Station;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StationSpecification extends  AbstractSpecification<StationCriteria, Station>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
        addPredicateFk("ville","id", criteria.getVille()==null?null:criteria.getVille().getId());
        addPredicateFk("ville","id", criteria.getVilles());
        addPredicateFk("ville","code", criteria.getVille()==null?null:criteria.getVille().getCode());
    }

    public StationSpecification(StationCriteria criteria) {
        super(criteria);
    }

    public StationSpecification(StationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

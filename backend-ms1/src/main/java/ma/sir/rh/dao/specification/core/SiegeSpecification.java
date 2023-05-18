package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.SiegeCriteria;
import ma.sir.rh.bean.core.Siege;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SiegeSpecification extends  AbstractSpecification<SiegeCriteria, Siege>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public SiegeSpecification(SiegeCriteria criteria) {
        super(criteria);
    }

    public SiegeSpecification(SiegeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

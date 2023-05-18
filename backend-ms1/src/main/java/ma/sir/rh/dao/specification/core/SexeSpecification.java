package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.SexeCriteria;
import ma.sir.rh.bean.core.Sexe;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SexeSpecification extends  AbstractSpecification<SexeCriteria, Sexe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public SexeSpecification(SexeCriteria criteria) {
        super(criteria);
    }

    public SexeSpecification(SexeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

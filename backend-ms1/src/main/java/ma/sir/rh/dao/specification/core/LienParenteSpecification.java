package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.LienParenteCriteria;
import ma.sir.rh.bean.core.LienParente;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LienParenteSpecification extends  AbstractSpecification<LienParenteCriteria, LienParente>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public LienParenteSpecification(LienParenteCriteria criteria) {
        super(criteria);
    }

    public LienParenteSpecification(LienParenteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

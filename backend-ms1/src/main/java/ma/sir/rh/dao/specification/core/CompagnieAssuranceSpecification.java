package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.CompagnieAssuranceCriteria;
import ma.sir.rh.bean.core.CompagnieAssurance;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAssuranceSpecification extends  AbstractSpecification<CompagnieAssuranceCriteria, CompagnieAssurance>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public CompagnieAssuranceSpecification(CompagnieAssuranceCriteria criteria) {
        super(criteria);
    }

    public CompagnieAssuranceSpecification(CompagnieAssuranceCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

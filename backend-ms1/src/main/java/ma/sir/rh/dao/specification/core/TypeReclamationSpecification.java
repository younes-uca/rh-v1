package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.TypeReclamationCriteria;
import ma.sir.rh.bean.core.TypeReclamation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeReclamationSpecification extends  AbstractSpecification<TypeReclamationCriteria, TypeReclamation>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public TypeReclamationSpecification(TypeReclamationCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationSpecification(TypeReclamationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

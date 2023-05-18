package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.TypeDemandeCongeCriteria;
import ma.sir.rh.bean.core.TypeDemandeConge;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeDemandeCongeSpecification extends  AbstractSpecification<TypeDemandeCongeCriteria, TypeDemandeConge>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateInt("nbrJourConge", criteria.getNbrJourConge(), criteria.getNbrJourCongeMin(), criteria.getNbrJourCongeMax());
    }

    public TypeDemandeCongeSpecification(TypeDemandeCongeCriteria criteria) {
        super(criteria);
    }

    public TypeDemandeCongeSpecification(TypeDemandeCongeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

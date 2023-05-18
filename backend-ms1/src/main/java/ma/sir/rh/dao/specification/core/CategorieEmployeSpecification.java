package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.CategorieEmployeCriteria;
import ma.sir.rh.bean.core.CategorieEmploye;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CategorieEmployeSpecification extends  AbstractSpecification<CategorieEmployeCriteria, CategorieEmploye>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public CategorieEmployeSpecification(CategorieEmployeCriteria criteria) {
        super(criteria);
    }

    public CategorieEmployeSpecification(CategorieEmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

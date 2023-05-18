package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.EducationCriteria;
import ma.sir.rh.bean.core.Education;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EducationSpecification extends  AbstractSpecification<EducationCriteria, Education>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public EducationSpecification(EducationCriteria criteria) {
        super(criteria);
    }

    public EducationSpecification(EducationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

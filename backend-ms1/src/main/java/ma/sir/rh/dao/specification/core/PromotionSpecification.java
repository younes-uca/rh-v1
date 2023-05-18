package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.PromotionCriteria;
import ma.sir.rh.bean.core.Promotion;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PromotionSpecification extends  AbstractSpecification<PromotionCriteria, Promotion>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("dateDebutProfession", criteria.getDateDebutProfession(), criteria.getDateDebutProfessionFrom(), criteria.getDateDebutProfessionTo());
        addPredicate("dateDebutContrat", criteria.getDateDebutContrat(), criteria.getDateDebutContratFrom(), criteria.getDateDebutContratTo());
    }

    public PromotionSpecification(PromotionCriteria criteria) {
        super(criteria);
    }

    public PromotionSpecification(PromotionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

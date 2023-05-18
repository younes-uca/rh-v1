package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.ReclamationCriteria;
import ma.sir.rh.bean.core.Reclamation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ReclamationSpecification extends  AbstractSpecification<ReclamationCriteria, Reclamation>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateReclamation", criteria.getDateReclamation(), criteria.getDateReclamationFrom(), criteria.getDateReclamationTo());
        addPredicate("dateTraitement", criteria.getDateTraitement(), criteria.getDateTraitementFrom(), criteria.getDateTraitementTo());
        addPredicate("dateReponse", criteria.getDateReponse(), criteria.getDateReponseFrom(), criteria.getDateReponseTo());
        addPredicate("objetReclamation", criteria.getObjetReclamation(),criteria.getObjetReclamationLike());
        addPredicateFk("typeReclamation","id", criteria.getTypeReclamation()==null?null:criteria.getTypeReclamation().getId());
        addPredicateFk("typeReclamation","id", criteria.getTypeReclamations());
        addPredicateFk("typeReclamation","code", criteria.getTypeReclamation()==null?null:criteria.getTypeReclamation().getCode());
        addPredicateFk("etatReclamation","id", criteria.getEtatReclamation()==null?null:criteria.getEtatReclamation().getId());
        addPredicateFk("etatReclamation","id", criteria.getEtatReclamations());
        addPredicateFk("etatReclamation","code", criteria.getEtatReclamation()==null?null:criteria.getEtatReclamation().getCode());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
    }

    public ReclamationSpecification(ReclamationCriteria criteria) {
        super(criteria);
    }

    public ReclamationSpecification(ReclamationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

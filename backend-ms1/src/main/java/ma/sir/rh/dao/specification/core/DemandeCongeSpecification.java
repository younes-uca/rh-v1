package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.DemandeCongeCriteria;
import ma.sir.rh.bean.core.DemandeConge;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DemandeCongeSpecification extends  AbstractSpecification<DemandeCongeCriteria, DemandeConge>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("startTime", criteria.getStartTime(), criteria.getStartTimeFrom(), criteria.getStartTimeTo());
        addPredicate("endTime", criteria.getEndTime(), criteria.getEndTimeFrom(), criteria.getEndTimeTo());
        addPredicateInt("nbrJourConge", criteria.getNbrJourConge(), criteria.getNbrJourCongeMin(), criteria.getNbrJourCongeMax());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
        addPredicateFk("departement","id", criteria.getDepartement()==null?null:criteria.getDepartement().getId());
        addPredicateFk("departement","id", criteria.getDepartements());
        addPredicateFk("etatDemandeConge","id", criteria.getEtatDemandeConge()==null?null:criteria.getEtatDemandeConge().getId());
        addPredicateFk("etatDemandeConge","id", criteria.getEtatDemandeConges());
        addPredicateFk("etatDemandeConge","code", criteria.getEtatDemandeConge()==null?null:criteria.getEtatDemandeConge().getCode());
        addPredicateFk("typeDemandeConge","id", criteria.getTypeDemandeConge()==null?null:criteria.getTypeDemandeConge().getId());
        addPredicateFk("typeDemandeConge","id", criteria.getTypeDemandeConges());
        addPredicateFk("typeDemandeConge","code", criteria.getTypeDemandeConge()==null?null:criteria.getTypeDemandeConge().getCode());
    }

    public DemandeCongeSpecification(DemandeCongeCriteria criteria) {
        super(criteria);
    }

    public DemandeCongeSpecification(DemandeCongeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

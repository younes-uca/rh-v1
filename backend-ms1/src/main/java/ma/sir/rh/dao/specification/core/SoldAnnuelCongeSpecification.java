package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.SoldAnnuelCongeCriteria;
import ma.sir.rh.bean.core.SoldAnnuelConge;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SoldAnnuelCongeSpecification extends  AbstractSpecification<SoldAnnuelCongeCriteria, SoldAnnuelConge>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateInt("nbrJourTotale", criteria.getNbrJourTotale(), criteria.getNbrJourTotaleMin(), criteria.getNbrJourTotaleMax());
        addPredicateInt("nbrJourConsome", criteria.getNbrJourConsome(), criteria.getNbrJourConsomeMin(), criteria.getNbrJourConsomeMax());
        addPredicateInt("nbrJourRestant", criteria.getNbrJourRestant(), criteria.getNbrJourRestantMin(), criteria.getNbrJourRestantMax());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
    }

    public SoldAnnuelCongeSpecification(SoldAnnuelCongeCriteria criteria) {
        super(criteria);
    }

    public SoldAnnuelCongeSpecification(SoldAnnuelCongeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.AssuranceCriteria;
import ma.sir.rh.bean.core.Assurance;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AssuranceSpecification extends  AbstractSpecification<AssuranceCriteria, Assurance>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("numeroPolice", criteria.getNumeroPolice(),criteria.getNumeroPoliceLike());
        addPredicate("courtier", criteria.getCourtier(),criteria.getCourtierLike());
        addPredicate("malade", criteria.getMalade(),criteria.getMaladeLike());
        addPredicate("dateConsultation", criteria.getDateConsultation(), criteria.getDateConsultationFrom(), criteria.getDateConsultationTo());
        addPredicate("dateTransmission", criteria.getDateTransmission(), criteria.getDateTransmissionFrom(), criteria.getDateTransmissionTo());
        addPredicate("natureBesoin", criteria.getNatureBesoin(),criteria.getNatureBesoinLike());
        addPredicateBigDecimal("fraisEnagage", criteria.getFraisEnagage(), criteria.getFraisEnagageMin(), criteria.getFraisEnagageMax());
        addPredicate("dateEnvoi", criteria.getDateEnvoi(), criteria.getDateEnvoiFrom(), criteria.getDateEnvoiTo());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
        addPredicateFk("societe","code", criteria.getSociete()==null?null:criteria.getSociete().getCode());
        addPredicateFk("compagnieAssurance","id", criteria.getCompagnieAssurance()==null?null:criteria.getCompagnieAssurance().getId());
        addPredicateFk("compagnieAssurance","id", criteria.getCompagnieAssurances());
        addPredicateFk("compagnieAssurance","code", criteria.getCompagnieAssurance()==null?null:criteria.getCompagnieAssurance().getCode());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
        addPredicateFk("lienParente","id", criteria.getLienParente()==null?null:criteria.getLienParente().getId());
        addPredicateFk("lienParente","id", criteria.getLienParentes());
        addPredicateFk("lienParente","code", criteria.getLienParente()==null?null:criteria.getLienParente().getCode());
    }

    public AssuranceSpecification(AssuranceCriteria criteria) {
        super(criteria);
    }

    public AssuranceSpecification(AssuranceCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

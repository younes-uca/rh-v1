package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.EmployeCriteria;
import ma.sir.rh.bean.core.Employe;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EmployeSpecification extends  AbstractSpecification<EmployeCriteria, Employe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("identifiantJlinx", criteria.getIdentifiantJlinx(),criteria.getIdentifiantJlinxLike());
        addPredicate("matricule", criteria.getMatricule(),criteria.getMatriculeLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("situation", criteria.getSituation(),criteria.getSituationLike());
        addPredicate("dateNaissance", criteria.getDateNaissance(), criteria.getDateNaissanceFrom(), criteria.getDateNaissanceTo());
        addPredicate("adresse", criteria.getAdresse(),criteria.getAdresseLike());
        addPredicate("ville", criteria.getVille(),criteria.getVilleLike());
        addPredicate("cin", criteria.getCin(),criteria.getCinLike());
        addPredicate("numeroAdhesion", criteria.getNumeroAdhesion(),criteria.getNumeroAdhesionLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicate("rib", criteria.getRib(),criteria.getRibLike());
        addPredicateInt("age", criteria.getAge(), criteria.getAgeMin(), criteria.getAgeMax());
        addPredicate("numeroTelephone", criteria.getNumeroTelephone(),criteria.getNumeroTelephoneLike());
        addPredicate("emergencyContact", criteria.getEmergencyContact(),criteria.getEmergencyContactLike());
        addPredicate("numeroSecuriteSociale", criteria.getNumeroSecuriteSociale(),criteria.getNumeroSecuriteSocialeLike());
        addPredicate("warnningNotice", criteria.getWarnningNotice(),criteria.getWarnningNoticeLike());
        addPredicateBigDecimal("cost", criteria.getCost(), criteria.getCostMin(), criteria.getCostMax());
        addPredicateBigDecimal("assuranceCost", criteria.getAssuranceCost(), criteria.getAssuranceCostMin(), criteria.getAssuranceCostMax());
        addPredicateBool("etude", criteria.getEtude());
        addPredicateBool("experience", criteria.getExperience());
        addPredicateBigDecimal("salaire", criteria.getSalaire(), criteria.getSalaireMin(), criteria.getSalaireMax());
        addPredicateFk("sexe","id", criteria.getSexe()==null?null:criteria.getSexe().getId());
        addPredicateFk("sexe","id", criteria.getSexes());
        addPredicateFk("sexe","code", criteria.getSexe()==null?null:criteria.getSexe().getCode());
        addPredicateFk("departement","id", criteria.getDepartement()==null?null:criteria.getDepartement().getId());
        addPredicateFk("departement","id", criteria.getDepartements());
        addPredicateFk("categorieEmploye","id", criteria.getCategorieEmploye()==null?null:criteria.getCategorieEmploye().getId());
        addPredicateFk("categorieEmploye","id", criteria.getCategorieEmployes());
        addPredicateFk("categorieEmploye","code", criteria.getCategorieEmploye()==null?null:criteria.getCategorieEmploye().getCode());
        addPredicateFk("promotion","id", criteria.getPromotion()==null?null:criteria.getPromotion().getId());
        addPredicateFk("promotion","id", criteria.getPromotions());
        addPredicateFk("promotion","code", criteria.getPromotion()==null?null:criteria.getPromotion().getCode());
        addPredicateFk("education","id", criteria.getEducation()==null?null:criteria.getEducation().getId());
        addPredicateFk("education","id", criteria.getEducations());
        addPredicateFk("education","code", criteria.getEducation()==null?null:criteria.getEducation().getCode());
    }

    public EmployeSpecification(EmployeCriteria criteria) {
        super(criteria);
    }

    public EmployeSpecification(EmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

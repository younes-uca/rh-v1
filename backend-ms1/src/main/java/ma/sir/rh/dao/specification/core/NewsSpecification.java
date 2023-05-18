package  ma.sir.rh.dao.specification.core;

import ma.sir.rh.zynerator.specification.AbstractSpecification;
import ma.sir.rh.dao.criteria.core.NewsCriteria;
import ma.sir.rh.bean.core.News;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class NewsSpecification extends  AbstractSpecification<NewsCriteria, News>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("image", criteria.getImage(),criteria.getImageLike());
        addPredicate("dateNews", criteria.getDateNews(), criteria.getDateNewsFrom(), criteria.getDateNewsTo());
        addPredicateBool("archive", criteria.getArchive());
        addPredicateInt("numeroOrdre", criteria.getNumeroOrdre(), criteria.getNumeroOrdreMin(), criteria.getNumeroOrdreMax());
        addPredicate("destinataire", criteria.getDestinataire(),criteria.getDestinataireLike());
    }

    public NewsSpecification(NewsCriteria criteria) {
        super(criteria);
    }

    public NewsSpecification(NewsCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

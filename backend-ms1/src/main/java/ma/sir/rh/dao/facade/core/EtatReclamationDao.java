package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.EtatReclamation;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.EtatReclamation;
import java.util.List;


@Repository
public interface EtatReclamationDao extends AbstractRepository<EtatReclamation,Long>  {
    EtatReclamation findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatReclamation(item.id,item.libelle) FROM EtatReclamation item")
    List<EtatReclamation> findAllOptimized();
}

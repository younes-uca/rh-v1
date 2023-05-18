package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Societe;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Societe;
import java.util.List;


@Repository
public interface SocieteDao extends AbstractRepository<Societe,Long>  {
    Societe findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Societe(item.id,item.libelle) FROM Societe item")
    List<Societe> findAllOptimized();
}

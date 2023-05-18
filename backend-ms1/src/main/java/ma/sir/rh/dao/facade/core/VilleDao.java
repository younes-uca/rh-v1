package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Ville;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Ville;
import java.util.List;


@Repository
public interface VilleDao extends AbstractRepository<Ville,Long>  {
    Ville findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Ville(item.id,item.libelle) FROM Ville item")
    List<Ville> findAllOptimized();
}

package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Sexe;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Sexe;
import java.util.List;


@Repository
public interface SexeDao extends AbstractRepository<Sexe,Long>  {
    Sexe findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Sexe(item.id,item.libelle) FROM Sexe item")
    List<Sexe> findAllOptimized();
}

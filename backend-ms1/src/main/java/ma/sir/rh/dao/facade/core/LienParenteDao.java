package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.LienParente;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.LienParente;
import java.util.List;


@Repository
public interface LienParenteDao extends AbstractRepository<LienParente,Long>  {
    LienParente findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW LienParente(item.id,item.libelle) FROM LienParente item")
    List<LienParente> findAllOptimized();
}

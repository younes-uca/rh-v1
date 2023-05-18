package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.TypeReclamation;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.TypeReclamation;
import java.util.List;


@Repository
public interface TypeReclamationDao extends AbstractRepository<TypeReclamation,Long>  {
    TypeReclamation findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeReclamation(item.id,item.libelle) FROM TypeReclamation item")
    List<TypeReclamation> findAllOptimized();
}

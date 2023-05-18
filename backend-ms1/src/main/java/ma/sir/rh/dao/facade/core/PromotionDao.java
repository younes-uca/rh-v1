package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Promotion;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Promotion;
import java.util.List;


@Repository
public interface PromotionDao extends AbstractRepository<Promotion,Long>  {
    Promotion findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Promotion(item.id,item.libelle) FROM Promotion item")
    List<Promotion> findAllOptimized();
}

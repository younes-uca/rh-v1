package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.CategorieEmploye;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.CategorieEmploye;
import java.util.List;


@Repository
public interface CategorieEmployeDao extends AbstractRepository<CategorieEmploye,Long>  {
    CategorieEmploye findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW CategorieEmploye(item.id,item.libelle) FROM CategorieEmploye item")
    List<CategorieEmploye> findAllOptimized();
}

package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.CompagnieAssurance;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.CompagnieAssurance;
import java.util.List;


@Repository
public interface CompagnieAssuranceDao extends AbstractRepository<CompagnieAssurance,Long>  {
    CompagnieAssurance findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW CompagnieAssurance(item.id,item.libelle) FROM CompagnieAssurance item")
    List<CompagnieAssurance> findAllOptimized();
}

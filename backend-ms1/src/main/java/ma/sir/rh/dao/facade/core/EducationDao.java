package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Education;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Education;
import java.util.List;


@Repository
public interface EducationDao extends AbstractRepository<Education,Long>  {
    Education findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Education(item.id,item.libelle) FROM Education item")
    List<Education> findAllOptimized();
}

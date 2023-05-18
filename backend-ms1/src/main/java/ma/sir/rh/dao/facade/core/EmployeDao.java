package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Employe;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EmployeDao extends AbstractRepository<Employe,Long>  {

    List<Employe> findBySexeId(Long id);
    int deleteBySexeId(Long id);
    List<Employe> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<Employe> findByCategorieEmployeId(Long id);
    int deleteByCategorieEmployeId(Long id);
    List<Employe> findByPromotionId(Long id);
    int deleteByPromotionId(Long id);
    List<Employe> findByEducationId(Long id);
    int deleteByEducationId(Long id);

}

package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.DemandeConge;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DemandeCongeDao extends AbstractRepository<DemandeConge,Long>  {

    List<DemandeConge> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<DemandeConge> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    List<DemandeConge> findByEtatDemandeCongeId(Long id);
    int deleteByEtatDemandeCongeId(Long id);
    List<DemandeConge> findByTypeDemandeCongeId(Long id);
    int deleteByTypeDemandeCongeId(Long id);

}

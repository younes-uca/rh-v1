package ma.sir.rh.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Reclamation;
import org.springframework.stereotype.Repository;
import ma.sir.rh.bean.core.Reclamation;
import java.util.List;


@Repository
public interface ReclamationDao extends AbstractRepository<Reclamation,Long>  {
    Reclamation findByReference(String reference);
    int deleteByReference(String reference);

    List<Reclamation> findByTypeReclamationId(Long id);
    int deleteByTypeReclamationId(Long id);
    List<Reclamation> findByEtatReclamationId(Long id);
    int deleteByEtatReclamationId(Long id);
    List<Reclamation> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);

    @Query("SELECT NEW Reclamation(item.id,item.reference) FROM Reclamation item")
    List<Reclamation> findAllOptimized();
}

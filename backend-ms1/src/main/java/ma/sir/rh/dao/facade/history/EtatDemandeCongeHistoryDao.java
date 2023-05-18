package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EtatDemandeCongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatDemandeCongeHistoryDao extends AbstractHistoryRepository<EtatDemandeCongeHistory,Long> {

}

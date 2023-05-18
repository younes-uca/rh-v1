package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EtatReclamationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatReclamationHistoryDao extends AbstractHistoryRepository<EtatReclamationHistory,Long> {

}

package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.TypeReclamationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeReclamationHistoryDao extends AbstractHistoryRepository<TypeReclamationHistory,Long> {

}

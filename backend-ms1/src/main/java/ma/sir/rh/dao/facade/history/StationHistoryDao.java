package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.StationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StationHistoryDao extends AbstractHistoryRepository<StationHistory,Long> {

}

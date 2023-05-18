package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.VilleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleHistoryDao extends AbstractHistoryRepository<VilleHistory,Long> {

}

package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.AssuranceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuranceHistoryDao extends AbstractHistoryRepository<AssuranceHistory,Long> {

}

package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.DepartementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementHistoryDao extends AbstractHistoryRepository<DepartementHistory,Long> {

}

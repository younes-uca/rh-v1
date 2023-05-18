package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EmployeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeHistoryDao extends AbstractHistoryRepository<EmployeHistory,Long> {

}

package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.CategorieEmployeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieEmployeHistoryDao extends AbstractHistoryRepository<CategorieEmployeHistory,Long> {

}

package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.NewsHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsHistoryDao extends AbstractHistoryRepository<NewsHistory,Long> {

}

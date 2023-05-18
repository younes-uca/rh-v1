package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.CompagnieAssuranceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CompagnieAssuranceHistoryDao extends AbstractHistoryRepository<CompagnieAssuranceHistory,Long> {

}

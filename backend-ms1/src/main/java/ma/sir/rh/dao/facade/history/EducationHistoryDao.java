package ma.sir.rh.dao.facade.history;

import ma.sir.rh.zynerator.repository.AbstractHistoryRepository;
import ma.sir.rh.bean.history.EducationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationHistoryDao extends AbstractHistoryRepository<EducationHistory,Long> {

}

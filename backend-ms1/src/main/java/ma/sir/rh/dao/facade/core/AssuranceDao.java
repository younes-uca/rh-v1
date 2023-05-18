package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Assurance;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AssuranceDao extends AbstractRepository<Assurance,Long>  {

    List<Assurance> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);
    List<Assurance> findByCompagnieAssuranceId(Long id);
    int deleteByCompagnieAssuranceId(Long id);
    List<Assurance> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<Assurance> findByLienParenteId(Long id);
    int deleteByLienParenteId(Long id);

}

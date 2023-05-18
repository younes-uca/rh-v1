package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.SoldAnnuelConge;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SoldAnnuelCongeDao extends AbstractRepository<SoldAnnuelConge,Long>  {

    List<SoldAnnuelConge> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);

}

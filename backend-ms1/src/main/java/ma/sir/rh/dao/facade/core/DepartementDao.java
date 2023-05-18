package ma.sir.rh.dao.facade.core;

import ma.sir.rh.zynerator.repository.AbstractRepository;
import ma.sir.rh.bean.core.Departement;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DepartementDao extends AbstractRepository<Departement,Long>  {

    List<Departement> findBySiegeId(Long id);
    int deleteBySiegeId(Long id);
    List<Departement> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<Departement> findByStationId(Long id);
    int deleteByStationId(Long id);

}

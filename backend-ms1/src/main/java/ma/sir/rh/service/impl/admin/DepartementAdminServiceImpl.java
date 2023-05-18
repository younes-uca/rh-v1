package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Departement;
import ma.sir.rh.bean.history.DepartementHistory;
import ma.sir.rh.dao.criteria.core.DepartementCriteria;
import ma.sir.rh.dao.criteria.history.DepartementHistoryCriteria;
import ma.sir.rh.dao.facade.core.DepartementDao;
import ma.sir.rh.dao.facade.history.DepartementHistoryDao;
import ma.sir.rh.dao.specification.core.DepartementSpecification;
import ma.sir.rh.service.facade.admin.DepartementAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.EmployeAdminService ;
import ma.sir.rh.service.facade.admin.StationAdminService ;
import ma.sir.rh.service.facade.admin.SiegeAdminService ;


import java.util.List;
@Service
public class DepartementAdminServiceImpl extends AbstractServiceImpl<Departement,DepartementHistory, DepartementCriteria, DepartementHistoryCriteria, DepartementDao,
DepartementHistoryDao> implements DepartementAdminService {



    public List<Departement> findBySiegeId(Long id){
        return dao.findBySiegeId(id);
    }
    public int deleteBySiegeId(Long id){
        return dao.deleteBySiegeId(id);
    }
    public List<Departement> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public List<Departement> findByStationId(Long id){
        return dao.findByStationId(id);
    }
    public int deleteByStationId(Long id){
        return dao.deleteByStationId(id);
    }



    public void configure() {
        super.configure(Departement.class,DepartementHistory.class, DepartementHistoryCriteria.class, DepartementSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;
    @Autowired
    private StationAdminService stationService ;
    @Autowired
    private SiegeAdminService siegeService ;

    public DepartementAdminServiceImpl(DepartementDao dao, DepartementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
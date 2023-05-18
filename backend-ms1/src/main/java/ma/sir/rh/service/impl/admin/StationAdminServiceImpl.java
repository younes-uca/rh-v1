package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Station;
import ma.sir.rh.bean.history.StationHistory;
import ma.sir.rh.dao.criteria.core.StationCriteria;
import ma.sir.rh.dao.criteria.history.StationHistoryCriteria;
import ma.sir.rh.dao.facade.core.StationDao;
import ma.sir.rh.dao.facade.history.StationHistoryDao;
import ma.sir.rh.dao.specification.core.StationSpecification;
import ma.sir.rh.service.facade.admin.StationAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.rh.bean.core.Departement;

import ma.sir.rh.service.facade.admin.EmployeAdminService ;
import ma.sir.rh.service.facade.admin.DepartementAdminService ;
import ma.sir.rh.service.facade.admin.VilleAdminService ;


import java.util.List;
@Service
public class StationAdminServiceImpl extends AbstractServiceImpl<Station,StationHistory, StationCriteria, StationHistoryCriteria, StationDao,
StationHistoryDao> implements StationAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Station create(Station t) {
        super.create(t);
        if (t.getDepartements() != null) {
                t.getDepartements().forEach(element-> {
                    element.setStation(t);
                    departementService.create(element);
            });
        }
        return t;
    }

    public Station findWithAssociatedLists(Long id){
        Station result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setDepartements(departementService.findByStationId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        departementService.deleteByStationId(id);
    }


    public void updateWithAssociatedLists(Station station){
    if(station !=null && station.getId() != null){
            List<List<Departement>> resultDepartements= departementService.getToBeSavedAndToBeDeleted(departementService.findByStationId(station.getId()),station.getDepartements());
            departementService.delete(resultDepartements.get(1));
            ListUtil.emptyIfNull(resultDepartements.get(0)).forEach(e -> e.setStation(station));
            departementService.update(resultDepartements.get(0),true);
    }
    }


    public List<Station> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public List<Station> findByVilleId(Long id){
        return dao.findByVilleId(id);
    }
    public int deleteByVilleId(Long id){
        return dao.deleteByVilleId(id);
    }



    public void configure() {
        super.configure(Station.class,StationHistory.class, StationHistoryCriteria.class, StationSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;
    @Autowired
    private DepartementAdminService departementService ;
    @Autowired
    private VilleAdminService villeService ;

    public StationAdminServiceImpl(StationDao dao, StationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
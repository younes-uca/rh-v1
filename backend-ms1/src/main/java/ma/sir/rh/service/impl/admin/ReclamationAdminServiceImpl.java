package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Reclamation;
import ma.sir.rh.bean.history.ReclamationHistory;
import ma.sir.rh.dao.criteria.core.ReclamationCriteria;
import ma.sir.rh.dao.criteria.history.ReclamationHistoryCriteria;
import ma.sir.rh.dao.facade.core.ReclamationDao;
import ma.sir.rh.dao.facade.history.ReclamationHistoryDao;
import ma.sir.rh.dao.specification.core.ReclamationSpecification;
import ma.sir.rh.service.facade.admin.ReclamationAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.rh.service.facade.admin.EmployeAdminService ;
import ma.sir.rh.service.facade.admin.TypeReclamationAdminService ;
import ma.sir.rh.service.facade.admin.EtatReclamationAdminService ;


import java.util.List;
@Service
public class ReclamationAdminServiceImpl extends AbstractServiceImpl<Reclamation,ReclamationHistory, ReclamationCriteria, ReclamationHistoryCriteria, ReclamationDao,
ReclamationHistoryDao> implements ReclamationAdminService {


    public Reclamation findByReferenceEntity(Reclamation t){
        return  dao.findByReference(t.getReference());
    }

    public List<Reclamation> findByTypeReclamationId(Long id){
        return dao.findByTypeReclamationId(id);
    }
    public int deleteByTypeReclamationId(Long id){
        return dao.deleteByTypeReclamationId(id);
    }
    public List<Reclamation> findByEtatReclamationId(Long id){
        return dao.findByEtatReclamationId(id);
    }
    public int deleteByEtatReclamationId(Long id){
        return dao.deleteByEtatReclamationId(id);
    }
    public List<Reclamation> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }



    public void configure() {
        super.configure(Reclamation.class,ReclamationHistory.class, ReclamationHistoryCriteria.class, ReclamationSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;
    @Autowired
    private TypeReclamationAdminService typeReclamationService ;
    @Autowired
    private EtatReclamationAdminService etatReclamationService ;

    public ReclamationAdminServiceImpl(ReclamationDao dao, ReclamationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
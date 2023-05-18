package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.TypeReclamation;
import ma.sir.rh.bean.history.TypeReclamationHistory;
import ma.sir.rh.dao.criteria.core.TypeReclamationCriteria;
import ma.sir.rh.dao.criteria.history.TypeReclamationHistoryCriteria;
import ma.sir.rh.dao.facade.core.TypeReclamationDao;
import ma.sir.rh.dao.facade.history.TypeReclamationHistoryDao;
import ma.sir.rh.dao.specification.core.TypeReclamationSpecification;
import ma.sir.rh.service.facade.admin.TypeReclamationAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeReclamationAdminServiceImpl extends AbstractServiceImpl<TypeReclamation,TypeReclamationHistory, TypeReclamationCriteria, TypeReclamationHistoryCriteria, TypeReclamationDao,
TypeReclamationHistoryDao> implements TypeReclamationAdminService {


    public TypeReclamation findByReferenceEntity(TypeReclamation t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeReclamation.class,TypeReclamationHistory.class, TypeReclamationHistoryCriteria.class, TypeReclamationSpecification.class);
    }


    public TypeReclamationAdminServiceImpl(TypeReclamationDao dao, TypeReclamationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
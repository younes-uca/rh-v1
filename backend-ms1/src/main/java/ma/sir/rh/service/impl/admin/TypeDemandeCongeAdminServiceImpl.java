package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.TypeDemandeConge;
import ma.sir.rh.bean.history.TypeDemandeCongeHistory;
import ma.sir.rh.dao.criteria.core.TypeDemandeCongeCriteria;
import ma.sir.rh.dao.criteria.history.TypeDemandeCongeHistoryCriteria;
import ma.sir.rh.dao.facade.core.TypeDemandeCongeDao;
import ma.sir.rh.dao.facade.history.TypeDemandeCongeHistoryDao;
import ma.sir.rh.dao.specification.core.TypeDemandeCongeSpecification;
import ma.sir.rh.service.facade.admin.TypeDemandeCongeAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeDemandeCongeAdminServiceImpl extends AbstractServiceImpl<TypeDemandeConge,TypeDemandeCongeHistory, TypeDemandeCongeCriteria, TypeDemandeCongeHistoryCriteria, TypeDemandeCongeDao,
TypeDemandeCongeHistoryDao> implements TypeDemandeCongeAdminService {


    public TypeDemandeConge findByReferenceEntity(TypeDemandeConge t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeDemandeConge.class,TypeDemandeCongeHistory.class, TypeDemandeCongeHistoryCriteria.class, TypeDemandeCongeSpecification.class);
    }


    public TypeDemandeCongeAdminServiceImpl(TypeDemandeCongeDao dao, TypeDemandeCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
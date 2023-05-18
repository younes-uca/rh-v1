package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Education;
import ma.sir.rh.bean.history.EducationHistory;
import ma.sir.rh.dao.criteria.core.EducationCriteria;
import ma.sir.rh.dao.criteria.history.EducationHistoryCriteria;
import ma.sir.rh.dao.facade.core.EducationDao;
import ma.sir.rh.dao.facade.history.EducationHistoryDao;
import ma.sir.rh.dao.specification.core.EducationSpecification;
import ma.sir.rh.service.facade.admin.EducationAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EducationAdminServiceImpl extends AbstractServiceImpl<Education,EducationHistory, EducationCriteria, EducationHistoryCriteria, EducationDao,
EducationHistoryDao> implements EducationAdminService {


    public Education findByReferenceEntity(Education t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Education.class,EducationHistory.class, EducationHistoryCriteria.class, EducationSpecification.class);
    }


    public EducationAdminServiceImpl(EducationDao dao, EducationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
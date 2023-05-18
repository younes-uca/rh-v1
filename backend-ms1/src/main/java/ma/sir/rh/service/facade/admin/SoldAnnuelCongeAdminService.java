package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.SoldAnnuelConge;
import ma.sir.rh.dao.criteria.core.SoldAnnuelCongeCriteria;
import ma.sir.rh.dao.criteria.history.SoldAnnuelCongeHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface SoldAnnuelCongeAdminService extends  IService<SoldAnnuelConge,SoldAnnuelCongeCriteria, SoldAnnuelCongeHistoryCriteria>  {

    List<SoldAnnuelConge> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);



}

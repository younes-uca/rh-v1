package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.EtatReclamation;
import ma.sir.rh.dao.criteria.core.EtatReclamationCriteria;
import ma.sir.rh.dao.criteria.history.EtatReclamationHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface EtatReclamationAdminService extends  IService<EtatReclamation,EtatReclamationCriteria, EtatReclamationHistoryCriteria>  {




}

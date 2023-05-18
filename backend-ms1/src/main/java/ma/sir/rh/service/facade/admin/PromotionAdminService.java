package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.Promotion;
import ma.sir.rh.dao.criteria.core.PromotionCriteria;
import ma.sir.rh.dao.criteria.history.PromotionHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface PromotionAdminService extends  IService<Promotion,PromotionCriteria, PromotionHistoryCriteria>  {




}

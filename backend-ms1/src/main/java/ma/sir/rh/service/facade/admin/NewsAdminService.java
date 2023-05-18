package ma.sir.rh.service.facade.admin;

import java.util.List;
import ma.sir.rh.bean.core.News;
import ma.sir.rh.dao.criteria.core.NewsCriteria;
import ma.sir.rh.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.rh.zynerator.service.IService;


public interface NewsAdminService extends  IService<News,NewsCriteria, NewsHistoryCriteria>  {




}

package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.News;
import ma.sir.rh.bean.history.NewsHistory;
import ma.sir.rh.dao.criteria.core.NewsCriteria;
import ma.sir.rh.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.rh.dao.facade.core.NewsDao;
import ma.sir.rh.dao.facade.history.NewsHistoryDao;
import ma.sir.rh.dao.specification.core.NewsSpecification;
import ma.sir.rh.service.facade.admin.NewsAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import ma.sir.rh.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NewsAdminServiceImpl extends AbstractServiceImpl<News,NewsHistory, NewsCriteria, NewsHistoryCriteria, NewsDao,
NewsHistoryDao> implements NewsAdminService {


    public News findByReferenceEntity(News t){
        return  dao.findByRef(t.getRef());
    }




    public void configure() {
        super.configure(News.class,NewsHistory.class, NewsHistoryCriteria.class, NewsSpecification.class);
    }


    public NewsAdminServiceImpl(NewsDao dao, NewsHistoryDao historyDao) {
        super(dao, historyDao);
    }

}
package ee.seb.finance.dao;

import ee.seb.finance.model.Report;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ReportDaoImpl implements ReportDao {

    private static final Logger logger = LoggerFactory.getLogger(ReportDaoImpl.class);

    @Resource(name="localSessionFactoryBean")
    private SessionFactory sessionFactory;

    @Override
    public List<Report> getReports() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Report> reportList = session.createCriteria(Report.class).list();
        for (Report report : reportList) {
            logger.info("Reports List:" + report);
        }
        return reportList;
    }
    @Override
    public List<Report> getMostRecentReport() {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createSQLQuery("SELECT * FROM findoc f" +
                " where f.Financial_date = (SELECT max(f2.Financial_date) from findoc f2 where f2.Customer_id = f.Customer_id)" +
                " and (f.No_months BETWEEN 12 AND 18)" +
                " and f.Financial_date >= (now() - interval 18 month)" +
                " and f.Flg_audit = IF((SELECT min(f3.Flg_audit) from findoc f3 where f3.Customer_id = f.Customer_id) = 2,3,1)").addEntity(Report.class);
        List<Report> reportList = query.list();
        for (Report report : reportList) {
            logger.info("Reports List:" + report);
        }
        return reportList;
    }
}

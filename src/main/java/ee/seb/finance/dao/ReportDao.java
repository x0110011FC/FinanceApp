package ee.seb.finance.dao;

import ee.seb.finance.model.Report;
import java.util.List;

public interface ReportDao {
    List<Report> getReports();
    List<Report> getMostRecentReport();
}

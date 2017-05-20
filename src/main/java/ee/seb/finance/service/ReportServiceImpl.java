package ee.seb.finance.service;

import ee.seb.finance.model.Report;
import ee.seb.finance.dao.ReportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportDao reportDao;

    @Override
    @Transactional
    public List<Report> getReports() {
        return reportDao.getReports();
    }

    @Override
    @Transactional
    public List<Report> getMostRecentReport() {
        return reportDao.getMostRecentReport();
    }


}

package ee.seb.finance.service;

import ee.seb.finance.model.Report;

import java.util.List;

public interface ReportService {
    List<Report> getReports();
    List<Report> getMostRecentReport();
}

package ee.seb.finance.controller;


import ee.seb.finance.service.ReportService;
import ee.seb.finance.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private ReportService reportService;

    @RequestMapping("/")
    public String main() {
        return "redirect:/reports";
    }

    @RequestMapping(value = "reports", method = RequestMethod.GET)
    public String reports(Model model) {
        List<Report> reportsList = reportService.getReports();
        model.addAttribute("reports", reportsList);
        return "reports";
    }
    @RequestMapping(value = "reports/edited", method = RequestMethod.GET)
    public String reportsedited(Model model) {
        List<Report> editedReportsList = reportService.getMostRecentReport();
        model.addAttribute("editedreport", editedReportsList);
        return "editedreport";
    }
}

package services;

import patterns.ReportStrategy;
import entities.Loan;
import java.util.List;

public class Report {
    private ReportStrategy reportStrategy;

    public Report(ReportStrategy reportStrategy) {
        this.reportStrategy = reportStrategy;
    }

    public void generate(List<Loan> loans) {
        reportStrategy.generateReport(loans);
    }

    public void setReportStrategy(ReportStrategy reportStrategy) {
        this.reportStrategy = reportStrategy;
    }
}

package patterns;

import entities.Loan;
import java.util.List;

public class DateReportStrategy implements ReportStrategy {
    @Override
    public void generateReport(List<Loan> loans) {
        System.out.println("Generating report by date:");
        loans.stream()
                .sorted((l1, l2) -> l1.getLoanDate().compareTo(l2.getLoanDate()))
                .forEach(loan -> System.out.println("Loan on: " + loan.getLoanDate()));
    }
}

package patterns;

import entities.Loan;
import java.util.List;

public class PopularityReportStrategy implements ReportStrategy {
    @Override
    public void generateReport(List<Loan> loans) {
        System.out.println("Generating report by popularity:");
        loans.stream()
                .sorted((l1, l2) -> Integer.compare(l2.getBook().getPopularity(), l1.getBook().getPopularity()))
                .forEach(loan -> System.out.println("Book: " + loan.getBook().getTitle()));
    }
}

package patterns;

import entities.Loan;
import java.util.List;

public interface ReportStrategy {
    void generateReport(List<Loan> loans);
}

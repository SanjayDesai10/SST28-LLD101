
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Placement Eligibility ===");
        StudentProfile s = new StudentProfile("23BCS1001", "Ayaan", 8.10, 72, 18, LegacyFlags.NONE);
        List<EligibilityCriteria> criteria = List.of(
                new DisiplinaryCriteria(),
                new CGRCriteria(),
                new AttendanceCriteria(),
                new CreditsCriteria());
        EligibilityEngine engine = new EligibilityEngine(criteria, new FakeEligibilityStore());
        engine.runAndPrint(s);
    }
}

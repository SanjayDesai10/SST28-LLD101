import java.util.*;

public class OnboardingService {
    private final StudentRepository db;
    private final InputParser parser = new InputParser();
    private final StudentValidator validator = new StudentValidator();
    private final Printer printer = new Printer();

    public OnboardingService(StudentRepository db) {
        this.db = db;
    }

    // Intentionally violates SRP: parses + validates + creates ID + saves + prints.
    public void registerFromRawInput(String raw) {

        printer.printInput(raw);

        ParsedStudent ps = parser.parse(raw);

        // validation inline, printing inline
        List<String> errors = validator.validate(ps);

        if (!errors.isEmpty()) {
            printer.printErrors(errors);
            return;
        }

        String id = IdUtil.nextStudentId(db.count());
        StudentRecord rec = new StudentRecord(
                id,
                ps.name,
                ps.email,
                ps.phone,
                ps.program);

        db.save(rec);

        printer.printSuccess(id, db.count(), rec);
    }
}

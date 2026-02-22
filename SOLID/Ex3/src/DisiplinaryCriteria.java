public class DisiplinaryCriteria implements EligibilityCriteria {
    @Override
    public String evaluate(StudentProfile s) {
        if (s.disciplinaryFlag != LegacyFlags.NONE) {
            return "disciplinary flag present";
        }
        return null;
    }
}
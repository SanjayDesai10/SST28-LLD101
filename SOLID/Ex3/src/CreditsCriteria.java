public class CreditsCriteria implements EligibilityCriteria {
    @Override
    public String evaluate(StudentProfile s) {
        if (s.earnedCredits < 20) {
            return "credits earned below 20";
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Evaluation Pipeline ===");

        Submission sub = new Submission("23BCS1007", "public class A{}", "A.java");

        Rubric rubric = new Rubric();
        IPlagiarismChecker checker = new PlagiarismChecker();
        IGrader grader = new CodeGrader();
        IWriter writer = new ReportWriter();

        EvaluationPipeline pipeline = new EvaluationPipeline(rubric, checker, grader, writer);

        pipeline.evaluate(sub);
    }
}
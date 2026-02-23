import java.nio.charset.StandardCharsets;

public class CsvExporter extends Exporter {

    @Override
    public ExportResult export(ExportRequest req) {

        if (req == null) {
            throw new IllegalArgumentException("ExportRequest cannot be null");
        }

        String csv = "title,body\n" +
                escape(req.title) + "," +
                escape(req.body) + "\n";

        return new ExportResult(
                "text/csv",
                csv.getBytes(StandardCharsets.UTF_8));
    }

    private String escape(String s) {
        if (s == null)
            return "";

        String escaped = s.replace("\"", "\"\"");
        return "\"" + escaped + "\"";
    }
}
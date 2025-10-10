import java.io.*;

public class LogFileSummarizer {
    public static void main(String[] args) {
        String inputFile = "app.log";
        String outputFile = "log_summary.txt";

        int infoCount = 0;
        int warnCount = 0;
        int errorCount = 0;

        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("INFO:")) {
                    infoCount++;
                } else if (line.startsWith("WARN:")) {
                    warnCount++;
                } else if (line.startsWith("ERROR:")) {
                    errorCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the log file: " + e.getMessage());
        }

      
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Log File Summary Report\n");
            writer.write("-----------------------\n");
            writer.write("INFO messages: " + infoCount + "\n");
            writer.write("WARN messages: " + warnCount + "\n");
            writer.write("ERROR messages: " + errorCount + "\n");
        } catch (IOException e) {
            System.out.println("Error writing the summary file: " + e.getMessage());
        }
    }
}
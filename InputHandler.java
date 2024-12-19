package pkg7;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputHandler {
    public static String[] readData(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines.toArray(new String[0]);
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataReader {
    private final String inputPath;
    private final String inputData;

    public DataReader(String inputPath, String inputData) {
        this.inputPath = inputPath;
        this.inputData = inputData;
    }


    public String getData() {
        if (inputPath != null && !inputPath.isEmpty()){
            try {
                return Files.readString(Path.of(inputPath));
            } catch (IOException e) {
                System.out.println("Reading file error");
            }
        }
        return inputData != null ? inputData : "";
    }
}
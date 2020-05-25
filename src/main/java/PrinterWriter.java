import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrinterWriter {
    private boolean writeToFile;
    private String outFilePath;

    public PrinterWriter(ApplicationArguments applicationArguments) {
        if (applicationArguments.outExist()) {
            outFilePath = applicationArguments.getOut();
            writeToFile = true;
        }
    }

    public void out(String data) {
        if (writeToFile) {
            outFileWriter(data);
        } else {
            outConsolePrinter(data);
        }

    }

    private void outConsolePrinter(String data) {
        System.out.println(data);
    }

    private void outFileWriter(String data) {

        File file = new File(outFilePath.trim());

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(data);
        } catch (IOException e) {
            System.out.printf("Error  %s", e.getMessage());
        }
    }
}


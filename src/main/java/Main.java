import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ApplicationArguments arguments = new ApplicationArguments(args);
        DataReader reader = new DataReader(arguments.getIn(), arguments.getData());
        String data = reader.getData();
        String mode = arguments.getMode();
        int key = arguments.getKey();
        DataEncryptor dataEncryptor = new DataEncryptor(arguments.getAlg());
        String result;
        if (arguments.performEncryption()) {

            result = dataEncryptor.encrypt(data,mode,key);

        } else {

          result = dataEncryptor.decrypt(data,mode,key);
        }

        PrinterWriter printerWriter = new PrinterWriter(arguments);
        printerWriter.out(result);
    }
}

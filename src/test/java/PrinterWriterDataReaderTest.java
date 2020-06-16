import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrinterWriterDataReaderTest {

    @Test
    public void printingTest(){
        //Given
        String inputArgs = "java Main -mode enc -out protected.txt -key 5 -alg unicode -data Hello!";
        String[]args = inputArgs.split(" ");
        //When
        ApplicationArguments ag = new ApplicationArguments(args);
        PrinterWriter pt = new PrinterWriter(ag);
        pt.out(ag.getData());
        DataReader dr = new DataReader(ag.getOut(),null);
        //Then
        assertThat(dr.getData()).isEqualTo("Hello!");
    }
}

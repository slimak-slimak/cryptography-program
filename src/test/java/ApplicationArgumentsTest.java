import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ApplicationArgumentsTest {
    String inputArgs = "java Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode -data \"Tajne sprawy\"";
    String[]args = inputArgs.split(" ");
    ApplicationArguments arguments = new ApplicationArguments(args);

    @Test
    public void argumentsCorrectnessTest(){
        // Algorithm type
        assertThat(arguments.getAlg()).isEqualTo("unicode");
        // Key
        assertThat(arguments.getKey()).isEqualTo(5);
        // Output file name & presence
        assertThat(arguments.getOut()).isEqualTo("protected.txt");
        assertThat(arguments.outExist()).isTrue();
        // Input file name & presence
        assertThat(arguments.getIn()).isEqualTo("road_to_treasure.txt");
        assertThat(arguments.inExist()).isTrue();
        // Mode check
        assertThat(arguments.getMode()).isEqualTo("enc");
        // Data check
        assertThat(arguments.getData()).isEqualTo("Tajne sprawy");
    }
}

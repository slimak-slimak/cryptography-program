import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShiftAlgorithmTest {

    String inputArgs = "java Main -key 5 -alg shift -data Hyperskill";
    String[]args = inputArgs.split(" ");
    ApplicationArguments ag = new ApplicationArguments(args);
    ShiftAlgorithm sa = new ShiftAlgorithm();

    @Test
    public void shiftEncryptionTest(){
    assertThat(sa.encrypt(ag.getData(),"enc",ag.getKey())).isEqualTo("Mdujwxpnqq");
    }
    @Test
    public void shiftDecryptionTest(){
    assertThat(sa.decrypt(ag.getData(),"dec",ag.getKey())).isEqualTo("Ctkymnfdgg");
    }
}

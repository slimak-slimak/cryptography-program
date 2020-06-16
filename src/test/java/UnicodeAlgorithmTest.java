import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UnicodeAlgorithmTest {
    String inputArgs = "java Main -key 5 -alg unicode -data Welcome";
    String[]args = inputArgs.split(" ");
    ApplicationArguments ag = new ApplicationArguments(args);
    UnicodeAlgorithm ua = new UnicodeAlgorithm();

    @Test
    public void unicodeEncryptionTest(){
        assertThat(ua.encrypt(ag.getData(),"enc",ag.getKey())).isEqualTo("\\jqhtrj");
    }
    @Test
    public void unicodeDecryptionTest(){
        assertThat(ua.decrypt("\\jqhtrj","dec",ag.getKey())).isEqualTo(ag.getData());
    }
}

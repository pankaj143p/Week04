package problems.unchekedexception;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultipleCatchBlockTest {
    @Test
    void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MultipleCatchBlock.handleArrayException(new int[3], 3);
        assertTrue(out.toString().contains("Invalid index!"));
    }
}

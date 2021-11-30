import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    public void testInputIsEven(){
        Assertions.assertTrue(Main.checkIfInputIsAnEvenNumber(22)); //Assertion
    }
}

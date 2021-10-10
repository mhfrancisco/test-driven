import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private StringCalculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    public void shouldReturnZeroForEmptyString() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void shouldReturnValueOfSingleNumber() {
        assertEquals(7, calculator.add("7"));
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        assertEquals(9, calculator.add("4,5"));
    }

    @Test
    public void shouldReturnTheSumOfAListOfNumbers() {
        assertEquals(12, calculator.add("1,2,3,6"));
    }

    @Test
    public void shouldTreatNewLineAsDelimiter() {
        assertEquals(6, calculator.add("1,2\n3"));
    }

    @Test
    public void shouldAcceptUserDefinedDelimiters() {
        assertEquals(3, calculator.add("//;\n1;2"));
    }
}
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;


class FactorialTest {

    @Test
    void factorialOnTen()
    {
        assertEquals(3628800, FactorialCalculator.factorial(10));
    }
}

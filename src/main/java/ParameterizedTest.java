import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)

public class ParameterizedTest {

    private int numberA;
    private int numberB;
    private int ABexpected;

    // Inject via constructorS
    public ParameterizedTest(int numberA, int numberB, int ABexpected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.ABexpected = ABexpected;
    }

    @Parameters(name = "{index}: testMultiplication({0}*{1}) = {2}")
    public static Collection<Object[]> list2() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {2, 2, 4},
                {8, 2, 16},
                {4, 5, 20},
                {5, 5, 25},
                {5, 6, 30}
        });
    }
    @Test
    public void test_multiplicationTwoNumbes() {
        assertThat(multiplication.multiplic(numberA, numberB), is(ABexpected));
    }
}



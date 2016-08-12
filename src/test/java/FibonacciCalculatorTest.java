import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciCalculatorTest {

    // 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610

    // positionNumber=5
    // find fibonacci for positionNumber=4 and positionNumber=3

    // positionNumber=6
    // find fibonacci for positionNumber=5 and positionNumber=4

    FibonacciCalculator calculator = new FibonacciCalculator();

    @Test
    public void shouldReturn1AsFirstFibonacciNumber() {
        assertThat(calculator.findFibonacciNumberRecursively(1)).isEqualTo(1);
        assertThat(calculator.findFibonacciNumberNonRecursively(1)).isEqualTo(1);
    }

    @Test
    public void shouldReturn1AsSecondFibonacciNumber() {
        assertThat(calculator.findFibonacciNumberRecursively(2)).isEqualTo(1);
        assertThat(calculator.findFibonacciNumberNonRecursively(2)).isEqualTo(1);
    }

    @Test
    public void shouldReturn2AsThirdFibonacciNumber() {
        assertThat(calculator.findFibonacciNumberRecursively(3)).isEqualTo(2);
        assertThat(calculator.findFibonacciNumberNonRecursively(3)).isEqualTo(2);
    }

    @Test
    public void shouldReturn3AsFourthFibonacciNumber() {
        assertThat(calculator.findFibonacciNumberRecursively(4)).isEqualTo(3);
        assertThat(calculator.findFibonacciNumberNonRecursively(4)).isEqualTo(3);
    }

    @Test
    public void shouldReturn55AsTenthFibonacciNumber() {
        assertThat(calculator.findFibonacciNumberRecursively(10)).isEqualTo(55);
        assertThat(calculator.findFibonacciNumberNonRecursively(10)).isEqualTo(55);
    }

}
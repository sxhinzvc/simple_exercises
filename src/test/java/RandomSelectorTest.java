import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomSelectorTest {

    //random number is between 0 - 0.1 = 0, 0.1 - 0.3 = 2, 0.3-1 = 1

    private RandomSelector randomSelector = new RandomSelector();
    private double probabilities[] = {0.1, 0.7, 0.2};

    @Test
    public void shouldReturn0WhenRandomNumberIsBetweenZeroAndPointOne() throws Exception {
        assertThat(randomSelector.selectNumber(probabilities, 0.06)).isEqualTo(0);
    }

    @Test
    public void shouldReturn2WhenRandomNumberIsBetweenPointOneAndPointThree() throws Exception {
        assertThat(randomSelector.selectNumber(probabilities, 0.2)).isEqualTo(2);
    }
    @Test
    public void shouldReturn1WhenRandomNumberIsBetweenPointThreeAndOne() throws Exception {
        assertThat(randomSelector.selectNumber(probabilities, 0.4)).isEqualTo(1);
    }
}
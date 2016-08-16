package chapter1;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringComparatorTest {

    private StringComparator comparator;

    @Before
    public void setUp() throws Exception {
        comparator = new StringComparator();
    }

    @Test
    public void shouldReturnFalseIfStringsHaveDifferentLengthsUsingArrays() {
        String first = "some";
        String second = "someLongerString";

        assertFalse(comparator.compareStringsUsingArrays(first, second));
    }

    @Test
    public void shouldReturnTrueIfStringsHaveSameCharactersUsingArrays() {
        String first = "some";
        String second = "mose";

        assertTrue(comparator.compareStringsUsingArrays(first, second));
    }

    @Test
    public void shouldReturnFalseIfStringsDoNotHaveSameCharactersUsingArrays() {
        String first = "somde";
        String second = "mosze";

        assertFalse(comparator.compareStringsUsingArrays(first, second));
    }

    @Test
    public void shouldReturnMapOfTalliedCharactersForAString() {
        String someString = "someommm";

        Map<Character, Integer> expected = new HashMap<>();
        expected.put('s', 1);
        expected.put('o', 2);
        expected.put('m', 4);
        expected.put('e', 1);

        Map<Character, Integer> actual = comparator.getTallyOfEachCharacter(someString);
        assertThat(actual).isEqualTo(expected);
    }
}
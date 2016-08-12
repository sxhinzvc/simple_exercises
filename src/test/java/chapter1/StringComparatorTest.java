package chapter1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringComparatorTest {

    private StringComparator comparator;

    @Before
    public void setUp() throws Exception {
        comparator = new StringComparator();
    }

    @Test
    public void shouldReturnFalseIfStringsHaveDifferentLengths() {
        String first = "some";
        String second = "someLongerString";

        assertFalse(comparator.compareStringsUsingArrays(first, second));
    }

    @Test
    public void shouldReturnTrueIfStringsHaveSameCharacters() {
        String first = "some";
        String second = "mose";

        assertTrue(comparator.compareStringsUsingArrays(first, second));
    }

    @Test
    public void shouldReturnFalseIfStringsDoNotHaveSameCharacters() {
        String first = "somde";
        String second = "mosze";

        assertFalse(comparator.compareStringsUsingArrays(first, second));
    }
}
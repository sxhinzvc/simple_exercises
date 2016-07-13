import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayComparatorTest {

    ArrayComparator comparator = new ArrayComparator();

    @Test
    public void shouldReturnTrueIfArraysHaveSameContentInSameOrder() {
        int array1[]  = {1, 2, 3};
        int array2[]  = {1, 2, 3};
        assertThat(comparator.compareArraysUsingArrays(array1, array2)).isTrue();
    }

    @Test
    public void shouldReturnTrueIfArraysHaveSameContentInDifferentOrder() {
        int array1[]  = {1, 2, 3};
        int array2[]  = {3, 1, 2};
        assertThat(comparator.compareArraysUsingArrays(array1, array2)).isTrue();
    }
}
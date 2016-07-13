import java.util.Arrays;

public class ArrayComparator {
    public boolean compareArraysUsingArrays(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}

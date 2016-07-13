import java.util.Arrays;

public class ArrayComparator {
    public boolean compareArraysUsingArrays(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public boolean compareArraysWithoutUsingArrays(int[] array1, int[] array2) {
        if (array2.length != array1.length) {
            return false;
        } else {
            loop:
            for (int index1 = 0; index1 < array1.length - 1; index1++) {
                for (int index2 = 0; index2 < array1.length - 1; index2++) {
                    if (array1[index1] == array2[index2])
                        break loop;
                    return false;
                }
            }
            return true;
        }
    }
}

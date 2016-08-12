package chapter1;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class StringComparator {

    public boolean compareStringsUsingArrays(String first, String second) {
        if (first.length() != second.length()) return false;

        char[] firstCharArray = first.toCharArray();
        char[] secondCharArray = second.toCharArray();

        sort(firstCharArray);
        sort(secondCharArray);

        return Arrays.equals(firstCharArray, secondCharArray);
    }
}

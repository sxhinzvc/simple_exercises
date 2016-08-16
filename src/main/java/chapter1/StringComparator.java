package chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public boolean compareStringsWithoutArrays(String first, String second) {
        if (first.length() != second.length()) return false;

        Map<Character, Integer> tallyForFirstString = getTallyOfEachCharacter(first);
        Map<Character, Integer> tallyForSecondString = getTallyOfEachCharacter(second);

        return false;
    }

    public Map<Character, Integer> getTallyOfEachCharacter(String stringToTally) {
        Map<Character, Integer> tally = new HashMap<>();

        for (int index = 0; index < stringToTally.length(); index++) {
            char key = stringToTally.charAt(index);
            if (tally.containsKey(key)) {
                tally.put(key, tally.get(key)+1);
            } else {
                tally.put(key, 1);
            }
        }

        return tally;
    }
}

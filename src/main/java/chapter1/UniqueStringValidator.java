package chapter1;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.sort;

public class UniqueStringValidator {

    public boolean isStringUnique(String stringToCheck) {
        char[] stringAsChars = stringToCheck.toCharArray();
        sort(stringAsChars);

        for (int index = 0; index < stringAsChars.length-1; index++) {
            if(stringAsChars[index] == stringAsChars[index+1]) {
                return false;
            }
        }
        return true;
    }

    public boolean isStringUniqueUsingHashSet(String stringToCheck) {
        Set<Character> stringAsHashSet = new HashSet<>();

        for (int index = 0; index < stringToCheck.length(); index++) {
            if (!stringAsHashSet.add(stringToCheck.charAt(index))) {
                return false;
            };
        }
        return true;
    }
}

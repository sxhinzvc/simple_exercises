package chapter1;

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
}

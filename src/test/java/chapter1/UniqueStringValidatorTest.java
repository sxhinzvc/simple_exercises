package chapter1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueStringValidatorTest {

    @Test
    public void shouldReturnTrueIfStringHasUniqueCharacters() {
        UniqueStringValidator validator = new UniqueStringValidator();

        boolean isStringUnique = validator.isStringUnique("alskdj");

        assertTrue(isStringUnique);
    }

    @Test
    public void shouldReturnFalseIfStringHasDuplicateCharacters() {
        UniqueStringValidator validator = new UniqueStringValidator();

        boolean isStringUnique = validator.isStringUnique("alskaj");

        assertFalse(isStringUnique);
    }
}
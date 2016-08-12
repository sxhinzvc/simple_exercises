package chapter1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueStringValidatorTest {

    public static final String UNIQUE_STRING = "alskdj";
    public static final String DUPLICATE_STRING = "alskaj";
    private UniqueStringValidator validator;

    @Before
    public void setUp() throws Exception {
        validator = new UniqueStringValidator();
    }

    @Test
    public void shouldReturnTrueIfStringHasUniqueCharacters() {
        assertTrue(validator.isStringUnique(UNIQUE_STRING));
    }

    @Test
    public void shouldReturnFalseIfStringHasDuplicateCharacters() {
        assertFalse(validator.isStringUnique(DUPLICATE_STRING));
    }

    @Test
    public void shouldReturnTrueIfStringHasUniqueCharactersUsingHashSet() {
        assertTrue(validator.isStringUniqueUsingHashSet(UNIQUE_STRING));
    }

    @Test
    public void shouldReturnFalseIfStringHasDuplicateCharactersUsingHashSet() {
        assertFalse(validator.isStringUniqueUsingHashSet(DUPLICATE_STRING));
    }
}
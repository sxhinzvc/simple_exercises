import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void shouldPassIfPasswordHas8CharactersAtLeastOneNumberAtLeastOneLetterOneBang() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.isValid("12b!5ab8"));
    }

    @Test
    public void shouldFailIfPasswordHasMoreThan8Characters() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertFalse(passwordValidator.isValid("123456789"));
    }

    @Test
    public void shouldFailIfPasswordDoesNotHaveALetter() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertFalse(passwordValidator.isValid("12345678"));
    }

    @Test
    public void shouldPassIfPasswordDoesNotHaveABang() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertFalse(passwordValidator.isValid("123456a8"));
    }
}
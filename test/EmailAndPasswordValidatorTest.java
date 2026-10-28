import org.junit.Test;

import static org.junit.Assert.*;

public class EmailAndPasswordValidatorTest {

    @Test
    public void testThatTheEmailIsValid() {
        String email = "olatunjikehindestephen@gmail.com";
        assertTrue(EmailAndPasswordValidation.validateEmail(email));

    }

    @Test
    public void testThatTheEmailIsNotValid() {
        String email = "olatunjikehindestephen!gmail.com";
        assertFalse(EmailAndPasswordValidation.validateEmail(email));
    }

    @Test
    public void testThatEmailIsNOTValid() {
        String email = "olatunjikehindestephen";
        assertFalse(EmailAndPasswordValidation.validateEmail(email));

    }

    @Test
    public void testThatThatEmptyEmailIsNotValid() {
        String email = "";
        assertFalse(EmailAndPasswordValidation.validateEmail(email));
    }

    @Test
    public void testThatEmailStartingWithSpecialCharactersAreNotValid() {
        String email = "@olatunjikehindestephen@gmail.com";
        assertFalse(EmailAndPasswordValidation.validateEmail(email));
    }

    @Test
    public void testThatThePasswordIsValid() {
        String password = "Password@1234";
        assertTrue(EmailAndPasswordValidation.validatePassword(password));

    }

    @Test
    public void testThatThePasswordIsStrong() {
        String password = "4FY&*)&Dyft";
        assertTrue(EmailAndPasswordValidation.validatePassword(password));
    }

    @Test
    public void passwordIsNotValid(){
        String password = "";
        assertFalse(EmailAndPasswordValidation.validatePassword(password));
    }

    @Test
    public void testThatThePasswordWithMin_lengthCharactersIsValid(){
        String password = "Pass123d#Kenny";
        assertTrue(EmailAndPasswordValidation.validatePassword(password));
    }

    @Test
    public void testThatThePasswordReturnsFalse(){
        String password = "Java code@1";
        assertFalse(EmailAndPasswordValidation.validatePassword(password));
    }

    @Test
    public void testThatThePasswordReturnsFalseForWeakPassword(){
        String password = "Welcome 123$";
        assertFalse(EmailAndPasswordValidation.validatePassword(password));
    }
}



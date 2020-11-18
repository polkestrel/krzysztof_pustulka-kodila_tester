package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();


    @ParameterizedTest
    @ValueSource(strings = {"aniol", "sick-boy", "_-ABRAnoc", "--__--", "..--__", "AKA"})
    public void shouldReturnTrueForUserNameWhenItMatchesWithRegexDefinition(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"AB", "a", "łó", "g@ze", ".", ";'", "   "})
    public void shouldReturnFalseForUserNameWhenItDoesNotMatchWithRegexDefinition(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ART8Av@o2.com", "AR1Ta_-.8A-_v@o2QT.coMD", "ART8-_Av.ART8-v@AGZoaga58adf.ARADQb"})
    public void shouldReturnTrueForEmailWhenItMatchesWithRegexDefinition(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"q..q@o2.comdqwec", "a@o2QT.", "ART8-_Av.ART8-v@AGZoaga58adf.12"})
    public void shouldReturnFalseForEmailWhenItDoesNotMatchWithRegexDefinition(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }
}
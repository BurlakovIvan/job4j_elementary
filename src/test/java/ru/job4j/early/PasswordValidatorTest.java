package ru.job4j.early;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PasswordValidatorTest {

    @Test
    public void whenPasswordIsNull() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class,
                        () -> PasswordValidator.validate(null));
        Assertions.assertEquals("Не задан пароль", thrown.getMessage());
    }

    @Test
    public void whenPasswordLengthLessThan8() {
        assertThat("Длина пароля должна находится в диапазоне от 8 до 32, включая")
                .isEqualTo(PasswordValidator.validate("pastest"));
    }

    @Test
    public void whenPasswordLengthMoreThan32() {
        assertThat("Длина пароля должна находится в диапазоне от 8 до 32, включая")
                .isEqualTo(PasswordValidator.validate("passtestpasstestpasstestpasstestp"));
    }

    @Test
    public void whenPasswordNotContainsUpperCase() {
        assertThat("Пароль должен содержать хотя бы один символ в верхнем регистре")
                .isEqualTo(PasswordValidator.validate("passtest"));
    }

    @Test
    public void whenPasswordNotContainsLowerCase() {
        assertThat("Пароль должен содержать хотя бы один символ в нижнем регистре")
                .isEqualTo(PasswordValidator.validate("PASSTEST"));
    }

    @Test
    public void whenPasswordNotContainsDigit() {
        assertThat("Пароль должен содержать хотя бы одну цифру")
                .isEqualTo(PasswordValidator.validate("PASsTEST"));
    }

    @Test
    public void whenPasswordNotContainsSpecialSymbol() {
        assertThat("Пароль должен содержать хотя бы один спец. символ  (не цифра и не буква)")
                .isEqualTo(PasswordValidator.validate("P4SsTEST"));
    }

    @Test
    public void whenPasswordContainsInvalidSubstring() {
        assertThat("Пароль не должен содержать подстроку admin")
                .isEqualTo(PasswordValidator.validate("Pa!4aDmiN"));
    }

    @Test
    public void whenValidPassword() {
        assertThat("Пароль корректен")
                .isEqualTo(PasswordValidator.validate("Pa!4aYrSt"));
    }
}
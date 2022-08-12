package ru.job4j.early;

import java.util.List;

public class PasswordValidator {

    private static final List<String> INVALID_SUBSTRING = List.of("qwerty", "12345", "password", "admin", "user");

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Не задан пароль");
        }
        if (password.length() < 8 || password.length() > 32) {
            return "Длина пароля должна находится в диапазоне от 8 до 32, включая";
        }
        String invalidPassword = validSymbolsPasswords(password);
        if (invalidPassword != null) {
            return invalidPassword;
        }
        invalidPassword = stringContainsInvalidSubstring(password);
        if (invalidPassword != null) {
            return invalidPassword;
        }
        return "Пароль корректен";
    }

    private static String validSymbolsPasswords(String password) {
        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                isDigit = true;
                continue;
            }
            if (!Character.isLetterOrDigit(ch)) {
                isSpecialSymbol = true;
                continue;
            }
            if (Character.isUpperCase(ch)) {
                isUpperCase = true;
                continue;
            }
            if (Character.isLowerCase(ch)) {
                isLowerCase = true;
            }
        }
        if (!isUpperCase) {
            return "Пароль должен содержать хотя бы один символ в верхнем регистре";
        }
        if (!isLowerCase) {
            return "Пароль должен содержать хотя бы один символ в нижнем регистре";
        }
        if (!isDigit) {
            return "Пароль должен содержать хотя бы одну цифру";
        }
        if (!isSpecialSymbol) {
            return "Пароль должен содержать хотя бы один спец. символ  (не цифра и не буква)";
        }
        return null;
    }

    private static String stringContainsInvalidSubstring(String password) {
        for (String substring : INVALID_SUBSTRING) {
            if (stringContainsSubstring(password, substring)) {
                return "Пароль не должен содержать подстроку " + substring;
            }
        }
        return null;
    }

    private static boolean stringContainsSubstring(String password, String substring) {
        return password.toLowerCase().contains(substring);
    }
}


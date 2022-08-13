package ru.job4j.early;

import java.util.List;

public class PasswordValidator {

    private static final List<String> INVALID_SUBSTRING = List.of("qwerty", "12345", "password", "admin", "user");

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Не задан пароль");
        }
        String rsl;
        if (password.length() < 8 || password.length() > 32) {
            rsl = "Длина пароля должна находится в диапазоне от 8 до 32, включая";
        } else {
            rsl = validSymbolsPasswords(password);
            if (rsl == null) {
                rsl = stringContainsInvalidSubstring(password);
            }
        }
        return rsl == null ? "Пароль корректен" : rsl;
    }

    private static String validSymbolsPasswords(String password) {
        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                isDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                isSpecialSymbol = true;
            } else if (Character.isUpperCase(ch)) {
                isUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                isLowerCase = true;
            }
            if (isDigit && isSpecialSymbol && isUpperCase && isLowerCase) {
                break;
            }
        }
        String rsl = null;
        if (!isUpperCase) {
            rsl = "Пароль должен содержать хотя бы один символ в верхнем регистре";
        } else if (!isLowerCase) {
            rsl = "Пароль должен содержать хотя бы один символ в нижнем регистре";
        } else if (!isDigit) {
            rsl = "Пароль должен содержать хотя бы одну цифру";
        } else if (!isSpecialSymbol) {
            rsl = "Пароль должен содержать хотя бы один спец. символ  (не цифра и не буква)";
        }
        return rsl;
    }

    private static String stringContainsInvalidSubstring(String password) {
        String rsl = null;
        for (String substring : INVALID_SUBSTRING) {
            if (stringContainsSubstring(password, substring)) {
                rsl = "Пароль не должен содержать подстроку " + substring;
                break;
            }
        }
        return rsl;
    }

    private static boolean stringContainsSubstring(String password, String substring) {
        return password.toLowerCase().contains(substring);
    }
}


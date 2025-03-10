package org.Rifqi.Entity;

public class StringUtility {
    public static String deleteWord(String str, String deleteString) {
        if (str == null || deleteString == null || str.isEmpty() || deleteString.isEmpty()) {
            throw new IllegalArgumentException("Cannot be empty");
        }
        return str.toLowerCase().replaceFirst(deleteString.toLowerCase(), "").trim();
    }

    public static String isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Cannot be empty");
        }
        String reversedStr = new StringBuilder(str).reverse().toString();
        boolean isTrue = str.equalsIgnoreCase(reversedStr);
        if (isTrue) {
            return "palindrome";
        }
        return "Not Palindrome";
    }

}

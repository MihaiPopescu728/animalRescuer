package org.fasttrackit;

public class StringHandler {
    public static boolean isValidName(String name) {
        char[] array = name.toCharArray();
        for (char ch : array) {
            if (!isLetter(ch)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isLetter(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        return false;

    }
}

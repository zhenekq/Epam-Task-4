package by.epamtc.task.task5.util;

public class StringDelete {
    public static String delete(String string, int length) {
        String newString = "";
        String[] splitString = string.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            if (isCorrectChar(splitString[i].toCharArray()[0]) && splitString[i].length() == length) {
                continue;
            }
            newString += splitString[i] + " ";
        }
        return newString;
    }

    private static boolean isCorrectChar(char value) {
        char[] arrayOfChars = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (int i = 0; i < arrayOfChars.length; i++) {
            if (value == arrayOfChars[i])
                return false;
        }
        return true;
    }
}

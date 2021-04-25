package by.epamtc.task.task4.util;

public class StringDelete {
    public static String delete(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)) || string.charAt(i) == ' ') {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}

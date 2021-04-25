package by.epamtc.task.task2.util;

public class StringCorrection {
    public static StringBuilder replace(StringBuilder string) {
        for (int i = 0; i < string.length(); i++) {
            boolean condition = string.charAt(i) == 'p' || string.charAt(i) == 'P';
            if (condition && string.charAt(i + 1) == 'a') {
                string.setCharAt(i + 1, 'o');
            }
            if (condition && string.charAt(i + 1) == 'A') {
                string.setCharAt(i + 1, 'O');
            }
        }
        return string;
    }
}

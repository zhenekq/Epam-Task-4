package by.epamtc.task.task2.util;

public class CharCorrection {
    public static char[] replace(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] == 'p' || chars[i] == 'P') && chars[i + 1] == 'a') {
                chars[i + 1] = 'o';
            }
            if ((chars[i] == 'p' || chars[i] == 'P') && chars[i + 1] == 'A') {
                chars[i + 1] = 'O';
            }
        }
        return chars;
    }
}

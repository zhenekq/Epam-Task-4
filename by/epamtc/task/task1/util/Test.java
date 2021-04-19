package by.epamtc.task.task1.util;

import java.util.Arrays;

public class Test {
    public static void test(StringBuilder stringBuilder, char[] chars, String string) {

        stringBuilder = StringCorrection.putSymbol(stringBuilder, 2, '@');
        CharCorrection.putSymbol(chars, 2, '@');
        string = RegularCorrection.putSymbol(string, 2, '@');

        System.out.println("String: " + stringBuilder);
        System.out.println("Array of chars: " + printChars(chars));
        System.out.println("Regular: " + string);
    }

    private static String printChars(char[] chars) {
        StringBuilder array = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            array.append(chars[i]);
        }
        return array.toString();
    }
}

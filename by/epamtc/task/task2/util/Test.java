package by.epamtc.task.task2.util;

public class Test {
    public static void test(StringBuilder string, char[] chars, String string1) {

        StringCorrection.replace(string);
        CharCorrection.replace(chars);
        string1 = RegularCorrection.replace(string1);


        System.out.println("String: " + string);
        System.out.println("Array of chars: " + printChars(chars));
        System.out.println("Regular: " + string1);
    }

    private static String printChars(char[] chars) {
        StringBuilder array = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            array.append(chars[i]);
        }
        return array.toString();
    }
}

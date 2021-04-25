package by.epamtc.task.task3.util;

public class Test {
    public static void test(String string, char[] chars, String string1) {

        string = StringCorrection.replace(string, 4, "bb");
        chars = CharCorrection.replace(chars,4,"bb");
        string1 = RegularCorrection.replace(string1,4,"bb");


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

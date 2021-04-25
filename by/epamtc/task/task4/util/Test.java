package by.epamtc.task.task4.util;


public class Test {
    public static void test(String string, char[] chars, String string1) {

        string = StringDelete.delete(string);
        chars = CharDelete.delete(chars);
        string1 = RegularDelete.delete(string1);


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

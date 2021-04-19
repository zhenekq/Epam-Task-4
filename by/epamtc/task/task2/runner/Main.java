package by.epamtc.task.task2.runner;

import by.epamtc.task.task2.util.CharCorrection;
import by.epamtc.task.task2.util.StringCorrection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "pa Paprea psapA";
        string = StringCorrection.replace(string);
        char[] chars = {'P', 'a', ' ', 'P', 'O', 'p', 'r', 'e', 'a', ' ', 'p', 's', 'a', 'p', 'A'};
        CharCorrection.replace(chars);
        System.out.println(string);
    }
}

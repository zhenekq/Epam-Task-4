package by.epamtc.task.task1.runner;

import by.epamtc.task.task1.util.Test;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("I love java and EPAM SYSTEMS");
        String regular = "I love java and EPAM SYSTEMS";
        char[] chars = {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'j', 'a', 'v', 'a',
                ' ', 'a', 'n', 'd', ' ', 'E', 'P', 'A', 'M', ' ', 'S', 'Y', 'S', 'T', 'E', 'M', 'S'};
        Test.test(stringBuilder, chars, regular);
    }
}

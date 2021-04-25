package by.epamtc.task.task2.runner;

import by.epamtc.task.task2.util.Test;

public class Main {
    public static void main(String[] args) {
        String regular = "PA pa Paprea psapA";
        StringBuilder string = new StringBuilder("PA pa Paprea psapA");
        char[] chars = {
                'P', 'a', ' ',
                'P', 'O', 'p', 'r', 'e', 'a', ' ',
                'p', 's', 'a', 'p', 'A'
        };
        Test.test(string,chars,regular);
    }
}

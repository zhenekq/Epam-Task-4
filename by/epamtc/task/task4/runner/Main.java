package by.epamtc.task.task4.runner;

import by.epamtc.task.task4.util.CharDelete;
import by.epamtc.task.task4.util.StringDelete;
import by.epamtc.task.task4.util.Test;

public class Main {
    public static void main(String[] args) {
        String string = "124dsokfg sdopfks 43ddf ./sdf??? sdf";
        char[] arr = {
                '1','2','4','d','s','o','k','f','g','s','o','k','f',' ',
                '3','4','d','f','g',' ',
                '.','/','d','d','g',' ',
                'f','g'
        };
        String regex = "124dsokfg sdopfks 43ddf ./sdf??? sdf";

        Test.test(string,arr,regex);
    }
}

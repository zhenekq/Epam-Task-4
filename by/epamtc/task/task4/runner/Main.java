package by.epamtc.task.task4.runner;

import by.epamtc.task.task4.util.CharDelete;
import by.epamtc.task.task4.util.StringDelete;

public class Main {
    public static void main(String[] args) {
        String string = "124dsokfg sdopfks 43ddf ./sdf??? sdf";
        //System.out.println(string);
        string = StringDelete.delete(string);
        char[] arr = {'1','2','4','d','s','o','k','f','g','s','o','k','f',' ',
                        '3','4','d','f','g',' ','.','/','d','d','g',' ','f','g'};
        arr = CharDelete.delete(arr);
        System.out.println(arr);
        System.out.println(string);
    }
}

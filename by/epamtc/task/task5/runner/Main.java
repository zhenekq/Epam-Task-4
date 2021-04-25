package by.epamtc.task.task5.runner;

import by.epamtc.task.task5.util.CharDelete;
import by.epamtc.task.task5.util.RegularDelete;
import by.epamtc.task.task5.util.StringDelete;

public class Main {
    public static void main(String[] args) {
        String string = "osdfjisd isdjfi sd jsi fjs di osdfjs sdo dsi d";
        char[] chars = {'s', 'd', 'i', 'f', ' ', 's', 'i', 'o', 'd','f', ' ', 's', 's', 's', ' ',
                's', 's', 's', 's',' ', 'a', 'a', 'a', 'a', ' ','a'};
        System.out.println(chars);
        chars = CharDelete.delete(chars, 4);
        System.out.println(chars);
        System.out.println("\n" + string);
        string = RegularDelete.delete(string);
        System.out.println(string);
        //System.out.println(string);
    }
}

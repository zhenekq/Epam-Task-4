package by.epamtc.task.task5.runner;
import by.epamtc.task.task5.util.Test;


public class Main {
    public static void main(String[] args) {
        String string = "osdfjisd isdjfi sd jsi fjs di osdfjs sdo dsi d";
        String regex = "osdfjisd isdjfi sd jsi fjs di osdfjs sdo dsi d";
        char[] chars = {
                's', 'd', 'i', 'f', ' ',
                's', 'i', 'o', 'd', ' ',
                's', 's', 's', ' ',
                's', 's', 's', 's',' ',
                'a', 'a', 'a', 'a', ' ',
                'a'
        };
        Test.test(string,chars,regex);
    }
}

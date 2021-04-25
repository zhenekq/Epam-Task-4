package by.epamtc.task.task3.runner;

import by.epamtc.task.task3.util.CharCorrection;
import by.epamtc.task.task3.util.RegularCorrection;
import by.epamtc.task.task3.util.StringCorrection;
import by.epamtc.task.task3.util.Test;

public class Main {
    public static void main(String[] args) {
        String string = "sdif siodjfisd jssd, dijosdijijsdf sdfdfdd gggg";
        String regular = "sdif siodjfisd jssd dijosdijijsdf sdfdfdd gggg";
        char[] chars = {
                's', 'd', 'i', 'f', ' ',
                's', 'i', 'o', 'd','f', ' ',
                's', 's', 's', ' ',
                's', 's', 's', 's',' ',
                'a', 'a', 'a', 'a', ' ',
                'a'};
        Test.test(string,chars,regular);
    }
}

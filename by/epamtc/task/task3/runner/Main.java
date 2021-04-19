package by.epamtc.task.task3.runner;

import by.epamtc.task.task3.util.CharCorrection;
import by.epamtc.task.task3.util.StringCorrection;

public class Main {
    public static void main(String[] args) {
        String string = "sdif siodjfisd jssd, dijosdijijsdf sdfdfdd gggg";
        char[] chars = {'s', 'd', 'i', 'f', ' ', 's', 'i', 'o', 'd','f', ' ', 's', 's', 's', ' ',
                's', 's', 's', 's',' ', 'a', 'a', 'a', 'a', ' ','a'};
        chars = CharCorrection.replace(chars,4,"bb");
        System.out.println(chars);

        //System.out.println(chars);
        /*string = StringCorrection.replace(string, 4, "DESTROY");
        System.out.println(string);*/

    }
}

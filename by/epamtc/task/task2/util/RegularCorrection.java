package by.epamtc.task.task2.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularCorrection {
    public static String replace(String string){
        string = string.replaceAll("PA", "PO");
        string = string.replaceAll("pA", "pO");
        string = string.replaceAll("Pa", "Po");
        string = string.replaceAll("pa", "po");

        return string;
    }
}

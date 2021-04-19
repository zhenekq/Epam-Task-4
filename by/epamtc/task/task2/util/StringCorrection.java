package by.epamtc.task.task2.util;

public class StringCorrection {
    public static String replace(String string){
        string = string.replaceAll("pa", "po")
                .replaceAll("Pa", "Po")
                .replaceAll("pA", "pO");
        return string;
    }
}

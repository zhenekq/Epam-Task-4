package by.epamtc.task.task4.util;

public class RegularDelete {
    public static String delete(String string){
        return string.replaceAll("[^ A-Za-z]", "");
    }
}

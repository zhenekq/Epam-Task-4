package by.epamtc.task.task4.util;

public class StringDelete {
    public static String delete(String string){
        return string.replaceAll("(?u)[^\\pL ]","");
    }
}

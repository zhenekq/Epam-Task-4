package by.epamtc.task.task5.util;

public class RegularDelete {
    public static String delete(String string){
        return string.replaceAll("(\\d+\\w*,)|(,\\d+\\w*$)", "");
    }
}

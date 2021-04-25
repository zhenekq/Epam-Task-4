package by.epamtc.task.task5.util;

public class RegularDelete {
    public static String delete(String string, int wordSize){
        return string.replaceAll("(?<=\\s|^)[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz][A-Za-z]{" + (wordSize - 1) + "}(?=\\s|$)", "");
    }
}

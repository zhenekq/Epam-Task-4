package by.epamtc.task.task3.util;

public class RegularCorrection {
    public static String replace(String string, int sizeOfWord, String changeWord){
        return string.replaceAll("(?<=\\s|^)[A-Za-z]{" + sizeOfWord + "}(?=\\s|$)", changeWord);
    }
}

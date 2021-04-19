package by.epamtc.task.task1.util;

public class RegularCorrection {
    public static String putSymbol(String string, int pos, char symbol){
        string = string.replaceAll(String.format("(\\b\\p{L}{%d})\\p{L}", pos - 1), "$1" + symbol);
        return string;
    }

}

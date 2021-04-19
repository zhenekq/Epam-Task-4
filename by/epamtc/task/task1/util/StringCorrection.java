package by.epamtc.task.task1.util;

public class StringCorrection {

    public static StringBuilder putSymbol(StringBuilder stringBuilder, int pos, char symbol) {
        String[] everyWord = stringBuilder.toString().split(" ");
        for (int i = 0; i < everyWord.length; i++) {
            if (everyWord[i].length() >= pos) {
                everyWord[i] = everyWord[i].substring(0, pos - 1) + symbol + everyWord[i].substring(pos);
            }
        }
        stringBuilder = new StringBuilder();
        for (int i = 0; i < everyWord.length; i++) {
            stringBuilder.append(everyWord[i]).append(" ");
        }
        return stringBuilder;
    }
}

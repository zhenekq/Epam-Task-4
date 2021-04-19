package by.epamtc.task.task1.util;

import javax.print.attribute.standard.MediaSize;

public class CharCorrection {
    public static char[] putSymbol(char[] string, int pos, char symbol) {
        int position = 0;
        boolean put = false;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == ' ') {
                position = 0;
                put = false;
                continue;
            }

            if(!put) {
                if (string[i] != ' ') {
                    position++;
                    if (position % pos == 0) {
                        string[i] = symbol;
                        put = true;
                    }
                }
            }
        }
        return string;


    }
}

package by.epamtc.task.task5.util;

public class CharDelete {
    public static char[] delete(char[] chars, int wordSize) {
        char[] newChars = new char[chars.length + 1];
        char[] newArray = new char[newChars.length];
        for(int i=0;i<chars.length;i++){
            newChars[i] = chars[i];
        }
        newChars[chars.length] = ' ';
        int index = 0;
        int position = 0;
        for (int i = 0; i < newChars.length; i++) {
            if (newChars[i] != ' ') {
                position++;
            }
            if (newChars[i] == ' ') {
                if (position == wordSize && isCorrectChar(newChars[i - position])) {
                    position = 0;
                    continue;
                }
                for (int j = i - position; j <= i; j++, index++) {
                    newArray[index] = newChars[j];
                }
                position = 0;
            }
        }
        return newArray;
    }

    private static boolean isCorrectChar(char value) {
        char[] arrayOfChars = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (int i = 0; i < arrayOfChars.length; i++) {
            if (value == arrayOfChars[i])
                return false;
        }
        return true;
    }
}

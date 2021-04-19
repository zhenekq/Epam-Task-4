package by.epamtc.task.task3.util;

public class CharCorrection {
    public static char[] replace(char[] array1, int wordSize, String word) {
        char[] array = new char[array1.length + 1];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        array[array.length - 1] = ' ';
        char[] newArray = new char[256];
        char[] wordArray = word.toCharArray();
        int position = 0;
        int indexOfNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                position++;
            }
            if (array[i] == ' ') {
                if (position == wordSize) {
                    int localIndex = 0;
                    for (int z = 0; z < word.length(); z++, indexOfNewArray++, localIndex++) {
                        newArray[indexOfNewArray] = wordArray[localIndex];
                    }
                    newArray[++indexOfNewArray] = ' ';
                } else {
                    for (int z = i - position; z <= i; z++, indexOfNewArray++) {
                        newArray[indexOfNewArray] = array[z];
                    }
                }
                position = 0;
            }
        }
        return newArray;
    }
}

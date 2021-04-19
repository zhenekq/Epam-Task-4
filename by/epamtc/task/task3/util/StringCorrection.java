package by.epamtc.task.task3.util;

public class StringCorrection {
    public static String replace(String string, int sizeOfWord, String changeWord){
        String[] arrayOfWords = string.split(" ");
        for(int i=0;i<arrayOfWords.length;i++){
            if(arrayOfWords[i].length() == sizeOfWord){
                arrayOfWords[i] = changeWord;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<arrayOfWords.length;i++){
            stringBuilder.append(arrayOfWords[i]).append(" ");
        }
        return stringBuilder.toString();
    }
}

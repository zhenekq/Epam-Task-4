package by.epamtc.task.task4.util;

public class CharDelete {
    public static char[] delete(char[] chars){
        char[] newArray = new char[chars.length];
        int index = 0;
        for(int i=0;i<chars.length;i++){
            if(Character.isLetter(chars[i]) || chars[i]==' '){
                newArray[index] = chars[i];
                index++;
            }
        }
        return newArray;
    }
}

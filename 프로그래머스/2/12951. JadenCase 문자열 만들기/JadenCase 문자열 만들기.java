import java.util.*;

class Solution {
    
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++){             
            if (i == 0 || arr[i-1] == ' ' ){
                arr[i] = Character.toUpperCase(arr[i]);
            }else if (arr[i] < 'a') {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        
        return new String(arr);
    }
}
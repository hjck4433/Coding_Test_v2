import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int num = arr.length == 1 ? 1 : arr.length -1;
        int[] answer = new int[num];
        if(arr.length == 1){
            answer[0] = -1;
            return answer;
        }
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min,arr[i]);
        }
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(min == arr[i]) continue;
            else answer[idx++] = arr[i];
        }
        
        
        return answer;
    }
}
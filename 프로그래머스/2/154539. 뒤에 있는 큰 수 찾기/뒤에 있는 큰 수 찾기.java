import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        
        Stack<Integer> s = new Stack<>();
        
        for(int i = len-1; i>=0; i--){
            while(!s.isEmpty()){
                if(s.peek() > numbers[i]){
                    answer[i] = s.peek();
                    break;
                }else {
                    s.pop();
                }
            }
            if(s.isEmpty()) {
                answer[i] = -1;
            }
            s.push(numbers[i]);
        }
        return answer;
    }
}
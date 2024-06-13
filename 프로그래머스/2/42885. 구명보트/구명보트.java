import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int front = 0;
        for(int i = people.length - 1; i >= front ; i--){
            if(people[i] + people[front] <= limit){
                answer++;
                front++;
            }else {
                answer++;
            }
        }
        
        return answer;
    }
}
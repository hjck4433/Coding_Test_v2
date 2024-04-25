import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] max = new int[24*60+10];
        int[][] reserve = new int[book_time.length][2];
        
        int idx = 0;
        
        
        for(String[] book : book_time){
            reserve[idx][0] = time(book[0]);
            reserve[idx][1] = time(book[1]) + 10;
            idx++;
        }
        
        for(int[] r : reserve){
            max[r[0]]++;
            max[r[1]]--;
        }
        
        for(int i = 1; i < max.length; i++){
            max[i] += max[i-1];
            answer = Math.max(answer, max[i]);
        }
        
        return answer;
    }
    
    public int time(String book) {
        int hour = Integer.parseInt(book.split(":")[0]) * 60;
        int min = Integer.parseInt(book.split(":")[1]);
        
        return hour+min;
    }
}
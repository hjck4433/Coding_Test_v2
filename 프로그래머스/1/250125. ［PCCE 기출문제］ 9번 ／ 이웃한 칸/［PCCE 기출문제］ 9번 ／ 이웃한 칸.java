import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        
        if(h-1 >= 0){
            answer = color.equals(board[h-1][w])  ? answer+ 1 : answer;
        }
        if(h+1 <= board.length-1){
            answer = color.equals(board[h+1][w]) ? answer+1 : answer;
        }
        if(w-1 >= 0){
            answer = color.equals(board[h][w-1])  ? answer+ 1 : answer;
        }
        if(w+1 <= board.length-1){
            answer = color.equals(board[h][w+1]) ? answer+1 : answer;
        }
    
        
        return answer;
    }
}
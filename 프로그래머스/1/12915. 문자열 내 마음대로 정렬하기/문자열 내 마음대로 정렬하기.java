import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n)  {
        Arrays.sort(strings);
        int len = strings.length;
        String[] answer = new String[len];
    
        ArrayList<String> ls = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            ls.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(ls);
        
        for(int i = 0; i < len; i++) {
            answer[i] = ls.get(i).substring(1, ls.get(i).length());
        }
        
        return answer;
    }

}
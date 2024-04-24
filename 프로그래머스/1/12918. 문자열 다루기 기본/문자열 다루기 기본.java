class Solution {
    public boolean solution(String s) {
        int len = s.length();
        boolean answer = true;
        
        if (len != 4 && len != 6) return false;
        
        for(int i = 0; i < len; i++) {

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z') return false; 
        }
        
        return answer;
    }
}
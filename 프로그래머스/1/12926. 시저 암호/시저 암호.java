class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char prev = s.charAt(i);
            if(prev == ' ') {
                answer += " ";
                continue;
            }
            char encode = (char) ((int)prev + n);
            if(prev <= 'Z'){
                if(encode > 'Z') encode -= 26;
            }else {
                if(encode > 'z') encode -= 26;
            }
            answer += encode;
        }
        return answer;
    }
}
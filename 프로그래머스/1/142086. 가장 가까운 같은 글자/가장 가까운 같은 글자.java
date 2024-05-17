class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alpha = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int n = ch - 'a';
            if(alpha[n] == 0){
                answer[i] = -1;
            }else {
                answer[i] = i - alpha[n] + 1;
            }
            alpha[n] = i+1;
        }
        return answer;
    }
}
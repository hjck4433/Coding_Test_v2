class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int n = phone_number.length() - 4;
        
        answer = "*".repeat(n) + phone_number.substring(n);
        
        return answer;
    }
}
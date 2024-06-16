class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        long sum = x;
        for(int i = 1; i < n; i++){
            sum += x;
            answer[i] = sum;
        }
        return answer;
    }
}
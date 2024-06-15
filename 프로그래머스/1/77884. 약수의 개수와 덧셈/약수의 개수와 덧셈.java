class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            int sum = 2;
            int max = i / 2;
            if (i < 3) {
                sum = 1;
                max = i;
            }
            for (int j = 2; j <= max; j++){
                if (i % j == 0) sum++;
            }
            System.out.println(sum);
            if(sum % 2 == 0 ) answer += i;
            else answer -= i;
        }
        return answer;
    }
}
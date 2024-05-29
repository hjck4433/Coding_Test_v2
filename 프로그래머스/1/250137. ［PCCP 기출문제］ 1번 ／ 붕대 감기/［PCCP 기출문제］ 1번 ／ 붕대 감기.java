class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        // 초당 회복량
        int recover = bandage[1];
        // 치료 시간
        int healT = 0;
        // 공격 횟수
        int cnt =0;
        // 시간
        int time = 0;
        
        while (cnt < attacks.length) {
            time++;
            if (attacks[cnt][0] == time){
                answer -= attacks[cnt][1];
                healT = 0;
                cnt++;
                if (answer <= 0) return -1;
            }else {
                healT++;
                answer += recover;
                if (healT == bandage[0]) {
                    answer += bandage[2];
                    healT = 0;
                }
                answer = answer >= health ? health : answer;
            }
        }
        
        return answer;
    }
}
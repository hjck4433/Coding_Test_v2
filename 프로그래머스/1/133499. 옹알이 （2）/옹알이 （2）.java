class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replace("aya","1");
            babbling[i] = babbling[i].replace("ye","2");
            babbling[i] = babbling[i].replace("woo","3");
            babbling[i] = babbling[i].replace("ma","4");
            
            boolean isBabble = true;
            // System.out.println(babbling[i]);
            char temp = '0';
            for(int j = 0; j < babbling[i].length(); j++){
                char now = babbling[i].charAt(j);
                // System.out.println(j+" "+ now);
                // System.out.println(j+" "+ temp);
                if(now == temp){
                    isBabble = false;
                    break;
                }else if (now >= 'a' && now <= 'z'){
                    // System.out.println("atoz");
                    isBabble = false;
                    break;
                }
                temp = now;
            }
            temp = '0';
            if(isBabble) {
                answer+=1;
                // System.out.println(isBabble);
            };
        }
        
        return answer;
    }
}
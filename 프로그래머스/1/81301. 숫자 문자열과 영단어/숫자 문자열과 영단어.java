import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        List<String> ls = new ArrayList<String>();
        ls.add("zero");
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        ls.add("five");
        ls.add("six");
        ls.add("seven");
        ls.add("eight");
        ls.add("nine");
        
        String num = "";
        String str = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < 'a') num += s.charAt(i);
            else str += s.charAt(i);

            if (str.length() >= 3) {
                if(ls.indexOf(str) != -1) {
                    num += String.valueOf(ls.indexOf(str));
                    str = "";
                };
            }
        }
        
        return Integer.parseInt(num);
    }
}
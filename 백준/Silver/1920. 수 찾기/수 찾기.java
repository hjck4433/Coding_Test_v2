import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Set<Integer> A = new HashSet<>();
        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();
            A.add(n);
        };
        
        StringBuilder rst = new StringBuilder();
        
        int M = sc.nextInt();
        for(int i = 0; i < M; i++){
            int m = sc.nextInt();
            
            if(A.contains(m)){
                rst.append(1 + "\n");   
            }else {
                rst.append(0 + "\n");
            }
        }
        System.out.println(rst);
    }
}
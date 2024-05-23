import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // A 배열의 사이즈
        int N = sc.nextInt();
        // B 배열의 사이즈
        int M = sc.nextInt();
        
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++){
            int n = sc.nextInt();
            A.add(n);
        }
        
        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < M; i++){
            int n = sc.nextInt();
            B.add(n);
        }
        
        List<Integer> rst = new ArrayList<>();
        
        int idxA = 0; int idxB = 0;
        
        while(idxA < N && idxB < M){
            int a = A.get(idxA);
            int b = B.get(idxB);
            
            if(a <= b){
                rst.add(a);
                idxA++;
            }else {
                rst.add(b);
                idxB++;
            }
        }
        if (idxA < N) {
            for(; idxA < N; idxA++){
                rst.add(A.get(idxA));
            }
        }else if (idxB < M) {
            for(; idxB < M; idxB++){
                rst.add(B.get(idxB));
            }
        }
        
       StringBuilder sb = new StringBuilder();
       for(int i : rst) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        
    }
}
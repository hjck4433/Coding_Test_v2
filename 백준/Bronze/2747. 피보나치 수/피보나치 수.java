import java.util.*;

class Main {
    static int[] arr = new int[46];
    
    public static void main(String[] args){
        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fib(num));
    }
    public static int fib(int num){
        if(arr[num] == -1){
            arr[num] = fib(num -1) + fib(num-2);
        }
        return arr[num];
    }
}
import java.util.Scanner;
//Kiem tra so fibonanci
public class J01007 {
    static long[] arr = new long[100];

    public static boolean fibo(long n){
        for(int i=0;i<=92;i++)
            if(arr[i]==n) return true;
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=92;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        int T=sc.nextInt();
        while(T-->0){
            long n = sc.nextLong();
            System.out.println(fibo(n)?"YES":"NO");
        }
        sc.close();
    }
}
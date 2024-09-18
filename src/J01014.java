import java.util.Scanner;

public class J01014{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long ans =0;
        while(T-->0){
            long n = sc.nextLong();
            for(long i  =2;i*i<n;i++){
                if(n%i==0) {
                    ans = i;
                    while (n % i == 0) n /= i;
                }
            }
            if(n>1) ans=n;
            System.out.print(ans);
        }
        sc.close();
    }
}
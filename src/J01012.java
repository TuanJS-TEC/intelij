import java.util.Scanner;
import java.math.BigInteger;

public class J01012 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            int cnt=0;
            for(int i=0;i<=n;i++){
                if(n%i==0){
                    cnt+=(i%2==0?1:0);
                    if(i!=n/i) cnt+=((i+1)%2==0?1:0);
                }
            }
        }
        sc.close();
    }

}

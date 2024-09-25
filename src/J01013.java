import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class J01013{
    public static int N = 2000005;
    public static ArrayList<Long> a = new ArrayList<>();

    public static void seive(){
        boolean b[]=new boolean[N];
        Arrays.fill(b,true);
        b[0]=false;
        b[1]=false;
        for(int i =2;i*i<=N-5;++i) {
            if(b[i]) {
                for(int j=i*i;j<=N-5;j+=i) {
                    b[j]=false;
                }
            }
        }
        for(int i =2;i<b.length;++i){
            if(b[i]) {
                a.add((long)i);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        seive();
        long ans =0;
        int T = sc.nextInt();
        while(T-->0){
            long N = sc.nextLong();
            for(int i =0;a.get(i)*a.get(i)<=N;++i){
                while(N % a.get(i)==0){
                    ans+=a.get(i);
                    N/=a.get(i);
                }
                if(N>1) ans+=N;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}

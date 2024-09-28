import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class J01013Fix{
    public static int N = 2000005;
    public static ArrayList<Long> a = new ArrayList<>();

    public static void seive(){
        boolean b[] = new boolean[N];
        Arrays.fill(b,true);
        b[0]=false;
        b[1]=false;
        for(int i =2;i*i<N-5;++i){
            if(b[i]){
                for(int j = i*i;j<N;++j){
                    b[j]=false;
                }
            }
        }
        for(int i =2 ;i<b.length;i++){
            if(b[i]){
                a.add((long)i);
            }
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        seive();
        long ans =0;
        while(T-->0){
            long n = sc.nextLong();
            for(int i = 0;a.get(i)*a.get(i)<=n;++i){
                while(n%a.get(i)==0){
                    ans+=a.get(i);
                    n/=a.get(i);
                }
            }
            if(n>1) ans+=n;
        }
        System.out.println(ans);
        sc.close();
    }
}
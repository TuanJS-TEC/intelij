import java.util.Scanner;

public class J01012{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int cnt=0;
            for(int i=1;i*i<=N;i++){
                if((N%i)==0){
                    cnt+=(i%2==0?1:0);
                    if(i!=N/i) cnt+=((N/i)%2==0?1:0);
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
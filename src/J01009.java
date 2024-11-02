import java.util.Scanner;

public class J01009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tmp=1,ans=0;
        for(int i=1;i<=n;++i){
            tmp*=i;
            ans += tmp;
        }
        System.out.println(ans);
        sc.close();
    }
}
import java.util.Scanner;

public class J01008{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=1;i<=t;++i){
                int n=sc.nextInt();
                System.out.print("Test "+i+": ");
                for(int j=2;j*j<=n;++j){
                    int count =0;
                    while(n%j==0){
                        count++;
                        n /=j;
                    }
                    if(count>0) System.out.print(j+"("+count+") ");
                }
                if(n>1) System.out.print(n+"(1) ");
                System.out.println();
            }
        sc.close();
    }
}





//import java.util.Scanner;
//
//public class J01008{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            for (int i = 2; i <= n; i++) {
//                int count = 0;
//                while (n % i == 0) {
//                    count++;
//                    n = n / i;
//                }
//                if (n > 2) System.out.println(i+"("+count+")");
//            }
//            if (n > 1) System.out.println(n + ("1"));
//            System.out.println();
//        }
//        sc.close();
//    }
//}










//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class J01008{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            int n = sc.nextInt();
//            for(int i=2;i<=n;i++){
//                int count=0;
//                while(n%i==0){
//                    count++;
//                    n = n/i
//                }
//                if(count>0) System.out.println(i+"("+count+")");
//            }
//            if(n>1) System.out.println(n+"(1)");
//            System.out.println();
//        }
//        sc.close();
//    }
//}
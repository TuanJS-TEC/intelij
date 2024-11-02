import java.util.Scanner;

public class J01005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T= sc.newInt();
        for(int i=0;i<T;i++){
            double n=sc.nextDouble();
            double H=sc.nextDouble();
            for(int j=0;j<H;j++) {
                double K = H * Math.sqrt(j / n);
                System.out.printf(K);
            }
        }
        sc.close();
    }
}
import java.util.Scanner;

public class J01013 {
    public static int check(int n){
        if(n<2) return 0;
        for(int i =1;i<n;i++){
            if(n%i==0) return 0;
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tmp=0;
        for(int i=0;i<n;i++){
            if(check(i)==0) tmp+=i;

        }
    }
}

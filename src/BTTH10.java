import java.util.*;
public class BTTH10 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt(), m = Scanner.nextInt();
        int [] era = new int[m + 1];
        for(int i = 2;i <= m;i++){
            for(int j = 2 * i;j <= m;j += i){
                era[j] += i;
            }
        }
        int res = 0;
        for(int i = n;i <= m;i++){
            if(era[i] + 1 > i) res += 1;
        }
        System.out.println(res);
    }
}
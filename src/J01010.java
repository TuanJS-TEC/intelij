import java.util.Scanner;

public class J01010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        while(T-- > 0){
            boolean check = false;
            String n = sc.nextLine();
            String ans = "";
            for(int i = 0; i < n.length(); i++){
                char ch = n.charAt(i);
                if(ch == '8' || ch == '9' || ch == '0'){
                    ans += '0';
                } else if(ch == '1'){
                    ans += ch;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

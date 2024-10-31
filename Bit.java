import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String X = sc.next();
            if(X.charAt(0) == '+' || X.charAt(2) == '+')
                ans++;
            else 
                ans--;
        }
        System.out.println(ans);
    }
}
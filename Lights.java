import java.util.Scanner;

public class Lights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int countZero = 0;
            int countOne = 0;
            for (int i = 0; i < (2 * N); i++) {
                String s = sc.next();
                
                if (s.equals("0")) countZero++;
                else if (s.equals("1")) countOne++;
            }
            if (countOne % 2 == 0 && countZero % 2 == 0) {
                System.out.print(0 + " ");
            } else {
                System.out.print(1 + " ");
            }
            System.out.println(Math.min(countOne, countZero));
        }
        sc.close();
    }
}

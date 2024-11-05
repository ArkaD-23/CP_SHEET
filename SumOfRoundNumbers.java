import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            ArrayList<Integer> list = new ArrayList<>();
            String num = sc.next();
            for (int i = 0; i < num.length(); i++) {
                int ans = (num.charAt(i)-'0')*(int)Math.pow(10, num.length()-i-1);
                if (ans != 0) {
                    list.add(ans);
                }
            }
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
import java.util.Scanner;

public class Chewbaca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(0) == '9' && i==0) ans += s.charAt(i);
            else if(s.charAt(i) < '5') {
                ans += s.charAt(i);
            }
            else {
                ans += ('9'-s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}

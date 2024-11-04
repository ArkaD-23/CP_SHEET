import java.util.Scanner;

public class Anya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            int N = sc.nextInt();
            char[] chars = s.toCharArray();
            for (int i = 0; i < N; i++) {
                int j = sc.nextInt();
                int v = sc.nextInt();
                if((j-1) > chars.length) {
                    char[] newChars = new char[chars.length+1];
                    System.arraycopy(chars, 0, newChars, 0, chars.length);
                    newChars[newChars.length] = (char) (v + '0');
                    String str = new String(newChars);
                    if(str.contains("1100")) System.out.println("Yes");
                    else System.out.println("No");
                    continue;
                }
                chars[j-1] = (char) (v + '0');
                String str = new String(chars);
                if(str.contains("1100")) System.out.println("Yes");
                else System.out.println("No");
            }
        }   
    }
}

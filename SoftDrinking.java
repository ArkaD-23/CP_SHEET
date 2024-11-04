import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        int td = (k * l) / nl;
        int tl = c * d;
        int pp = p / np;

        System.out.println(Math.min(td, Math.min(tl, pp)) / n);

        scanner.close();
    }
}

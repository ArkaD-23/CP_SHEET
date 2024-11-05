import java.util.Scanner;

public class AntonAndPolyhendron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String poly = sc.next();
            if (poly.equals("Cube")) {
                ans += 6;
            }
            else if (poly.equals("Dodecahedron")) {
                ans += 12;
            }
            else if (poly.equals("Icosahedron")) {
                ans += 20;
            }
            else if (poly.equals("Octahedron")) {
                ans += 8;
            }
            else {
                ans += 4;
            }
        }
        System.out.println(ans);
    }
}

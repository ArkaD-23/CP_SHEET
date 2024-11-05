import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt(); 
        sc.close();
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("#");
                }
            } else {
                if ((i / 2) % 2 == 0) {
                    for (int j = 0; j < n - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    System.out.print("#");
                    for (int j = 1; j < n; j++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println(); 
        }
    }
}

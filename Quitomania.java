import java.util.Scanner;

public class Quitomania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        while(T-- > 0) {
            int N = sc.nextInt(); 
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            boolean isValid = true;  
            for (int i = 1; i < N; i++) {
                int diff = Math.abs(arr[i - 1] - arr[i]);
                if (diff != 5 && diff != 7) {
                    isValid = false;
                    break;          
                }
            }

            if (isValid) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close(); 
    }
}

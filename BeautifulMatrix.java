import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int m = 0;
        int n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               arr[i][j] = sc.nextInt();
               if(arr[i][j] == 1) {
                    m = i+1;
                    n = j+1;
               } 
            }
        }
        int ans = 0;
        if(m > 3) {
            ans = ans + (m-3);
        }
        else {
            ans = ans + (3-m);
        }
        if(n > 3) {
            ans = ans + (n-3);
        }
        else {
            ans = ans + (3-n);
        }
        System.out.println(ans);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int[] arr = {x1, x2, x3};
        Arrays.sort(arr);
        System.out.println((arr[2]-arr[1]) + (arr[1]-arr[0]));
    }    
}

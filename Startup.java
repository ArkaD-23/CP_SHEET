import java.util.*;

public class Startup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt();
            Map<Integer, Integer> costsMap = new HashMap<>();
            for (int i = 0; i < k; i++) {
                int b = sc.nextInt(); 
                int c = sc.nextInt(); 
                costsMap.put(b, costsMap.getOrDefault(b, 0) + c); 
            }
            List<Integer> totalMap = new ArrayList<>(costsMap.values());
            totalMap.sort(Collections.reverseOrder());
            int maxEarnings = 0;
            for (int i = 0; i < Math.min(n, totalMap.size()); i++) {
                maxEarnings += totalMap.get(i);
            }
            System.out.println(maxEarnings);
        }
    }
}

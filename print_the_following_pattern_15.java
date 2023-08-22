import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        n = sc.nextInt();
        
        for (i = n; i >= 1; i--) {
            for (j = 1; j <=i; j++) {
                System.out.print((char) ('A' - 1 + i) + " ");
            }
            System.out.println();
        }
    }
}

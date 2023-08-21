import java.util.*;

public class lohi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            char currentChar = (char) ('A' + i);  // Calculate the character based on the current row
            
            for (int j = 0; j <= n-1; j++) {
                System.out.print(currentChar+" ");
            }
            
            System.out.println();  // Move to the next line
        }
    }
}

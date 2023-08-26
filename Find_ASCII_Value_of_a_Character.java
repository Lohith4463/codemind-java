import java.util.Scanner;

public class lohi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); // Corrected the syntax for accessing the character at index 0
        System.out.print((int) ch); // Corrected the syntax for type casting char to int
    }
}

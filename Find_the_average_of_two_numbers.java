import java.util.Scanner;
public class harsha{
    public static void main(String[] args){
        Scanner h=new Scanner(System.in);
        float a,b;
        a=h.nextFloat();
        b=h.nextFloat();
        double avg;
        avg=(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}
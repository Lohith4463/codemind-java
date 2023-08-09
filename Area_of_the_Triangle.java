import java.util.Scanner;
import java.lang.Math;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double area,p,t,t1;
        t=(a+b+c);
        t1=t/2;
        area=(t1*(t1-a)*(t1-b)*(t1-c));
        p=Math.sqrt(area);
        System.out.printf("%.2f",p);
    }
}
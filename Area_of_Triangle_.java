import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        double a,b,c,s,ts,area,tarea;
        a=x.nextInt();
        b=x.nextInt();
        c=x.nextInt();
        s=a+b+c;
        ts=s/2;
        area=(ts*(ts-a)*(ts-b)*(ts-c));
        tarea=Math.sqrt(area);
        System.out.printf("%.2f",tarea);
    }
}
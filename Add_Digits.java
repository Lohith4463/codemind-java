import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>=10){
            int s=0;
            while(n>0){
                s=s+n%10;
                n=n/10;
            }
            n=s;
        }
        System.out.print(n);
    }
}
import java.util.*;
public class car{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1,n2,x;
        n1=sc.nextInt();
        n2=sc.nextInt();
        x=sc.nextInt();
        if(n2<=n1){
            System.out.print("-1");
        }
        else{
            n2=n2-n1;
            x=(x/n2)+1;
            System.out.print(x);
            
        }
    }
}
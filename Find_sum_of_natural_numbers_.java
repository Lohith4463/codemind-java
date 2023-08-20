import java.util.*;
public class ma{
    public static void main(String [] args ){
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            s=s+i;
        }
        System.out.print(s);
    }
}
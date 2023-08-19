import java.util.*;
public class loh{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            String a,b;
            a=sc.next();
            int d=Integer.parseInt(a,2);
            b=Integer.toString(d,8);
            System.out.println(b);
        }
    }
}
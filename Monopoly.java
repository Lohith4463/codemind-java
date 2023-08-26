import java.util.*;
public class bhanu{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n!=0){
            int r1,r2,r3;
            r1=s.nextInt();
            r2=s.nextInt();
            r3=s.nextInt();
            if(r1+r2<r3||r1+r3<r2||r2+r3<r1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            n-=1;
        }
        
    }
}
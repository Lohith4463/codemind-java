import java.util.*;
public class dom{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==i||j==(n+1)-i){
                    System.out.print("x");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.print("
");
        }
    }
}
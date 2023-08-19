import java.util.*;
public class bhanp{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.print("
");
        }
    }
}
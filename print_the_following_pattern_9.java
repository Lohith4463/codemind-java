import java.util.*;
public class lohi{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n,i,j,k;
        n=s.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(i*2)-1;k++){
                System.out.print(i);
            }
            System.out.print("
");
        }
    }
}
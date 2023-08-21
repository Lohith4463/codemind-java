import java.util.*;
public class pri{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int i,j,k,n;
        n=s.nextInt();
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                    System.out.print(j+" ");
            }
            System.out.print("
");
        }
    }
}
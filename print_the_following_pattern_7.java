import java.util.*;
public class man{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-2);j++){
                System.out.print(j);
            }
            for(int k=1;k<=(n-3);k++){
                System.out.print(k);
            }
            System.out.print("
");
        }
    }
}
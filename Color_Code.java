import java.util.*;
public class main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n=='v' || n=='V'){
            System.out.print("Violet");
        }
        else if(n=='i' || n=='I'){
            System.out.print("Indigo");
        }
        else if(n=='B' || n=='b'){
            System.out.print("Blue");
        }
        else if(n=='G' || n=='g'){
            System.out.print("Green");
        }
        else if(n=='Y' || n=='y'){
            System.out.print("Yellow");
        }
        else if(n=='O' || n=='o'){
            System.out.print("Orange");
        }
        else if(n=='r' || n=='R'){
            System.out.print("Red");
        }
        else{
            System.out.print("-1");
        }
    }
}
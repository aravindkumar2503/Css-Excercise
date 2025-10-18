import java.util.*;
public class rec {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a=");
        int a=sc.nextInt();
        System.out.print("Enter b=");
        int b=sc.nextInt();
        int res=add(a,b);
        System.out.println("c="+res);
    }
    public static int add(int a,int b)
    {
        int c=a+b;
        return c;
        
    } 
    
}

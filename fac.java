
import java.util.Scanner;

public class fac {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter n=");
        int n=sc.nextInt();
        int sum=0;
        int fact=1;
        for(int i=2;i<n;i++)
        {
            fact*=n*i;
        }
        System.out.println("a="+fact);
    }
    
}

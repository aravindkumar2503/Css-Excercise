
import java.util.Scanner;

public class factorial {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //5!=1*2*3*4*5=120
        System.out.print("enter num:");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
    
}

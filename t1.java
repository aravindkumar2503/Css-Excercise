import java.util.*;
public class t1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter inp=");
        int inp=sc.nextInt();
        switch (inp) {
            case 1:
            {
                int a=20;
                int b=20;
                System.out.println("sum ="+(a+b));//add
                //break;
            }
            case 2:
            {
                int a=20;
                int b=20;
                System.out.println("diff ="+(a-b));//sub
                //break;

            }
            case 3:
            {
                int a=20;
                int b=20;
                System.out.println("mul ="+(a*b));//mul
                break;
            }
            case 4:
            {
                int a=20;
                char b=(char)a;//typecast
                System.out.println("b="+b);
                break;
            }
            default:
                System.out.println("No output");
        }
    }

    
}

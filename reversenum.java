import java.util.Scanner;

public class reversenum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter num=");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        System.out.println("reverse:"+rev);
        

    }
    
}

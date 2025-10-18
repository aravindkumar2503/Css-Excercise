import java.util.*;
public class fibonacci {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n1=0,n2=1;
        System.out.print("Enter series:");
        int series=sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(int i=0;i<series-2;i++)
        {
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
        
    }
    
}

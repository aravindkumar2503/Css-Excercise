import java.util.*;
public class fin {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("enter n=");
        int n=sc.nextInt();
        int []a=new int[n];
        int n1=0;
        int n2=1;
        a[0]=n1;
        a[1]=n2;
        String s1="1 0";
        System.out.print(n1+" "+n2+" ");
        int sum=1;
        for(int i=0;i<n-2;i++)
        {
            int n3=n1+n2;
            s1=n3+" "+s1;
            sum+=n3;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
        System.out.println("\n");
        System.out.println("sum="+sum);
        String []s2=s1.split(" ");
        System.out.println(s1);
        System.out.println(Arrays.toString(s2));

    }
    
}

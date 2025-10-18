
import java.util.Scanner;

public class largest_num {
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        int []a={2,1,3,7,4,9};
        System.out.print("Enter key:");
        int key=sc.nextInt();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<key;i++)
        {
            max=Integer.MIN_VALUE;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]>max)
                {
                    max=a[j];
                }
            }
            for(int k=0;k<a.length;k++)
            {
                if(max==a[k])
                {
                    a[k]=Integer.MIN_VALUE;
                }
            }
        }
        System.out.println("maximum="+max);

    }
    
}

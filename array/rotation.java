
import java.util.Arrays;
import java.util.Scanner;

public class rotation {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int []a={4,5,6,7,2};//5,6,7,2,4
        System.out.print("enter k=");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int first=a[0];
            for(int j=1;j<a.length;j++)
            {
                a[j-1]=a[j];
            }
            a[a.length-1]=first;
        }
        System.out.println(Arrays.toString(a));

    }
    
}

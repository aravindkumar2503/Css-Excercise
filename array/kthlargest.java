
import java.util.*;

public class kthlargest {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int []a={2,7,4,3,6};
        System.out.print("kth num=");
        int key=sc.nextInt();
        int max=0;
        for(int i=0;i<key;i++)
        {
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
        System.out.println(max);
    }
    
}

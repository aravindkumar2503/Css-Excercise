
import java.util.Scanner;

public class test3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int []a={5,4,2,7,8,2};
        int k=sc.nextInt();
        int res=solve(a,k);
        System.out.println(res);
    }
    public static int solve(int []a,int k)
    {
        
        int max=Integer.MIN_VALUE;
        for(int n=1;n<=k;n++)
        {
            max=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                }
            }
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==max)
                {
                    a[j]=Integer.MIN_VALUE;
                }
            }
        }
        return max;
    }
    
}

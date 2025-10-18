import java.util.*;
public class test4 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //rotation array
        int []a={1,2,3,4,5};
        int n=sc.nextInt();
        int[]res=solve(a,n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(int []a,int n)
    {
        for(int i=1;i<=n;i++)
        {
            int first=a[0];
            for(int j=0;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
            a[a.length-1]=first;
        }
        return a;
    }
    
}

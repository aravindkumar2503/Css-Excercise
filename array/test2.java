
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int []b={7,8,9,10};
        int []res=solve(a,b);
        System.out.println(Arrays.toString(res));

    }
    public static int[] solve(int []a,int []b)
    {
        int []res1=new int[a.length+b.length];
        for(int i=0,m=0,n=0;i<res1.length;i++)
        {
            if(m<a.length)
            {
                res1[i]=a[m];
                m++;
            }
            else if(n<b.length)
            {
                res1[i]=b[n];
                n++;
            }
        }
        return res1;
    }
    
}

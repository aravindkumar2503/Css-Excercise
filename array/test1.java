
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        //reverse array
        int []a={1,2,3,4,5};
        int []b=solve(a);
        System.out.println(Arrays.toString(b));

    }
    public static int[] solve(int []a)
    {
        int []res=new int[a.length];
        for(int i=a.length-1,m=0;i>=0;i--)
        {
            res[m]=a[i];
            m++;
        }
        return res;
    }
    
}

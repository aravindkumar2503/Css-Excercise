
import java.util.Arrays;

public class test6 {
    public static void main(String[] args) {
        //bubble sort
        int []a={4,2,6,9,3};
        solve(a);
    }
    public static void solve(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    
}

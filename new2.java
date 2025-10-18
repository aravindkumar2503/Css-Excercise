
import java.util.Arrays;

public class new2 {

    public static void main(String[] args) {
        
        int []a={4,2,-6,5,-3};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int []b=new int[a.length-1];
        int r=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+a[k];
                }
                if(sum>max)
                {
                    b[r]=sum;
                }
            }
            r++;
        }
        System.out.println(Arrays.toString(b));
        
    }
    
}

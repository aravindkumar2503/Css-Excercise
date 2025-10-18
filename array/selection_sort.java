
import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int []a={8,-5,-3,-1,0,6,7,-3};
        for(int i=0;i<a.length;i++)
        {
            int s=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[s])
                {
                    s=j;
                }
            }
            int temp=a[i];
            a[i]=a[s];
            a[s]=temp;
        }
        System.out.println(""+Arrays.toString(a));
    }
    
}

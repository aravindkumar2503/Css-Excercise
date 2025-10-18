
import java.util.Arrays;

public class array_sort1 {
    public static void main(String[] args) {
        int []a={10,4,6,2,3,1,5};
        insertionsort(a);
    }
    public static void insertionsort(int []a)
    {
        for(int i=1;i<a.length;i++)
        {
            int pre=i-1;
            int curr=a[i];
            while(pre>=0&&a[pre]>curr)
            {
                a[pre+1]=a[pre];
                pre--;
            }
            a[pre+1]=curr;
            System.out.println("insertion_sort="+Arrays.toString(a));
        }
    }
    }
    


import java.util.Arrays;

public class counting_sort {
    public static void main(String[] args) {
        int []a={4,2,7,7,9,0,1,0};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        //System.out.println("max="+max);
        int res[]=new int[max+1];
        for(int i=0;i<a.length;i++)
        {
            res[a[i]]++;
        }
        int j=0;
        for(int i=0;i<res.length;i++)
        {
            while(res[i]>0)
            {
                a[j]=i;
                j++;
                res[i]--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    
}

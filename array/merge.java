
import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={6,7,8,9,10};
        int []c=new int[a.length-1+b.length-1];
        for(int i=0,m=0,n=0;i<c.length;i++)
        {
            if(a[m]<a.length)
            {
                c[i]=a[m++];
            }
            else if(a[n]<b.length)
            {
                c[i]=b[n++];
            }
        }
        System.out.println(""+Arrays.toString(c));
    }
    
}

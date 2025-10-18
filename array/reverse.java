
import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int []b=new int[a.length];
        for(int i=a.length-1,m=0;i>=0;i--)
        {
            b[m]=a[i];
            m++;
        }
        System.out.println("reverse array:"+Arrays.toString(b));
    }
}


import java.util.Arrays;



public class test5 {
    public static void main(String[] args) {
        int []a={5,7,8,10};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int j=0;
        for(int i=0;i<a.length;i++,j++)
        {
            if(a[i]!=j)
            {
                System.out.print(j+" ");
                i--;
            }
        }
    }
    
}

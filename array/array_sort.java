
import java.util.Arrays;
public class array_sort {
    //static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int a[]={3,5,2,6,1};
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
        }
        System.out.println(Arrays.toString(a));

    }
    
}

import java.util.*;
public class insertion_sort {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int []a={4,2,3,1,6,5};
        insertion(a);
    }
    public static void insertion(int []a)
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
            a[pre]=curr;
        }
        System.out.println(""+Arrays.toString(a));
        
    }
    
}

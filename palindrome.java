import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int []a={8,2,3,2,6,3};
        //boolean flag=false;
        //int l=0,r=a.length-1;
        int j=0;
        for(int i=a.length-1;i>=0;i--)
        {
            a[j++]=a[i];
        }
        System.out.println(Arrays.toString(a));
    }
    
}


import java.util.Arrays;
import java.util.Scanner;

public class test7 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //binary search
        int []a={10,20,30,50,40};
        int key=sc.nextInt();
        Arrays.sort(a);
        if(solve(a,key))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not present");
        }
    }
    public static boolean solve(int []a,int key)
    { 
    int l=0,r=a.length-1;
    while(l<=r)
    {
        int m=(l+r)/2;
        if(a[m]==key)
        {
            return true;
        }
        else if(a[m]>key)
        {
            r=m-1;
        }
        else
        {
            l=m+1;
        }
    }
    return false;
    }
}

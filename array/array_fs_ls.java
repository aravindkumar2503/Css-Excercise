import java.util.Arrays;
import java.util.Scanner;

class array_fs_ls
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.err.print("Size=");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println("first element="+a[0]);
        System.out.println("last element="+a[a.length-1]);

    }
}
import java.util.*;
public class numberofdigits {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter num=");
        int num=sc.nextInt();
        int c=0;
        if(num<0)
        {
            num=num*-1;
        }
        else if(num==0)
        {
            num=1;
        }
        while(num>0)
        {
            num=num/10;
            c++;
        }
        /*for(int i=num;i>0;i=i/10)
        {
            c++;
        }*/
        
        System.out.println(c);
        
    }
    
}

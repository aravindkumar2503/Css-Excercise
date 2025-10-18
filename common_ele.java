import java.util.*;
public class common_ele {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={4,5,6,7,8};

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
        
    }
    
}

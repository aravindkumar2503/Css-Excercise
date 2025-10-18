import java.util.*;
public class primenum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter start:");
        int a=sc.nextInt();
        System.out.print("end:");        
        int b=sc.nextInt();        
        for(int i=a;i<=b;i++)
        {
            if(i==0||i==1)
            {
                continue;
            }
            boolean is_prime=true;
            for (int j=2; j<i;j++){
                    if(i%j==0)
                    {
                        is_prime=false;
                        break;
                    }
                
            }
            if(is_prime)
            {
                System.out.print(i+" ");
            }
            
        }
        
    }
}

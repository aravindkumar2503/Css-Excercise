import java.util.*;
class armstrong
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter num:");
        int num=sc.nextInt();
        int sum=0,count=0;
        for (int i =num; i>0;i=i/10) {
           count++; 
        }
        //System.out.println(count);
        for (int j = num; j>0;j=j/10){
            int last=j%10;
            int prod=1;
            for(int k=1;k<=count;k++)
            {
                prod=prod*last;
            }
            sum=sum+prod;
        }
        if(sum==num)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not a Armstrong number");
        }
            
        }
    }
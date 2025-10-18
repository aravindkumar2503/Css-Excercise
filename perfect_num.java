import java.util.Scanner;

class perfect_num
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //6--->factor=1,2,3--->tot sum=1+2+3=6
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println((sum==num)?"perfect num":"not a perfect number");
    }
}
public class bin {

    public static void main(String[] args) {
        int a=13;//1101
        int last=0;
        int sum=0;
        while(a>0)
        {
            last=a%2;
            sum=last+sum;
            a=a/2;
        }
        System.out.println("sum="+sum);

    }
    
}

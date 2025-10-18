public class cyclic_prime {
    public static void main(String[] args) {
        String s="1193";
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            String ans=rotation(s);
            if(!(is_prime(Integer.parseInt(ans))))
            flag=false;
            s=ans;
        }
        System.out.println((flag)?"cyclic prime":"not a cyclic prime");
    }
    public static String rotation(String str)
    {
        char[]a=str.toCharArray();
        for(int i=0;i<=5;i++)
        {
            char first=a[0];//1
            for(int j=0;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
            a[a.length-1]=first;
        }
        return new String(a);
    }
    public static boolean is_prime(int num)
    {
        if(num==0||num==1)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
}

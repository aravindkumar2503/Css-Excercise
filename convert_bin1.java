public class convert_bin1 {


    public static void main(String[] args) {
        int a=2080;
        String ans="";
        while(a>0)
        {
            ans=(a%2)+ans;
            a=a/2;
        }
        System.out.println("Str="+ans);
    }
    
}

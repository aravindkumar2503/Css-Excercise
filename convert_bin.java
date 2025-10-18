
import java.util.Arrays;

public class convert_bin {

    public static void main(String[]args)
    {
        String a="2080-02-29";
        System.out.println(a);
        String []b=a.split("-");
        System.out.println(Arrays.toString(b));
        String fin="";
        for(int i=b.length-1;i>=0;i--)
        {
            String ans="";
            int num=Integer.parseInt(b[i]);
            while(num>0)//2080>0
            {
                ans=(num%2)+ans;//100000100000
                num=num/2;
            }
            if(fin.isEmpty())
            {
                fin=ans+"";
            }
            else{
                fin=ans+"-"+fin;
            }
        }

        
        System.out.println("ANSWER="+fin);
    }
    
}

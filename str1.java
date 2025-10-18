
import java.util.Arrays;

public class str1 {

    public static void main(String[]args)

    {
        String a="abc@ghi#mno";

        char []b=a.toCharArray();

        int l=0,r=a.length()-1;
        while(l<r)
        {

            if('a'<=b[l]&&'z'>=b[l])
            {
                char temp=b[l];
                b[l]=b[r];
                b[r]=temp;
                
            }
            l++;
            r--;
        }
        System.out.println(Arrays.toString(b));
    }
}

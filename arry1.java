public class arry1 {

    public static void main(String[] args) {
        int []a={8,19,10,18};
        if(array2(a))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public static boolean array2(int []a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return false;
            }
        }
        return true;
    }

    
}

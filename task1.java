public class task1 {

    public static void main(String[] args) {
        int []a={16,17,4,3,5,2};
        int last=a.length;
        for(int i=last-1;i>=0;i--)
        {
            boolean flag=true;
            for(int j=i+1;j<last;j++)
            {
                if(a[i]<a[j])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    
}

public class subarray_equalsum {

    public static void main(String[] args) {

        int []a={4,2,4};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length-1;i++)
        {
            int sum=a[i]+a[i+1];
            if(sum==max)
            {
                System.out.println("Yes");
                return ;
            }
            max=sum;
        }
        System.out.println("NO");
    }
    
}

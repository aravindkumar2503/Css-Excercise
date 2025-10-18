public class test8 {
    public static void main(String[] args) {
        int []a={1,2,4,2,5,3,3};
        //print duplicate
        for(int i=0;i<a.length;i++)
        {
            int count=1;
            if(a[i]==Integer.MIN_VALUE)
            {
                continue;
            }
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(a[i]);
            }
        }
    }
    
}

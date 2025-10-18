public class test9 {
    public static void main(String[] args) {
        {
            //remove duplicate
            int []a={1,3,4,5,2,3};
            int count=1;
            for(int i=0;i<a.length;i++)
            {
                
                for(int j=0;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++;
                    }
                }
                
            if(count>1)
                {
                    System.out.print(a[i]);
                }
            }
        }
    }
    
}

public class maximin {
    public static void main(String[] args) {
        int []a={10,20,30,40};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("maximum="+max);
        System.out.println("minimum="+min);
    }
    
}

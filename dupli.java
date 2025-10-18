public class dupli {

    public static void main(String[] args) {
        int []a={2,8,6,4};//tru1
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
        }
        if(count==0)
        {
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
    
}

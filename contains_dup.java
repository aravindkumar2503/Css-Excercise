public class contains_dup {
    public static void main(String[] args) {
        //int []a={1,2,3,1};//true
        //int []a={1,2,3,4};//false
        //int []a={1};//false
        int []a={1,2,3,4};
        //int l=0,r=a.length-1;
        boolean flag=false;
        /*while(l<r)
        {
            if(a[l]==a[r])
            {
                flag=true;
                break;
            }
            flag=false;
            l++;
            r--;
        }*/
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    flag=true;
                    break;
                }
                //break;
            }
        }
        if(flag)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
/*Two Sum
Roman to Integer
Palindrome Number
Maximum Subarray
Remove Element
Contains Duplicate
Add Two Numbers
Majority Element
Remove Duplicates from Sorted Array*/
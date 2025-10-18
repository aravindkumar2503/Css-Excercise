public class add_binary {
    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        //String ans="";
        StringBuilder ans=new StringBuilder();
        while(i>=0||j>=0||carry!=0)
        {
            if(i>=0)
            {
                carry+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0)
            {
                carry+=b.charAt(j)-'0';
                j--;
            }
            //ans=ans+Integer.toString(carry%2);
            ans.append(carry%2);
            //System.out.println(ans);
            carry=carry/2;
            /*carry+=a.charAt(i)+b.charAt(j);//2
            int carry1=carry%2;//0
            ans=ans+carry1;
            carry=carry/2;
            i--;
            j--;*/
        }
        /*String ans1="";
        for(int k=ans.length()-1;k>=0;k--)
        {
            ans1=ans1+ans.charAt(k);
        }*/
        System.out.println("Ans="+ans.reverse().toString());
    }
    
}

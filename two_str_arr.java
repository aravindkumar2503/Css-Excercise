public class two_str_arr {

    public static void main(String[] args) {
        
        String []word1={"ab","c"};
        String []word2={"a","bc"};

        StringBuilder ans1=new StringBuilder();

        for(int i=0;i<word1.length;i++)
        {
            ans1.append(word1[i]);
        }
        System.out.println("Word1="+ans1);
        StringBuilder ans2=new StringBuilder();

        for(int j=0;j<word2.length;j++)
        {
            ans2.append(word2[j]);
        }
        System.out.println("word2="+ans2);
        if(ans1.toString().equals((ans2).toString()))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
    
}

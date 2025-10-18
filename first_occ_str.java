public class first_occ_str {
    public static void main(String[] args) {
        String h="leetcode";
        String n="code";
        int a=h.length();//8
        int b=n.length();//4
        for(int i=0;i<a-3;i++)
        {
            if(h.substring(i,b+i).equals(n))
            {
                System.out.println("index="+i);
            }
        }
        
    }
    
}

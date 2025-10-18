public class str2 {

    public static void main(String[] args) {
        String a="abcdefghi";//dcbaefghi
        int k=3;
        int l=0;
        String fin="";
        for(int i=k;i>=0;i--)
        {
            fin+=a.charAt(i);
        }
        //System.out.println(fin);
        for(int j=k+1;j<a.length();j++)
        {
            fin+=a.charAt(j);
        }
        System.out.println("fin="+fin);

    }
    
}

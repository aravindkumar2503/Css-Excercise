public class str_palindrome {

    public static void main(String[] args) {
        String str1 = "thequickbrownfoxxofnworbquickthe";//brownfoxxofnworb
        //String str1="sirmadamrissmadam";
        int st, end;
        StringBuffer result = new StringBuffer();
        String chk= "";
        st = 0;
        for (int i = 0; i < (str1.length()); i++) {
            StringBuffer pal = new StringBuffer();
            end=i+1;
            if(end<str1.length()) {
                chk = chk + (str1.substring(st, end + 1));
                pal.append(chk);
                pal.reverse();

                String temp = (pal.toString());

                if (str1.contains(temp)&&result.length()<pal.length()) {
//                        System.out.print(chk + "  ");
//                        System.out.print(pal);
//                        System.out.println();
                   result=pal.reverse();

                    chk = "";
                } else {
                    chk = "";
                    st = end;
                }
            }



        }  System.out.println(result);
    }
}
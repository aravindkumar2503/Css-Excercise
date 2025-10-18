public class bankobj {
    public static void main(String[] args) 
      {
        bank b1=bank.getbank("SBI","vadapalani");
        System.out.println("b_name:"+b1.getb_name());
        System.out.println("branch:"+b1.getbranch());
    }   
}
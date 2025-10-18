public class oopsobj {
    public static void main(String[] args) {
        oops l1=new oops("Aravind","Iphone",2709);
        System.out.println("name:"+l1.getname());
        System.out.println("mobile:"+l1.getmobile());
        System.out.println("pwd:"+l1.getpwd());
        System.out.println("****************");
        l1.setmobile("sun");
        l1.setname("AK king");
        l1.setpwd(2322);
        System.out.println("name:"+l1.getname());
        System.out.println("mobile:"+l1.getmobile());
        System.out.println("pwd:"+l1.getpwd());
    }
}

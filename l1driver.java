public class l1driver {

    public static void main(String[] args) {
        laptop l1=new laptop("dell", 200000, 8);

        System.out.println("brand="+l1.getbrand());
        System.out.println("price="+l1.getprice());
        System.out.println("ram="+l1.getram());
        l1.setbrand("Asus");
        l1.setbrand("hp");
        l1.setprice(2500000);
        System.out.println("brand="+l1.getbrand());
        System.out.println("price="+l1.getprice());
        System.out.println("ram="+l1.getram());

    }

    
}

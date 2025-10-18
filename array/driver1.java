public class driver1 {
    public static void main(String[] args) {
        car c1=new car("BMW",8000000,new enginecar("DIESEL", "250", 1000));
        System.out.println("\t\t"+c1.name+" details");
        c1.e.detailsofengine();
        c1.detailsofcar();
        
    }

}

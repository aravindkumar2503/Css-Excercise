public class singletonobj {
    public static void main(String[] args) {
        singleton s1=singleton.getdatabase("RAM", "WINDOWS");
        singleton s2=singleton.getdatabase("SSD", "LINUX");
        System.out.println(s1.getuser());
        System.out.println(s2.getos());
        System.out.println(s2);
        System.out.println(s1);
    }
    
}

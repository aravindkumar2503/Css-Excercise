class super1 {

    super1()
    {
        //L.I
        System.out.println("Java");
    }

    super1(boolean a)
    {
        //L.I
        System.out.println("Sql:"+a);
    }
    
}

class  b extends super1{
    b()
    {
        super();
        //L.I
        System.out.println("J2SE");
    }
    b(String s,boolean m)
    {
        super(m);
        {
            System.out.println("J2EE");
        }
    }

    public static void main(String[] args) {
        System.out.println("Start");
        b ref=new b();
        System.out.println("End");
    }
}

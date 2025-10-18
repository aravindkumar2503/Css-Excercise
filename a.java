class a {
    int x=10;
    static int y=30;

    a(){}

    
}
class b extends a{
    int x=20;
    int y=40;
    b()
    {
        super();
    }
    public void display()
    {
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(y); 
        System.out.println(super.y); 
    }
    
    
}


public class laptop {
    
    private String brand;
    private double price;
    private int ram;

    laptop(String brand,double price,int ram)
    {
        this.brand=brand;
        this.price=price;
        this.ram=ram;
    }

    public String getbrand()
    {
        return brand;
    }
    public double getprice()
    {
        return price;
    }
    public int getram()
    {
        return ram;
    }

    public void setbrand(String brand)
    {
        this.brand=brand;
    }
    public void setprice(double price)
    {
        this.price=price;
    }
    public void setram(int ram)
    {
        this.ram=ram;
    }
}

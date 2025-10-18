interface food1
{
    void idle();
}
interface food2
{
    void dosa();
}
class multiple_inheritance implements food1,food2{

    public void idle()
    {
        System.out.println("Favourite food is idle");
    }

    public void dosa()
    {
        System.out.println("Favourite food is dosa");
    }
}
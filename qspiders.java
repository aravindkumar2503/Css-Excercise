abstract class qspiders {

    abstract void development();
    abstract void testing();
}
class trainer extends qspiders 
{
    public void development()
    {
        System.out.println("Development skills");
    }
    public void testing()
    {
        System.out.println("Testing");
    }
}
class student
{
    public static void main(String[] args) {
        qspiders ref=new trainer();
        ref.development();
        ref.testing();
    }

}

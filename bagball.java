
import java.util.Scanner;

public class bagball {

    static basketball BB=new basketball();
    static tennisball tb=new tennisball();
    static bag b1=new bag();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        boolean flag=true;
        do { 

            System.out.println("1.Add ball\n2.remove ball\n3.check bag is empty or not\n4.show game that can be played\n5.Radius of ball\n6.exit\n*********");
            System.out.print("Enter input=");
            int input=sc.nextInt();
            switch (input) {
                case 1:
                {
                    if(b1.isbagempty())
                    {
                        System.out.println("\tSelect ball:");
                        System.out.println("\t\t1.basketball\n\t\t2.tennisball");
                        System.out.print("enter user=");
                        int user=sc.nextInt();
                        if(user==1)
                        {
                            b1.addball(BB);
                            System.out.println("\t\t*********basketball added*********");
                        }
                        if(user==2)
                        {
                            b1.addball(tb);
                            System.out.println("\t\t*********tennisball added*********");
                        }
                    }
                    break;
                }
                case 2:
                {
                    /*if(b1.isbagempty())
                    {
                        System.out.println("\t\t*********Already BAG is empty************");
                    }
                    else{
                        b1=null;
                        System.out.println("\t\t*********Ball is removed***********");
                    }*/
                    b1.removebag();
                    break;
                }
                case 3:
                {
                    /*if(b1==null)
                    {
                        System.out.println("\t\t*********bag is not empty********");
                    }
                    else
                    {
                        System.out.println("\t\t**************bag is empty************");
                    }*/
                    System.out.println((b1.isbagempty())?"\t\t********Yes,bag is empty**********":"\t\t********No,bag is not empty***************");
                    break;
                }
                case 4:
                {
                    System.out.println("\t\t************Game="+b1.showgame()+"************");
                    break;
                }
                case 5:
                {
                    System.out.println("1.Radius of basketball\n2.radius of tennisball");
                    System.out.print("Enter inp=");
                    int inp=sc.nextInt();
                    if(inp==1)
                        System.out.println("Radius of basketball="+BB.getball());
                    else if(inp==2)
                    {
                        System.out.println("Radius of tennisball="+tb.getball());
                    }
                    break;
                }
                case 6:
                {
                    flag=false;
                }

            }
            
        } while (flag);
        {
            System.out.println("Thank you");
        }
        
    }
    
}

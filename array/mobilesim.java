
import java.util.Scanner;

public class mobilesim {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //mobile class obj--->it's public
        mobile Mobile=new mobile("MI", "256", 27000);
        sim Sim=sim.getsim("Airtel", "5g", 100);
        Mobile.detailsofmobile();
        Sim.detailsofsim();
        boolean flag=true;
        do{
            System.out.println("\t\tWELCOME TO SIM TRACKER");
            System.out.println("1.Insert sim\n2.Remove sim\n3.Is sim present\n4.detailsofsim\n5.detailsofmobile\n6.mobile_number\n7.Exit");
            int input=sc.nextInt();
            switch (input) {
                case 1:
                {
                    Mobile.insertsim(Sim);
                    break;
                }
                case 2:
                {
                    Mobile.removesim();
                    break;
                }
                case 3:
                {
                    System.out.println((Mobile.isslotempty())?"not present":"present");
                    break;
                }
                case 4:
                {
                    if(Mobile.isslotempty())
                    {
                        System.out.println("\t\tInsert sim to see details of sim");
                    }
                    else{
                        Sim.detailsofsim();
                    }
                    break;
                }
                case 5:
                {
                    Mobile.detailsofmobile();
                    break;
                }
                case 6:
                {
                    Mobile.mobile_no();
                    break;
                }
                case 7:
                {
                    flag=false;
                    break;
                }

            }
        }
        while(flag);
        {
            System.out.println("Thank you");
        }
    }
}

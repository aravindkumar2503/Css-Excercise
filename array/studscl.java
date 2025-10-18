import java.util.Arrays;
import java.util.Scanner;

public class studscl {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        student s1=new student("Aravind", 5003, 100);
        student s2=new student("KUMAR", 5004, 88);
        student s3=new student("SAM", 5005, 34);
        student []s={s1,s2,s3};
        school1 SCHOOL=new school1("C.E.O.A", "MADURAI", "VEERAMANI", s);

        //SCHOOL.totalstrength();
        //SCHOOL.failed();
        boolean flag=true;
        do { 

            System.out.println("\t\tWELCOME TO STUDENT DETAILS");
            System.out.println("1.view student name\n2.sort students\n3.Failed students\n4.details of students\n5.exit");
            int input=sc.nextInt();
            switch(input)
            {
                case 1:
                {
                    System.out.println("STUDENT NAME:"+s1.getname());
                    break;
                }
                case 2:
                {
                    for(int i=0;i<s.length;i++)
                    {
                        Arrays.sort(s);
                    }
                    break;
                }
                case 3:
                {
                    SCHOOL.failed();
                    break;
                }
                case 4:
                {
                    s1.detailsofstudent();
                    s2.detailsofstudent();
                    s3.detailsofstudent();
                    break;
                }
                case 5:
                {
                    flag=false;
                    break;
                }

            }
            
        } while (flag);
        {
            System.out.println("THANK YOU");
        }
        
    }
    
}

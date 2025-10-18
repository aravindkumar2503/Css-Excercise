public class stud {
        private String sname;
        private int id;
        private double mark;
        
        public stud(String sname,int id,double mark)
        {
            this.sname=sname;
            this.id=id;
            this.mark=mark;
        }

        public String getname()
        {
            return sname;
        }
        public int getid()
        {
            return id;
        }
        public double getmark()
        {
            return mark;
        }

        public void detailsofstud()
        {
            System.out.println("sname:"+getname());
            System.out.println("id:"+getid());
            System.out.println("marks:"+getmark());
        }
        public static stud getstud()
        {
            return new stud(String )
        }

    }
    

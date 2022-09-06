public class employee {
    public static final int present = 1;
    public static final int part_time = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage progrsm");

        int Emp_rate = 20;
        int Emp_hour = 0;
        int Emp_wage = 0;
        int total_Emp_hour = 0;
        int Max_mum_day = 20;
        int days = 1;
        int maximum_hour = 100;
        while (total_Emp_hour<= maximum_hour && days < Max_mum_day){
            days ++;

            int employe_check = (int) Math.floor(Math.random() * 10) % 3;
            switch (employe_check) {
                case present:
                    //System.out.println("Employee is full time");
                    Emp_hour = 8;
                    break;
                case part_time:
                    //System.out.println("Employee is part time");
                    Emp_hour = 4;
                    break;
                default:
                    //System.out.println("Employee is absent");
                    Emp_hour = 0;
                    break;
            }
            total_Emp_hour += Emp_hour;
            System.out.println("Days : "+ days + " Emp hour: " + Emp_hour);
        }
        Emp_wage = total_Emp_hour * Emp_rate;
        System.out.println("Total Emp wage for 20 days : "+ Emp_wage);
    }
}



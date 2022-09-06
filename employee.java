public class employee {
    public static final int present = 1;
    public static final int part_time = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage progrsm");

        int Emp_rate = 20;
        int Emp_hour = 0;
        int Emp_wage = 0;

        int employe_check = (int) Math.floor(Math.random() * 10) % 3;
        switch (employe_check){
            case present:
                System.out.println("Employee is full time");
                Emp_hour = 8;
                break;
            case part_time:
                System.out.println("Employee is part time");
                Emp_hour = 4;
                break;
            default:
                System.out.println("Employee is absent");
                Emp_hour = 0;
                break;
        }

        Emp_wage = Emp_hour * Emp_rate;
        System.out.println("Emp_Wage : "+ Emp_wage);
    }
}



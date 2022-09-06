public class employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int present = 1;
        int employe_check = (int) (Math.floor(Math.random() * 10) % 2);
        if (employe_check == present) {
            System.out.println("Employe is present" );
        } else {
            System.out.println("Employee is absent" );
        }
    }
}

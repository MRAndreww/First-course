public class Main {

    public static void main(String[] arg) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Petr Ivanovich Beck", 1, 30000);
        employee[1] = new Employee("Sergei Ivanovich Beck", 1, 20000);
        employee[2] = new Employee("Inna Ivanovna Beck", 1, 10000);
        employee[3] = new Employee("Petr Ivanovich Beck", 2, 50000);
        employee[4] = new Employee("Petr Ivanovich Beck", 3, 70000);
        employee[5] = new Employee("Petr Ivanovich Beck", 4, 60000);
        employee[6] = new Employee("Petr Ivanovich Beck", 3, 100000);
        employee[7] = new Employee("Petr Ivanovich Beck", 2, 80000);
        employee[8] = new Employee("Petr Ivanovich Beck", 2, 90000);
        employee[9] = new Employee("Petr Ivanovich Beck", 2, 90000);
        //System.out.println(employee[i]);
        printAll(employee);
        System.out.println(totalSalary(employee));
    }

    public static void printAll(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static int totalSalary (Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }



}







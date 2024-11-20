public class Manager extends Employee {
    public Manager(String lastName, String firstName, String secondName, int age,
                   String position, String phoneNumber, int salary, String hireDate) {
        super(lastName, firstName, secondName, age, position, phoneNumber, salary, hireDate);
    }

    public static int raiseSalaryNotManager(Employee[] employees, int deltaSalary) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && !(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() + deltaSalary);
                count++;
            }
        }
        return count;
    }
}

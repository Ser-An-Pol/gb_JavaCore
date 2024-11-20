import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String lastName;
    private String firstName;
    private String secondName;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;
    private String hireDate;

    public Employee(String lastName, String firstName, String secondName,
                    int age, String position, String phoneNumber, int salary, String hireDate) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
        this.secondName = secondName;
        this.firstName = firstName;
        this.age = age;
        this.hireDate = hireDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + secondName;
    }

    @Override
    public String toString() {
//        return "\nКарточка сотрудника:\n" +
//                getFullName() + "\n" +
//                "Должность: " + position +
//                "\nТелефонный номер: " + phoneNumber +
//                "\nВозраст: " + age +
//                "\nЗарплата: " + salary +
//                "\n";

        return String.format("%nКарточка сотрудника: %n%s%nДолжность: %s%nТелефонный номер: " +
                        "%s%nВозраст: %d%nЗарплата: %d%nДата приема на работу: %s%n",
                getFullName(), position, phoneNumber, age, salary, hireDate);
    }

    public static int raiseSalaryDependAge(Employee[] employees, int ageBound, int deltaSalary) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getAge() >= ageBound) {
                employee.setSalary(employee.getSalary() + deltaSalary);
                count++;
            }
        }
        return count;
    }

    public static double getAverageAge(Employee[] employees) {
        int count = 0;
        int mean = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                count++;
                mean += employee.getAge();
            }
        }
        return 1.0*mean/count;
    }

    public static double getAverageSalary(Employee[] employees) {
        int count = 0;
        int mean = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                count++;
                mean += employee.getSalary();
            }
        }
        return 1.0*mean/count;
    }


    @Override
    public int compareTo(Employee o) {
        return Comparator.comparing(Employee::getHireDate).compare(this, o);
    }
}

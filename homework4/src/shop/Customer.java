package shop;

public class Customer {
    private String lastName;
    private String firstName;
    private String secondName;
    private Gender gender;
    private int age;
    private String phoneNumber;

    public Customer(String lastName, String firstName, String secondName,
                        Gender gender, int age, String phoneNumber) {
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.secondName = secondName;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return getLastName() + " " + getFirstName() + " " + getSecondName();
    }

    @Override
    public String toString() {
        return "Customer{" + getFullName() +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

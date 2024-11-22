package shop;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {
    private final List<Customer> customers;
    private final List<Product> products;
    private final List<Order> orders;

    public Shop() {
        customers = new ArrayList<>();
        products = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public boolean makeOrder(Customer customer, Product product, int amount) {
        if (!customers.contains(customer)) throw new NotFoundCustomerException(customer);
        if (!products.contains(product)) throw new NotFoundProductException(product);
        if (amount <= 0) {
            orders.add(new Order(customer, product, 1));
            throw new NotPositiveAmountException(amount);
        }
        orders.add(new Order(customer, product, amount));
        return true;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void congratulate() {
        //LocalDate date = LocalDate.now();
//        LocalDate date = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate date = LocalDate.of(2024, Month.FEBRUARY, 23);
//        LocalDate date = LocalDate.of(2024, Month.MARCH, 8);

        Holidays holiday = Arrays.stream(Holidays.values())
                .filter(a -> a.getMonth().equals(date.getMonth()))
                .filter(a -> a.getDay() == date.getDayOfMonth())
                .findAny().orElse(null);
        if (holiday == null) return;

        System.out.println(holiday);

        for (Customer customer : getCustomers()) {
            if (holiday.equals(Holidays.March8)) {
                if (customer.getGender() == Gender.FEMALE) {
                    System.out.println("Уважаемая " + customer.getFullName() + ", " + holiday.getName());
                }
            } else if (holiday.equals(Holidays.FEBRUARY23)) {
                if (customer.getGender() == Gender.MALE) {
                    System.out.println("Уважаемый " + customer.getFullName() + ", " + holiday.getName());
                }
            } else {
                System.out.println(((customer.getGender() == Gender.MALE) ? "Уважаемый " : "Уважаемая ")
                        + customer.getFullName() + ", " + holiday.getName());
            }
        }
    }
}

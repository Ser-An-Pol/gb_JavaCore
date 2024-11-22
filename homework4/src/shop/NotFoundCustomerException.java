package shop;

public class NotFoundCustomerException extends RuntimeException {
    private final Customer customer;
    public NotFoundCustomerException(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String getMessage() {
        return customer.toString() + " is not found in shop's clients...";
    }
}

package shop;

public class Order {
    private Customer customer;
    private Product product;
    private int amount;

    public Order(Customer customer, Product product, int amount) {
        this.amount = amount;
        this.customer = customer;
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product=" + product +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}

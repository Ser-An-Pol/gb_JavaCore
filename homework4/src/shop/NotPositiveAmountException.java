package shop;

public class NotPositiveAmountException extends RuntimeException {
    private final int amount;
    public NotPositiveAmountException(int amount) {
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return "Amount (" + amount + ")  must be positive...";
    }
}

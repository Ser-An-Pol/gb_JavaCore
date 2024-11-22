package shop;

public class NotFoundProductException extends RuntimeException {
    private final Product product;
    public NotFoundProductException(Product product) {
        this.product = product;
    }

    @Override
    public String getMessage() {
        return product.toString() + " is not found in shop's products...";
    }
}

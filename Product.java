public class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + productId+", Name:" + name+ ", Price:"+ price);
    }

    public double calculateDiscount() {
        return price * 0.10; // Adds 10% discount
    }

    public double finalPrice() {
        return price - calculateDiscount();
    }

    public void showSpecs() {
        System.out.println("Basic Product");
    }
}

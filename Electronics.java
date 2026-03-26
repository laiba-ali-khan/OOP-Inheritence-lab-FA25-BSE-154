public class Electronics extends Product {
     String brand;
     int warranty;

    Electronics(int productId, String name, double price, String brand, int warranty) {
        super(productId, name, price); // using constructor chaining
        this.brand = brand;
        this.warranty = warranty;
    }

    // using Override displayInfo as per task
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: "+ brand+", Warranty:"+warranty+ "years");

    }
}

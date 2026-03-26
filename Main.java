public class Main {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone(
                101, "Samsung Galaxy", 100000,
                "Samsung", 2,
                128, 50, 5000
        );

        phone.displayInfo();

        System.out.println("Discount: " + phone.calculateDiscount());
        System.out.println("Final Price: " + phone.finalPrice());

        phone.showSpecs();
    }
}

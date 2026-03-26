public class Smartphone extends Electronics {
    private int storage;
    private int cameraMP;
    private int battery;

    Smartphone(int productId, String name, double price, String brand, int warranty, int storage, int cameraMP, int battery) {
        super(productId, name, price, brand, warranty);
        this.storage = storage;
        this.cameraMP = cameraMP;
        this.battery = battery;
    }

    @Override
    public void showSpecs() {
        System.out.println("Smartphone Specifications:");
        System.out.println("storage:"+storage + "GB, "+ "CameraQuality:"+cameraMP +"MP camera, "+"Battery:" +battery +"mAh battery");
    }
}

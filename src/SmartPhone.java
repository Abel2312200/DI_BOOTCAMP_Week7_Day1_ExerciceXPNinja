public class SmartPhone extends Computer {
    private double size;

    // constructor without parameter
    public SmartPhone() {
        super();
    }

    // constructor(s) using parameter(s)
    public SmartPhone(double size) {
        super();
        this.size = size;
    }
    public SmartPhone(String brand, String model, int yearOfRelease, double storage) {
        super(brand, model, yearOfRelease);
        this.size = size;
    }

    // getters and setters
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // class Methods
    public String getDetails() {
        // calling Base Class Function
        String message = "Size "+size+super.toString();
        return (message);
    }
}

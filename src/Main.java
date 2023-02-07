public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple","Pro",2019,512);
        System.out.println(laptop.getDetails());
        SmartPhone smartPhone = new SmartPhone("Iphone","Prox max",2020,128);
        System.out.println(smartPhone.getDetails());
    }
}
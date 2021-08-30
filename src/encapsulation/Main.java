package encapsulation;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike("TVS","Apache",2016);
        b1.setYear(2020);
        System.out.println("Comapny:"+b1.getCompany()+ "\nModel: "+b1.getModel()+ "\nYear: "+b1.getYear());
    }
}

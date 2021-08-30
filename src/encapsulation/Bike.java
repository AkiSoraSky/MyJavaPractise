package encapsulation;

public class Bike {
    private String company;
    private String model;
    private int year;

    public Bike(String company, String model, int year) {
        this.setCompany(company);
        this.setModel(model);
        this.setYear(year);
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

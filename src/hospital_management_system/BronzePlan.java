package hospital_management_system;

public class BronzePlan extends HealthInsurancePlan {

    public BronzePlan(double coverage) {
        this.coverage = coverage;
    }

    public static void main(String[] args) {
        BronzePlan gp = new BronzePlan(0.8);
    }
}

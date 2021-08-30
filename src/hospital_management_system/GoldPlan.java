package hospital_management_system;

public class GoldPlan extends HealthInsurancePlan {

    public GoldPlan(double coverage) {
        this.coverage = coverage;
    }

    public static void main(String[] args) {
        GoldPlan gp = new GoldPlan(0.8);
    }
}

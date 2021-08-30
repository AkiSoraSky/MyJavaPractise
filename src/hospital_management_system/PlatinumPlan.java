package hospital_management_system;

public class PlatinumPlan extends HealthInsurancePlan {

    public PlatinumPlan(double coverage) {
        this.coverage = coverage;
    }

    public static void main(String[] args) {
        PlatinumPlan pp = new PlatinumPlan(0.9);
    }
}

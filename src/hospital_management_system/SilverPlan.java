package hospital_management_system;

public class SilverPlan extends HealthInsurancePlan {

    public SilverPlan(double coverage) {
        this.coverage = coverage;
    }

    public static void main(String[] args) {
        SilverPlan gp = new SilverPlan(0.8);
    }
}

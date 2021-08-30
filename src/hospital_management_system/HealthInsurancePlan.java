package hospital_management_system;

public class HealthInsurancePlan {
        // 'coverage' field goes here
        protected double coverage;

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    private InsuranceBrand offeredBy;

        public InsuranceBrand getOfferedBy() {
            return offeredBy;
        }

        public void setOfferedBy(InsuranceBrand offeredBy) {
            this.offeredBy = offeredBy;
        }
}

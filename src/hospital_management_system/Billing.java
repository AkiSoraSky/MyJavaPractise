package hospital_management_system;

public class Billing {

        public static double[] computePaymentAmount(Patient patient, double amount) {
            double[] payments = new double[2];

            HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

            // your logic

            return payments;
        }
}

public class Doctor extends Staff implements MedSupport, PatientService {
    private String specialization;

    public Doctor(String firstName, String lastName, String specialization) {
        super(firstName, lastName);
        this.specialization = specialization;
    }

    @Override
    public void provideCare(Patient patient) {
        System.out.println("Врач " + toString() + " лечит пациента " + patient);
    }

    @Override
    public String toString() {
        return super.toString() + ", Врач, Специализация: " + specialization;
    }
}

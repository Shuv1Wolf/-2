public class Nurse extends Staff implements MedSupport {
    public Nurse(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void provideCare(Patient patient) {
        System.out.println("Медсестра " + toString() + " помогает пациенту " + patient);
    }

    @Override
    public String toString() {
        return super.toString() + ", Медсестра";
    }
}

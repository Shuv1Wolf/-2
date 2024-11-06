public class Patient extends Person {
    private String diagnosis;

    public Patient(String firstName, String lastName, String diagnosis) {
        super(firstName, lastName);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        return super.toString() + ", Диагноз: " + diagnosis;
    }
}

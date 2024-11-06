public class Receptionist extends Staff {
    public Receptionist(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void registerPatient(Patient patient) {
        System.out.println("Регистратор " + toString() + " регистрирует пациента " + patient);
    }

    @Override
    public String toString() {
        return super.toString() + ", Регистратор";
    }
}

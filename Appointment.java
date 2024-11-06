public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String time;

    public Appointment(Doctor doctor, Patient patient, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Прием: Врач - " + doctor + ", Пациент - " + patient + ", Время: " + time;
    }
}

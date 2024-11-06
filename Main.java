public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic("Поликлиника №1");

        Doctor doctor = new Doctor("Иван", "Иванов", "Терапевт");
        Nurse nurse = new Nurse("Ольга", "Сидорова");
        Receptionist receptionist = new Receptionist("Анна", "Петрова");

        clinic.addStaff(doctor);
        clinic.addStaff(nurse);
        clinic.addStaff(receptionist);

        Patient patient = new Patient("Алексей", "Иванов", "Грипп");
        clinic.addPatient(patient);

        Appointment appointment = new Appointment(doctor, patient, "10:00");
        clinic.addAppointment(appointment);

        clinic.printClinicInfo();
    }
}

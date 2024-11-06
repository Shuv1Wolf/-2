import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String name;
    private List<Patient> patients = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public Clinic(String name) {
        this.name = name;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addStaff(Staff staff) {
        staffMembers.add(staff);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void printClinicInfo() {
        System.out.println("Поликлиника: " + name);
        System.out.println("Список пациентов:");
        patients.forEach(System.out::println);
        System.out.println("Список сотрудников:");
        staffMembers.forEach(System.out::println);
        System.out.println("Список приемов:");
        appointments.forEach(System.out::println);
    }
}

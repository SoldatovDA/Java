import java.util.ArrayList;

public class Hospital implements HospitalFunctional {
    private ArrayList<Patient> patients;

    public Hospital() {
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public void register(Patient patient) {
        System.out.println("Patient: ");
        patient.getData();
        System.out.println("Is registered");
    }

    @Override
    public void registerToADoctor(Patient patient, String doctor) {
        System.out.println("Patient: ");
        patient.getData();
        System.out.println("Is registered to a doctor " + doctor);
    }

    @Override
    public void setAContract(Patient patient) {
        patient.setService();
    }

    @Override
    public void deleteAContract(Patient patient) {
        patient.deleteService();
    }

    @Override
    public void updateDiagnose(Patient patient, String diagnose) {
        patient.changeDiagnose(diagnose);
    }

    @Override
    public void getLaboratoryResearch(String research) {
        System.out.println("Started "+research+" researching");
    }
}

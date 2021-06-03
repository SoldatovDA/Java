public class Main {
    public static void main(String[] args) {
        Patient patient = new PatientWithCOVID("Surname", "Name", "Patronymic",
                "Address", "PhoneNumber", 125);
        patient.changeDiagnose("Some diagnose");
        patient.getData();
        System.out.print("\nPatient have ");
        patient.treat();
        Hospital hospital = new Hospital();
        System.out.println("\nPatient signed a contract ");
        hospital.setAContract(patient);
        patient.getData();
        System.out.println("\nPatient unsigned a contract ");
        hospital.deleteAContract(patient);
        patient.getData();
        hospital.register(patient);
        hospital.registerToADoctor(patient, "Kopernyck");
        System.out.println("\nPatient change surname: ");
        patient.getData();
        patient.changeSurname("New Surname");
        patient.getData();
    }
}

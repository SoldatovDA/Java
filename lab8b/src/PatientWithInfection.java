public class PatientWithInfection extends Patient{
    public PatientWithInfection(String surname, String name, String patronymic, String address, String phoneNumber, int medNumber) {
        super(surname, name, patronymic, address, phoneNumber, medNumber);
    }

    @Override
    public void treat() {
        System.out.println("treating patient with infection");
    }
}

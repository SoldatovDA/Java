public class PatientWithCOVID extends Patient{
    public PatientWithCOVID(String surname, String name, String patronymic, String address, String phoneNumber, int medNumber) {
        super(surname, name, patronymic, address, phoneNumber, medNumber);
    }

    @Override
    public void treat() {
        System.out.println("treating of COVID-19");
    }
}

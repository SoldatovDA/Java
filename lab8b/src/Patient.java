public class Patient implements PatientFunctional {
    private static int COUNTER = 1;
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String diagnose;
    private String diseaseHistory = "";
    private String phoneNumber;
    private int medNumber;
    private boolean payment = false;
    private boolean isServiced = false;

    public Patient(String surname, String name, String patronymic,
                   String address, String phoneNumber, int medNumber) {
        this.id = COUNTER++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medNumber = medNumber;
    }

    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void payForTreatment() {
        this.payment = true;
    }

    public void setService(){
        this.isServiced = true;
    }
    public void deleteService(){
        this.isServiced = false;
    }

    @Override
    public void changeSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public void changeDiagnose(String diagnose) {
        this.diagnose = diagnose;
        this.diseaseHistory+=diagnose+" ";
    }

    @Override
    public void changeAddress(String address) {
        this.address = address;
    }

    @Override
    public void changePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void changeMedNumber(int medNumber) {
        this.medNumber = medNumber;
    }

    @Override
    public String getData() {
        System.out.println(this.toString());
        return this.toString();
    }

    @Override
    public String toString() {
        return "Patient{" +
               "\nid=" + id +
               ", \nsurname='" + surname + '\'' +
               ", \nname='" + name + '\'' +
               ", \npatronymic='" + patronymic + '\'' +
               ", \naddress='" + address + '\'' +
               ", \ndiagnose='" + diagnose + '\'' +
               ", \ndiseaseHistory='" + diseaseHistory + '\'' +
               ", \nphoneNumber='" + phoneNumber + '\'' +
               ", \nmedNumber=" + medNumber +
               ", \npayment=" + payment +
               ", \nisServiced=" + isServiced +
               '}';
    }

    @Override
    public void treat() {
        System.out.println("treating " + this.diagnose);
    }
}

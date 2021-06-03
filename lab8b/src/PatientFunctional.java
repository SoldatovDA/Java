public interface PatientFunctional {
    void changeSurname(String surname);
    void changeName(String name);
    void changeDiagnose(String diagnose);
    void changeAddress(String address);
    void changePhoneNumber(String phoneNumber);
    void changeMedNumber(int medNumber);

    String getData();
    void treat();
}

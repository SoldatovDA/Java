public class Patient {

    private static int counter = 1;
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String number;
    private String kartochka;
    private String diagnoz;

    public Patient() {
        this.surname = "";
        this.name = "";
        this.patronymic = "";
        this.address = "";
        this.number = "";
        this.kartochka = "";
        this.diagnoz = "";
    }

    public Patient(Patient patient) {
        surname = patient.surname;
        name = patient.name;
        patronymic = patient.patronymic;
        address = patient.address;
        number = patient.number;
        kartochka = patient.kartochka;
        diagnoz = patient.diagnoz;
        id = counter;
        counter++;
    }

    public Patient(String surname, String name, String patronymic, String address, String number, String kartochka, String diagnoz) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.number = number;
        this.kartochka = kartochka;
        this.diagnoz = diagnoz;
        id = counter;
        counter++;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setKartochka(String kartochka) {
        this.kartochka = kartochka;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public String getKartochka() {
        return kartochka;
    }


    @Override
    public String toString() {
        return "Patient {" +
                "Full name: " + surname + " " + name + " " + patronymic + '\n' +
                "Address: " + address + '\n' +
                "Phone number: " + number + '\n' +
                "Number of medical card: " + kartochka + '\n' +
                "Diagnoz: " + diagnoz + '\n'+
                '}';
    }
}


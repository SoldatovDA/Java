import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Patient> mass = new ArrayList<>();
        int key = 1;
        Scanner in = new Scanner(System.in);
        while (key != 0) {
            menu();
            key = in.nextInt();
            switch (key) {
                case 1:
                    System.out.println("enter from the keyboard");
                    String surname;
                    String name;
                    String patronymic;
                    String address;
                    String number;
                    String kartochka;
                    String diagnoz;
                    int count = 0;
                    System.out.print("Enter the number of patients: ");
                    count = in.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter patient details: " + '\n' + "full name: ");
                        surname = in.next();
                        name = in.next();
                        patronymic = in.next();
                        System.out.print("Address: ");
                        address = in.next();
                        System.out.print("Personal number: ");
                        number = in.next();
                        System.out.print("Number of medical card: ");
                        kartochka = in.next();
                        System.out.print("Diagnoz: ");
                        diagnoz = in.next();
                        mass.add(new Patient(surname, name, patronymic, address, number, kartochka, diagnoz));
                    }
                    break;
                case 2:
                    System.out.println("introduce patients of one diagnoz");
                    System.out.println("Enter the name of the diagnoz: ");
                    diagnoz = in.next();
                    if (!mass.isEmpty()) {
                        ArrayList<Patient> res = byDiagnoz(mass, diagnoz);
                        if (res.isEmpty()) {
                            System.out.println("No patients found for this diagnoz.");
                        } else {
                            for (Patient iter : res) {
                                System.out.println(iter + "\n");
                            }
                        }
                    } else {
                        System.out.println("You have not entered any patient yet");
                    }
                    break;
                case 3:
                    System.out.println("introduce patients by number of medical card");
                    System.out.println("Enter the interval: ");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    if (!mass.isEmpty()) {
                        ArrayList<Patient> res = byKartochka(mass, a, b);
                        if (res.isEmpty()) {
                            System.out.println("No patients of this number of medical card.");
                        } else {
                            for (Patient iter : res) {
                                System.out.println(iter + "\n");
                            }
                        }
                    } else {
                        System.out.println("You have not entered any patient yet");
                    }
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("1 - enter from the keyboard");
        System.out.println("2 - enter patients of the same diagnoz");
        System.out.println("3 - enter the patients whose card numbers are in a given interval");
        ;
        System.out.println("0 - exit");
    }

    private static ArrayList<Patient> byDiagnoz(ArrayList<Patient> mass, String diagnoz) {
        ArrayList<Patient> result = new ArrayList<>();
        for (Patient iter : mass) {
            if (iter.getDiagnoz().equals(diagnoz)) {
                result.add(iter);
            }
        }
        return result;
    }

    private static ArrayList<Patient> byKartochka(ArrayList<Patient> mass, int a, int b) {
        ArrayList<Patient> result = new ArrayList<>();
        for (Patient iter : mass) {
            String buff = iter.getKartochka();
            Integer Kaartochka = Integer.valueOf(buff);
            if (Kaartochka.intValue() >= a && Kaartochka.intValue() <= b) {
                result.add(iter);
            }
        }
        return result;
    }
}
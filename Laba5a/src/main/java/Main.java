import exceptions.CasementException;
import java.io.InvalidObjectException;
import java.util.ArrayList;

public class Main {
    private final static String FILE_PATH = "serial.txt";

    public static void main(String[] args) {
        ArrayList<Door> doors = new ArrayList<>();
        ArrayList<Window> windows = new ArrayList<>();

        Door door1 = new Door("white");
        Door door2 = new Door("black");

        Window window1;
        Window window2;
        Window window3;

        try {
            window1 = new Window(2);
            windows.add(window1);

            window2 = new Window(3);
            windows.add(window2);

            window3 = new Window(4);
            windows.add(window3);

//            new Window (-4);
//            new Window(4 / 0);
        } catch (ArithmeticException | CasementException e) {
            System.out.println(e);
        }

        doors.add(door1);
        doors.add(door2);

        House house = new House(doors, windows);
        house.close();
        /*System.out.println("\n");
        System.out.println("Before serialization:");
        System.out.println (house);
        House.setNumberOfTheHouse (5);
        System.out.println ("number of the house:");
        System.out.println (House.getNumberOfTheHouse ());
        System.out.println("\n");

        Serializer serializer = new Serializer ();
        House resultingHouse = null;
        try {
            resultingHouse = serializer.deserialization(FILE_PATH);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println("After serialization:");
        System.out.println(resultingHouse);
        System.out.println ("number of the house:");
        System.out.println (House.getNumberOfTheHouse());*/


//        System.out.println (door1 + " == " + door1 + " ? " + door1.equals (door1));
//        System.out.println (door1 + " == " + door2 + " ? " + door1.equals (door2));
//        System.out.println (door2 + " == " + door1 + " ? " + door2.equals (door1));
//        System.out.println (door1 + " == " + door3 + " ? " + door1.equals (door3));
//
        ArrayList<Door> doors3 = new ArrayList<>();
        doors3.add(door1);
        House house3 = new House(doors3, windows);
        System.out.println(house + " == \n" + house3 + " ? " + house.equals(house3));

        house.addDoor(door1);
        house.close();
        System.out.println("\n modified house " + house);
    }
}
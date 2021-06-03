import exceptions.CasementException;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
public class TestDoor {
    public void checkIsClosedDoor() {
        System.out.println("proverka na zakritie");
        ArrayList<Door> doors = new ArrayList<>();
        ArrayList<Window> windows = new ArrayList<>();
        House house = new House(doors, windows);
        System.out.println("Door is closed? " + house.isClosed());
        house.close();
        System.out.println("Door is closed? " + house.isClosed());
        assertTrue(house.isClosed());
    }

    public void checkOutput() {
        System.out.println("proverka na okna i dveri");
        final String result = "House{doors=[Door{color='white'}, Door{color='black'}]," +
                              " windows=[Window{numberOfCasement=2}, Window{numberOfCasement=3}, " +
                              "Window{numberOfCasement=4}], closed=false}";
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
        } catch (ArithmeticException | CasementException e) {
            System.out.println(e);
        }

        doors.add(door1);
        doors.add(door2);

        House house = new House(doors, windows);
        String resultMethod = house.toString();
        System.out.println("Control result: " + result);
        System.out.println("Method result: " + resultMethod);
        assertEquals(result, resultMethod);
    }
}

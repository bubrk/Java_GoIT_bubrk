package task7;

import task1_2.Room;
import task5.DAO;
import task5.DAOImpl;
import task6.Controller;

/**
 * ЗАДАНИЕ 7
 * In Main class method just create Controller and make three requests with different parameters to find rooms. Also, all
 * check methods three times with different apis to demonstrate how programs works.
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        System.out.println("Looking for the room: price=100, persons=1, city=\"London\", Hotel=\"Paradise\"...");
        Room[] requestedRooms = controller.requestRooms(100, 1, "London", "Paradise");
        if (requestedRooms.length > 0) {
            System.out.println("List of requested room: ");
            int i = 1;
            for (Room room : requestedRooms) {
                System.out.println(i + ": " + room.toString());
                i++;
            }
        } else {
            System.out.println("Nothing was found");
        }

        System.out.println("\nLooking for same rooms between BookingComAPI and GoogleAPI...");
        Room[] sameRooms = controller.check(controller.getApis()[0],controller.getApis()[1]);
        if (sameRooms.length > 0) {
            System.out.println("There is/are "+sameRooms.length+" same room(s). This is the list:");
            int i = 1;
            for (Room room : sameRooms) {
                System.out.println(i + ": " + room.toString());
                i++;
            }
        } else {
            System.out.println("Nothing was found");
        }

        System.out.println("\nTrying DAO updating...");
        DAO daoImpl=new DAOImpl();
        daoImpl.update(controller.getApis()[0].getRooms()[0]);
    }
}

package module5.task7;

import module5.task1_2.Room;
import module5.task5.DAO;
import module5.task5.DAOImpl;
import module5.task6.Controller;

import java.util.Set;

/**
 * ЗАДАНИЕ 7
 * In Main class method just create Controller and make three requests with different parameters to find rooms. Also, all
 * check methods three times with different apis to demonstrate how programs works.
 */
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        System.out.println("Looking for the room: price=100, persons=1, city=\"London\", Hotel=\"Paradise\"...");
        Set<Room> requestedRooms = controller.requestRooms(100, 1, "London", "Paradise");
        if (requestedRooms.size() > 0) {
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
        Set<Room> sameRooms = controller.check(controller.getApi("BookingCom"),controller.getApi("Google"));
        if (sameRooms.size() > 0) {
            System.out.println("There is/are "+sameRooms.size()+" same room(s). This is the list:");
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
        daoImpl.update(controller.getApi("BookingCom").findRoomByID(1));
    }
}

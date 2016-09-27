package task6;

import task1_2.Room;
import task3.API;
import task4.BookingComAPI;
import task4.GoogleAPI;
import task4.TripAdvisorAPI;

import java.util.Arrays;

/**
 * ЗАДАНИЕ 6
 * Create Controller class. It contains global variable
 * API apis[] = new API[3];
 * which contains all impelentations of API interface.
 * Also, controller contains two methods
 * Room[] requstRooms(int price, int persons, String city, String hotel)
 * which finds all the rooms with requested params. Method use all apis available to make search.
 * Found rooms create to DB
 * <p>
 * Room[] check(API api1, API api2)
 * Chech how many the same rooms two different apis return
 */
public class Controller {
    private API apis[] = new API[3];

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] result = new Room[0];

        for (API api : apis) {
            Room[] foundRoom = api.findRooms(price, persons, city, hotel);
            if (foundRoom.length > 0) {
                result = Arrays.copyOf(result, result.length + foundRoom.length);
                System.arraycopy(foundRoom, 0, result, result.length - foundRoom.length, foundRoom.length);
            }
        }

        return result;

    }

    public Room[] check(API api1, API api2) {
        Room[] result = new Room[0];

        Room[] roomsAPI1 = api1.getRooms();
        Room[] roomsAPI2 = api2.getRooms();

        if (roomsAPI1.length > 0 && roomsAPI2.length > 0) {
            int i = 0;
            for (Room room1 : roomsAPI1) {
                for (Room room2 : roomsAPI2) {
                    if (room1.equals(room2)) {
                        result = Arrays.copyOf(result, i + 1);
                        result[i]=room1;
                        i++;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public API[] getApis() {
        return apis;
    }
}

package module5.task6;

import module5.task1_2.Room;
import module5.task3.API;
import module5.task4.BookingComAPI;
import module5.task4.GoogleAPI;
import module5.task4.TripAdvisorAPI;

import java.util.*;

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

    private Map<String,API> apis = new HashMap<>();

    public List<Room> requestRooms(int price, int persons, String city, String hotel) {

        List<Room> result = new LinkedList<>();

        for (API api : apis.values()) {
            result.addAll(api.findRooms(price, persons, city, hotel));
        }

        return result;

    }

    public List<Room> check(API api1, API api2) {
        List<Room> result = new LinkedList<>();

        List<Room> roomsAPI1 = api1.getRooms();
        List<Room> roomsAPI2 = api2.getRooms();

        if (roomsAPI1.size() > 0 && roomsAPI2.size() > 0) {
            for (Room room : roomsAPI1) {
                if (roomsAPI2.contains(room)) {
                    result.add(room);
                }
            }
        }
        return result;
    }

    public Controller() {
        apis.put("BookingCom",new BookingComAPI());
        apis.put("Google",new GoogleAPI());
        apis.put("TripAdvisor",new TripAdvisorAPI());
    }

    public Map<String,API> getApis() {
        return apis;
    }

    public API getApi(String name){
        return apis.get(name);
    }
}

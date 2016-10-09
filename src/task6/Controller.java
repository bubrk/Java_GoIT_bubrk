package task6;

import task1_2.Room;
import task3.API;
import task4.BookingComAPI;
import task4.GoogleAPI;
import task4.TripAdvisorAPI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public Set<Room> requestRooms(int price, int persons, String city, String hotel) {

        Set<Room> result = new HashSet<>();

        for (API api : apis.values()) {
            result.addAll(api.findRooms(price, persons, city, hotel));
        }

        return result;

    }

    public Set<Room> check(API api1, API api2) {
        Set<Room> result = new HashSet<>();

        Set<Room> roomsAPI1 = api1.getRooms();
        Set<Room> roomsAPI2 = api2.getRooms();

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

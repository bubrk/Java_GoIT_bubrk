package module5.task4;

import module5.task1_2.Room;
import module5.task3.API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ЗАДАНИЕ 4
 * Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation has global
 * variable Rooms[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class BookingComAPI implements API {
    private Set<Room> rooms;

    @Override
    public Set<Room> getRooms() {
        return rooms;
    }

    @Override
    public Set<Room> findRooms(int price, int persons, String city, String hotel) {
        Set<Room> result = new HashSet<>();

        //findRoom - room we are looking for. price,persons,hotel,city matter
        Room findRoom = new Room(0, price, persons, new Date(), hotel, city);

        for (Room room: rooms){
            if (room.equals(findRoom)){
                result.add(room);
            }
        }

        return result;
    }

    @Override
    public Room findRoomByID(int id) {
        for (Room room: rooms){
            if (room.getId()==id){
                return room;
            }
        }
        return null;
    }

    public BookingComAPI() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Room[] array=new Room[5];
        try {
            array[0] = new Room(1, 100, 1, formatter.parse("10-09-2016"), "Paradise", "London");
            array[1] = new Room(2, 100, 1, formatter.parse("11-09-2016"), "Paradise", "London");
            array[2] = new Room(3, 200, 1, formatter.parse("15-09-2016"), "Paradise", "London");
            array[3] = new Room(4, 300, 3, formatter.parse("16-09-2016"), "Metropolitan", "Paris");
            array[4] = new Room(5, 400, 3, formatter.parse("17-09-2016"), "Tourist", "Berlin");

        } catch (ParseException ex) {
            //let's hope this is not gonna happen
            System.out.println("Huston, we have a problem...");
        }
        this.rooms = new HashSet<>(Arrays.asList(array));
    }
}

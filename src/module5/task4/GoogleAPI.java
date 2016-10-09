package module5.task4;

import module5.task1_2.Room;
import module5.task3.API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ЗАДАНИЕ 4
 * Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation has global
 * variable Rooms[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class GoogleAPI implements API {
    private List<Room> rooms;

    @Override
    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new LinkedList<>();

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

    public GoogleAPI() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Room[] array=new Room[5];
        try {
            array[0] = new Room(101, 100, 1, formatter.parse("10-09-2016"), "Paradise", "London");
            array[1] = new Room(102, 200, 1, formatter.parse("12-09-2016"), "Big Ban", "London");
            array[2] = new Room(103, 400, 2, formatter.parse("12-09-2016"), "Big Ban", "London");
            array[3] = new Room(104, 700, 3, formatter.parse("16-09-2016"), "Last resort", "Paris");
            array[4] = new Room(105, 400, 3, formatter.parse("17-09-2016"), "Tourist", "Berlin");

        } catch (ParseException ex) {
            //let's hope this is not gonna happen
            System.out.println("Huston, we have a problem...");
        }
        this.rooms = new LinkedList<>(Arrays.asList(array));
    }
}

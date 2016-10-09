package task4;

import task1_2.Room;
import task3.API;

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
public class TripAdvisorAPI implements API {
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

    public TripAdvisorAPI() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Room[] array=new Room[5];
        try {
            array[0] = new Room(1001, 100, 1, formatter.parse("10-09-2016"), "Paradise", "London");
            array[1] = new Room(1002, 200, 1, formatter.parse("10-09-2016"), "Big Ban", "London");
            array[2] = new Room(1003, 600, 2, formatter.parse("11-09-2016"), "Last Resort", "Paris");
            array[3] = new Room(1004, 300, 3, formatter.parse("16-09-2016"), "Metropolitan", "Paris");
            array[4] = new Room(1005, 700, 3, formatter.parse("17-09-2016"), "Last resort", "Paris");
        } catch (ParseException ex) {
            //let's hope this is not gonna happen
            System.out.println("Huston, we have a problem...");
        }
        this.rooms = new HashSet<>(Arrays.asList(array));
    }
/*    private Room rooms[];

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[0];

        //findRoom - room we are looking for. price,persons,hotel,city matter
        Room findRoom = new Room(0, price, persons, new Date(), hotel, city);

        int i = 0;
        for (Room room : this.rooms) {

            if (room.equals(findRoom)) {
                result= Arrays.copyOf(result,i+1);
                result[i] = room;
                i++;
            }
        }
        return result;
    }

    public TripAdvisorAPI() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        rooms = new Room[5];

        try {
            rooms[0] = new Room(1001, 100, 1, formatter.parse("10-09-2016"), "Paradise", "London");
            rooms[1] = new Room(1002, 200, 1, formatter.parse("10-09-2016"), "Big Ban", "London");
            rooms[2] = new Room(1003, 600, 2, formatter.parse("11-09-2016"), "Last Resort", "Paris");
            rooms[3] = new Room(1004, 300, 3, formatter.parse("16-09-2016"), "Metropolitan", "Paris");
            rooms[4] = new Room(1005, 700, 3, formatter.parse("17-09-2016"), "Last resort", "Paris");

        } catch (ParseException ex) {
            //let's hope this is not gonna happen
            System.out.println("Huston, we have a problem...");
        }
    }*/
}

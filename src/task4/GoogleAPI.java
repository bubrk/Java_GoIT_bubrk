package task4;

import task1_2.Room;
import task3.API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * ЗАДАНИЕ 4
 * Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI. Every implementation has global
 * variable Rooms[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class GoogleAPI implements API {
    private Room rooms[];

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

    public GoogleAPI() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        rooms = new Room[5];

        try {
            rooms[0] = new Room(101, 100, 1, formatter.parse("10-09-2016"), "Paradise", "London");
            rooms[1] = new Room(102, 200, 1, formatter.parse("12-09-2016"), "Big Ban", "London");
            rooms[2] = new Room(103, 400, 2, formatter.parse("12-09-2016"), "Big Ban", "London");
            rooms[3] = new Room(104, 700, 3, formatter.parse("16-09-2016"), "Last resort", "Paris");
            rooms[4] = new Room(105, 400, 3, formatter.parse("17-09-2016"), "Tourist", "Berlin");

        } catch (ParseException ex) {
            //let's hope this is not gonna happen
            System.out.println("Huston, we have a problem...");
        }
    }
}

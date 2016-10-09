package task3;

import task1_2.Room;

import java.util.Set;

/**
 * ЗАДАНИЕ 3
 * Create API interface which contains one method
 * Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {
    Set<Room> findRooms(int price, int persons, String city, String hotel);
    Set<Room> getRooms();//added because it's necessary
    Room findRoomByID(int id);//added because it's necessary
}

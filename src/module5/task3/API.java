package module5.task3;

import module5.task1_2.Room;

import java.util.List;

/**
 * ЗАДАНИЕ 3
 * Create API interface which contains one method
 * Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {
    List<Room> findRooms(int price, int persons, String city, String hotel);
    List<Room> getRooms();//added because it's necessary
    Room findRoomByID(int id);//added because it's necessary
}

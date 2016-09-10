package task3;

import task1_2.Room;

/**
 * ЗАДАНИЕ 3
 * Create API interface which contains one method
 * Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();//added because it's necessary
}

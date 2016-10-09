package module5.task5;

import module5.task1_2.Room;

/**
 * ЗАДАНИЕ 5
 * Create DAO interface and its implementation. Methods print operation name and object which was used.
 * Room save(Room room)
 * boolean delete(Room room)
 * Room update(Room room)
 * Room findById(long id)
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}

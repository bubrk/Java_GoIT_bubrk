package task5;

import task1_2.Room;

/**
 * ЗАДАНИЕ 5
 * Create DAO interface and its implementation. Methods print operation name and object which was used.
 * Room save(Room room)
 * boolean delete(Room room)
 * Room update(Room room)
 * Room findById(long id)
 */

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Saving room - "+room.toString());
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Deleting room - "+room.toString());
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Updating room - "+room.toString());
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Finding room by id "+id);
        return null;
    }
}

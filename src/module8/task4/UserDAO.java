package module8.task4;

import module8.task3.AbstractDAOImpl;

import java.util.List;

/**
 * ЗАДАНИЕ 4
 * <p>
 * Create UserDAO that exdents AbstractDAOImpl and has the same methods
 * <p>
 * User class:
 * long id
 * String name
 * <p>
 * Еxample:
 * <p>
 * <p>
 * UserDAO extends .. {
 * User save(User user) {
 * save(user);
 * return user;
 * }
 * <p>
 * }
 */
public class UserDAO extends AbstractDAOImpl<User> {

    public UserDAO() {
        super();
    }

    @Override
    public void save(User user) {
        super.save(user);
    }

    @Override
    public void delete(User element) {
        super.delete(element);
    }

    @Override
    public void deleteAll(List<User> list) {
        super.deleteAll(list);
    }

    @Override
    public void saveAll(List<User> list) {
        super.saveAll(list);
    }

    @Override
    public List<User> getList() {
        return super.getList();
    }

    public void deleteById(long id) {
        User user= get(id);
        delete(user);
    }

    public User get(long id) {
        List<User> list = super.getList();
        return list.stream()
                .filter(e -> e.getId()==id)
                .findAny()
                .orElse(null);
    }
}

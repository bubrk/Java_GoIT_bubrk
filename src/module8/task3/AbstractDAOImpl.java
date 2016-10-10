package module8.task3;

import module8.task1.AbstractDAO;

import java.util.LinkedList;
import java.util.List;

/**
 * ЗАДАНИЕ 3
 * <p>
 * Make implementation AbstractDAOImpl
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    private List<T> base;

    public AbstractDAOImpl() {
        base = new LinkedList<T>();
    }

    @Override
    public void save(T element) {
        base.add(element);
    }

    @Override
    public void delete(T element) {
        base.remove(element);
    }

    @Override
    public void deleteAll(List<T> list) {
        base.removeAll(list);
    }

    @Override
    public void saveAll(List<T> list) {
        base.addAll(list);
    }

    @Override
    public List getList() {
        return base;
    }

}

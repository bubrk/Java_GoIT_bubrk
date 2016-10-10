package module8.task1;

import java.util.List;

/**
 * Create universal interface AbstractDAO (T) with following methods
 * <p>
 * List ---- out DB emulator
 * <p>
 * T save(T)
 * void delete(T)
 * void deleteAll(List T)
 * void saveAll(List T)
 * List T getList()
 */
public interface AbstractDAO<T> {
    void save(T element);

    void delete(T element);

    void deleteAll(List<T> list);

    void saveAll(List<T> list);

    List<T> getList();
}

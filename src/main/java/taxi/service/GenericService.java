package taxi.service;

import java.util.List;

public interface GenericService<T> {
    T create(T element);

    T get(Long id) throws Exception;

    List<T> getAll();

    T update(T element);

    boolean delete(Long id);
}

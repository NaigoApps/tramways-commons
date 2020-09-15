package it.tramways.core.model.persistable;

public interface TramwaysRepository<T> {

    T findByUuid(String uuid);

    void deleteByUuid(String uuid);
}

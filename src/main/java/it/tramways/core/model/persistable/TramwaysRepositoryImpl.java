package it.tramways.core.model.persistable;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class TramwaysRepositoryImpl<T extends BaseEntity> extends
    SimpleJpaRepository<T, Long> implements TramwaysRepository<T> {

    private final Class<T> entityClass;
    private final EntityManager entityManager;

    public TramwaysRepositoryImpl(Class<T> entityClass, EntityManager em) {
        super(entityClass, em);
        this.entityClass = entityClass;
        this.entityManager = em;
    }

    @Override
    public T findByUuid(String uuid) {
        try {
            CriteriaQuery<T> query = query(entityClass);
            Root<T> root = query.from(entityClass);
            query.where(cb().equal(root.get(BaseEntity_.uuid), uuid));
            return entityManager.createQuery(query).getSingleResult();
        } catch (Exception ex) {
            LoggerFactory.getLogger(getClass()).error("Error", ex);
        }
        return null;
    }

    @Override
    public void deleteByUuid(String uuid) {
        entityManager.remove(findByUuid(uuid));
    }

    protected CriteriaBuilder cb() {
        return entityManager.getCriteriaBuilder();
    }

    protected CriteriaQuery<T> query(){
        return entityManager.getCriteriaBuilder().createQuery(entityClass);
    }

    protected <E> CriteriaQuery<E> query(Class<E> queryClass){
        return entityManager.getCriteriaBuilder().createQuery(queryClass);
    }
}

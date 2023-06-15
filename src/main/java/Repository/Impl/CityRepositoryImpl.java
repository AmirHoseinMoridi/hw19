package Repository.Impl;

import Base.Repositoy.Impl.BaseRepositoryImpl;
import Entity.City;
import Repository.CityRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Optional;

public class CityRepositoryImpl
        extends BaseRepositoryImpl<City>
        implements CityRepository {


    public CityRepositoryImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<City> getEntityClass() {
        return City.class;
    }

    @Override
    public Optional<City> findByName(String name) {

        String hql = """
                select c from City c where c.name = :n
                """;
        TypedQuery<City> typedQuery = em.createQuery(hql, this.getEntityClass())
                .setParameter(City.NAME, name);

        return Optional.ofNullable(typedQuery.getSingleResult());
    }
}

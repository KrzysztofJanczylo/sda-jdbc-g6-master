package com.justpz.sda.hiernateg6.springdatajpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ToyRepository extends CrudRepository<Toy, Long> {

    List<Toy> findAllByName(String name);
    List<Toy> findAllByNameAndManufacturere (String name, String mantufacturere);

    @Query ("select c from Toy c where c.name = ?1 and c.mantufacturere = ?2")
    List<Toy> findBy(String name, String mantufacturere);

    @Query ("select c from Toy c where c.name = :nameValue and c.mantufacturere = :mantufacturereValue")
    List<Toy> findBy2(@Param("nameValue") String name,@Param("mantufacturereValue") String mantufacturere);

}

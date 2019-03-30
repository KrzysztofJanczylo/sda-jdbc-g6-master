package com.justpz.sda.hiernateg6.springdatajpa;

//import javax.persistience.Entity;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate productionDate;
    private String name;
    private String manufacturere;
    private int minAge;

    public Toy() {
    }

    public Toy(LocalDate productionDate, String name, String manufacturere, int minAge) {
        this.productionDate = productionDate;
        this.name = name;
        this.manufacturere = manufacturere;
        this.minAge = minAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return id == toy.id &&
                minAge == toy.minAge &&
                Objects.equals(productionDate, toy.productionDate) &&
                Objects.equals(name, toy.name) &&
                Objects.equals(manufacturere, toy.manufacturere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productionDate, name, manufacturere, minAge);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturere() {
        return manufacturere;
    }

    public void setManufacturere(String manufacturere) {
        this.manufacturere = manufacturere;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }
}

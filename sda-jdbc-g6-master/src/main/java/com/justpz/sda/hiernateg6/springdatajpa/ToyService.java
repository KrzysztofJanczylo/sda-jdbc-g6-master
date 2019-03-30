package com.justpz.sda.hiernateg6.springdatajpa;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ToyService {
    private final ToyRepository repository;

    public ToyService(ToyRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void saveTestData(){
        Toy toy = new Toy(LocalDate.now(),"samochodzik", "polonez", 18);
        repository.save(toy);
    }
    @Transactional
    public void saveTestData2(){
        Toy toy = new Toy();
        toy.setManufacturere("Volvo");
        toy.setMinAge(12);
        toy.setProductionDate(LocalDate.now());
        toy.setName("autko");
        repository.save(toy);
    }
    @Transactional
    public void sandTestData2(){
        Toy toy = new Toy();
        toy.setManufacturere("Volvo");
        toy.setMinAge(12);
        toy.setProductionDate(LocalDate.now());
        toy.setName("autko");
        repository.save(toy);
    }



    public void pritAll() {
        Iterable<Toy> all = repository.findAll();
        for (Toy toy : all) {
            System.out.println(toy);

        }
    }

    public void pritAll2() {
        Iterable<Toy> all = repository.findAllByName("autko");
        for (Toy toy : all) {
            System.out.println(toy);

        }
    }
}

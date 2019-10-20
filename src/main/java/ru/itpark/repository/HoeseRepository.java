package ru.itpark.repository;

import ru.itpark.model.House;

import java.util.Collection;
import java.util.LinkedList;

public class HoeseRepository {
    private final Collection<House> houses = new LinkedList<>();

    public  void save(House item){
        houses.add(item);
    }
}

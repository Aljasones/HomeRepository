package ru.itpark.repository;

import ru.itpark.model.House;

import java.util.Collection;
import java.util.LinkedList;

public class HoeseRepository {
    private final Collection<House> houses = new LinkedList<>();
    private long nextId=1;

    public  void save(House item){
        if (item.getId() == 0){
            item.setId(nextId++);
        }
        houses.add(item);
    }

    public Collection<House> getAll() {
        return houses;
    }
}

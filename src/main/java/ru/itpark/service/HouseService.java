package ru.itpark.service;

import ru.itpark.model.House;
import ru.itpark.repository.HoeseRepository;

public class HouseService {
    private final HoeseRepository repository;

    public HouseService(HoeseRepository repository) {
        this.repository = repository;
    }

    public void add(House item) {
        //todo: make some checks (price, anderground)
        if (item.getId() != 0) {
            throw new IllegalArgumentException("id must be zero!");
        }
        if (item.getPrice() <=0) {
            throw  new IllegalArgumentException("price must be greater");
        }
        repository.save(item);

    }
}

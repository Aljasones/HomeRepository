package ru.itpark.service;

import org.w3c.dom.ls.LSOutput;
import ru.itpark.comparatot.HouseByPriceAskComparator;
import ru.itpark.model.House;
import ru.itpark.repository.HoeseRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

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

    public List<House> getSortedBy (Comparator<House> comparator) {
    LinkedList<House> result = new LinkedList<>(repository.getAll());
//        Collections.sort(result, comparator);
        result.sort(comparator);
        return result;
    }

    public List<House> getSortedByPrice () {
    return  getSortedBy(new HouseByPriceAskComparator());
    }



}

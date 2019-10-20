package ru.itpark.comparatot;

import ru.itpark.model.House;

import java.util.Comparator;

public class HouseByPriceDescComparator implements Comparator<House> {


    @Override
    public int compare(House o1, House o2) {
        return -(o1.getPrice() - o2.getPrice());
    }
}

package ru.itpark;

import ru.itpark.comparatot.HouseByPriceDescComparator;
import ru.itpark.model.House;
import ru.itpark.repository.HoeseRepository;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
    final HouseService service = new HouseService(new HoeseRepository());
    service.add(new House(0, "flat", 4, "Metro"));
        service.add(new House(0, "flat", 5, "Metro"));
        service.add(new House(0, "flat", 6, "Metro"));
        service.add(new House(0, "flat", 7, "Metro"));
        service.add(new House(0, "flat", 8, "Metro"));
        service.add(new House(0, "flat", 9, "Metro"));
        service.add(new House(0, "flat", 2, "Metro"));

        System.out.println(service.getSortedByPrice());

        System.out.println(service.getSortedBy(new HouseByPriceDescComparator()));
    }
}

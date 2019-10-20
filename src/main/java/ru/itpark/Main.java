package ru.itpark;

import ru.itpark.comparatot.HouseByPriceDescComparator;
import ru.itpark.model.House;
import ru.itpark.repository.HoeseRepository;
import ru.itpark.service.HouseService;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
    final HouseService service = new HouseService(new HoeseRepository());
    service.add(new House(0, "flat", 4, "Metro"));
        service.add(new House(0, "flat", 5, "Metro"));
        service.add(new House(0, "flat1", 6, "Metro"));
        service.add(new House(0, "flat2", 7, "Metro"));
        service.add(new House(0, "flat3", 8, "Metro"));
        service.add(new House(0, "flat4", 9, "Metro"));
        service.add(new House(0, "flat5", 2, "Metro"));

        System.out.println(service.getSortedByPrice());

        System.out.println(service.getSortedBy(new HouseByPriceDescComparator()));

        System.out.println(service.getSortedBy(new Comparator<House>() {
            @Override
            public int compare(House o1, House o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        }));

        System.out.println(service.getSortedBy((House o1, House o2) -> {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }));

        System.out.println(service.getSortedBy((o1, o2) -> {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }));

        System.out.println(service.getSortedBy(
                (o1, o2) ->
             o1.getName().compareToIgnoreCase(o2.getName())));  //лямбда

    }
}

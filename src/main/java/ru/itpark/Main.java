package ru.itpark;

import ru.itpark.model.House;
import ru.itpark.repository.HoeseRepository;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
    final HouseService service = new HouseService(new HoeseRepository());
    service.add(new House(
            0,
            "flat",
            4,
            "Metro"
            ));
    }
}

package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class House implements Comparable<House> {
    private long id;
    private String name;
    private int price;
    private String underground;

    @Override
    public int compareTo(House o) {
        return price - o.price;
    }


}

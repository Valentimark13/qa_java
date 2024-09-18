package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {

    public Alex() throws Exception {
        super(new Feline(), "Самец");
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return Arrays.asList("Марти", "Глория", "Мелман");
    }

    // Возвращает место проживания Алекса
    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}

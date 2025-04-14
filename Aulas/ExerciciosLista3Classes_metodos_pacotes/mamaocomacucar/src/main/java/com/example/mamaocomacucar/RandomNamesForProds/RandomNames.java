package com.example.mamaocomacucar.RandomNamesForProds;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNames {

    private static final String[] NamesForProds = {
        "Televisao", "Microondas", "Geladeira", "Airfryer", "CookingTop", "Liquidificador", "MultiProcessador", "Batedeira", "Lavadeira", "Forno"
    };

    public static String getRandomName() {
        int randomIndex = ThreadLocalRandom.current().nextInt(NamesForProds.length);
        return NamesForProds[randomIndex];
    }


    public static double getRandomPrice() {
        return 400 + ThreadLocalRandom.current().nextDouble(0, 1800);
    }
}

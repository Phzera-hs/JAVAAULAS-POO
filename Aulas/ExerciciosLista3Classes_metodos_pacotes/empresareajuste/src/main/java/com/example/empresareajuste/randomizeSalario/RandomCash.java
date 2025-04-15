package com.example.empresareajuste.randomizeSalario;

import java.util.concurrent.ThreadLocalRandom;

public class RandomCash {

    public static double getRandomSalario() {
        return 1500 +  ThreadLocalRandom.current().nextDouble(45000); 
    }
}

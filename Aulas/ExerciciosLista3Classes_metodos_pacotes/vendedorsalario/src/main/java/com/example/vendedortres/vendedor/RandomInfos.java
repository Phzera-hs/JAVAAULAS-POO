package com.example.vendedortres.vendedor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomInfos {
    private static final String[] firstNames = {
        "Pedro", "Maria", "João", "Ana", "Carlos", "Luiza", "Felipe", "Bruna", "Gabriel", "Larissa"
    };

    private static final String[] lastNames = {
        "Silva", "Souza", "Oliveira", "Pereira", "Costa", "Almeida", "Lima", "Gomes", "Ribeiro", "Martins"
    };

    private static final Random random = new Random();

    public static String getRandomFullName() {
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];
        return firstName + " " + lastName;
    }

    public static String getRandomCPF() {
        int part1 = 100 + random.nextInt(900);
        int part2 = 100 + random.nextInt(900);
        int part3 = 100 + random.nextInt(900);
        int part4 = 10 + random.nextInt(90);
        return String.format("%03d.%03d.%03d-%02d", part1, part2, part3, part4);
    }

    public static String getRandomLogin(String nome) {
        return nome.toLowerCase().replaceAll(" ", ".") + random.nextInt(100);
    }

    public static String getRandomSenha() {
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String digits = "0123456789";
    String symbols = "@#$%^&+=!";

    Random rand = new Random();

    // Garante 1 de cada tipo
    StringBuilder senha = new StringBuilder();
    senha.append(upper.charAt(rand.nextInt(upper.length())));
    senha.append(lower.charAt(rand.nextInt(lower.length())));
    senha.append(digits.charAt(rand.nextInt(digits.length())));
    senha.append(symbols.charAt(rand.nextInt(symbols.length())));

    // Preenche o restante até 8 ou mais caracteres
    String allChars = upper + lower + digits + symbols;
    while (senha.length() < 10) { // você pode ajustar para mais se quiser
        senha.append(allChars.charAt(rand.nextInt(allChars.length())));
    }

    // Embaralha os caracteres para evitar padrão fixo (ex: sempre 1 letra maiúscula no início)
    List<Character> chars = new ArrayList<>();
    for (char c : senha.toString().toCharArray()) {
        chars.add(c);
    }
    Collections.shuffle(chars);

    StringBuilder finalSenha = new StringBuilder();
    for (char c : chars) {
        finalSenha.append(c);
    }

    return finalSenha.toString();
}


    public static double getRandomSalario() {
        return 1500 + random.nextInt(3501); // entre 1500 e 5000
    }

    public static Integer getRandomVendas(){
        return 2 + random.nextInt(30);
    }

}

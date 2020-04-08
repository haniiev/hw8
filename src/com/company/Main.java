package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("surname:");
        String surname = reader.readLine();
        System.out.print("name:");
        String name = reader.readLine();
        System.out.print("patronymic:");
        String patronymic = reader.readLine();

        String format1 = surname +" "+ "%.1s"+"%.1s";
        System.out.println(String.format(format1,name,patronymic));

        System.out.println(name);

        StringBuilder fa = new StringBuilder();
        fa.append(name);
        fa.append(", ");
        fa.append(patronymic);
        fa.append(" ");
        fa.append(surname);
        System.out.println(fa);


    }
}

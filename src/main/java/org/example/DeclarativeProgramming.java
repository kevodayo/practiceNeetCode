package org.example;

import java.util.ArrayList;
import java.util.List;

public class DeclarativeProgramming {

    public static void main(){
        List<String> gender = List.of("Kevine is a boy", "Stacy", "Ronny");

        gender.stream().filter(test-> gender.contains("kevine")).forEach(System.out::println);

    }
}

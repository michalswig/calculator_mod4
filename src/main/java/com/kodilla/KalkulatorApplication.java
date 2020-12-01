package com.kodilla;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        //SpringApplication.run(KalkulatorApplication.class, args);
        int number1 = Calculator.add(4,7);
        System.out.println(number1);
        int number2 = Calculator.sbtrct(34, 7);
        System.out.println(number2);


    }

}

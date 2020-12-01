package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Quadrangle> quadrangles = new ArrayList<>();
        quadrangles.add(new Quadrangle(1, 6, 6, 6, 6, 2, 1, 2));
        quadrangles.add(new Quadrangle(1, 6, 6, 6, 6, 2, 1, 2));
        quadrangles.add(new Quadrangle(1, 6, 6, 6, 6, 2, 1, 2));
        quadrangles.removeIf(quadrangle -> !quadrangle.isExists());
        double summ = 0;
        for (int i = 0; i < quadrangles.size(); i++) {
            summ += quadrangles.get(i).findArea();
        }
        double middleArea = summ / quadrangles.size();

        System.out.println(middleArea);

        ArrayList<Parallelogram> parallelograms = new ArrayList<>();
        parallelograms.add(new Parallelogram(1, 6, 6, 6, 6, 2, 1, 2));
        parallelograms.add(new Parallelogram(2, 8, 8, 8, 8, 4, 3, 4));
        parallelograms.removeIf(parallelogram -> !parallelogram.isExists());
        //int minIndex = parallelograms.indexOf(Collection.min(parallelograms));
        Parallelogram parallelogram = Collections.min(parallelograms, Comparator.comparing(s -> s.findArea()));
        Parallelogram parallelogram1 = Collections.max(parallelograms, Comparator.comparing(s -> s.findArea()));
        System.out.println("min "  + parallelogram.findArea());
        System.out.println("max " + parallelogram1.findArea());
    }
}

package org.example.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее из этого списка.
 */

public class HomeWorkFour {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerArrayList = createList(random);

        System.out.println(integerArrayList);
        System.out.println("min = " + Collections.min(integerArrayList));
        System.out.println("max = " + Collections.max(integerArrayList));
        System.out.println("averageValue = " + averageValue(integerArrayList));
    }

    /**
     * @param random
     * @return ArrayList
     * @apiNote Задает целочисленный список ArrayList
     */
    private static ArrayList<Integer> createList(Random random) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            resultList.add(random.nextInt(1000));
        }
        return resultList;
    }

    /**
     * @param arrayList
     * @return double
     * @apiNote среднее из списка
     */
    private static double averageValue(List<Integer> arrayList) {
        int sum = 0;
        for (int value : arrayList) {
            sum = sum + value;
        }
        return sum / arrayList.size();
    }
}

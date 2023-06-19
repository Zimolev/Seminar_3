package org.example.SeminarWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Даны сведения об экспортируемых товарах: указывается наименование товара, страна,
 * экспортирующая товар, и объем поставляемой партии в штуках. Найти страны,
 * которые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(10);
        List<Item> itemList = createList(n, random);
        System.out.print("Введите имя товара: ");
        String poundName = scanner.nextLine();
        Integer sumVolume = 0;
        List<String>countryList = new ArrayList<>();
        zad1(sumVolume, countryList, itemList,poundName);

    }

    private static ArrayList<Item> createList(int n, Random random) {
        ArrayList<Item> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Item item1 = new Item("qwe1", "asd1", random.nextInt(100));
            Item item2 = new Item("qwe2", "asd2", random.nextInt(100));
            Item item3 = new Item("qwe3", "asd3", random.nextInt(100));
            Item item4 = new Item("qwe1", "asd4", random.nextInt(100));

            resultList.add(item1);
            resultList.add(item2);
            resultList.add(item3);
            resultList.add(item4);

        }
        return resultList;
    }
private static void zad1(Integer sumValue, List<String> countryList,List<Item> itemList, String poundName){
    for (int i = 0; i < itemList.size(); i++) {
        if (itemList.get(i).getName().equals(poundName)){
            sumValue += itemList.get(i).getVolume();
            countryList.add(itemList.get(i).getCountry());
        }
    }
    System.out.println("countryList = " + countryList);
    System.out.println("sumVolume = " + sumValue);
}
}

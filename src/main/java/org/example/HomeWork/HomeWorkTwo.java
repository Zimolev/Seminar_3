package org.example.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class HomeWorkTwo {
    public static void main(String[] args) {
        List<ProductSecondTask> productSecondTasks = createList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара который хотите найтиЖ ");
        int sort = scanner.nextInt();
        searchNameProductMinPrice(productSecondTasks, sort);

    }

    /**
     * @return ArrayList
     * @apiNote создает массив записей, страны-производителя, наименование товара,
     * веса, цены, сорта
     */
    public static ArrayList<ProductSecondTask> createList() {
        ArrayList<ProductSecondTask> directoryList = new ArrayList<>();
        directoryList.add(new ProductSecondTask
                ("Cars", "Japan", 2000, 40000, 1));
        directoryList.add(new ProductSecondTask
                ("Cars", "Germany", 2000, 70000, 1));
        directoryList.add(new ProductSecondTask
                ("Cars", "Korea", 2000, 40000, 1));
        directoryList.add(new ProductSecondTask
                ("Car", "China", 2000, 30000, 2));
        directoryList.add(new ProductSecondTask
                ("Car", "Russia", 2000, 100000, 4));
        directoryList.add(new ProductSecondTask
                ("Car", "Russia", 2000, 100000, 1));
        directoryList.add(new ProductSecondTask
                ("Car", "Japan", 2000, 10000, 3));
        directoryList.add(new ProductSecondTask
                ("Car", "Japan", 2000, 1000, 4));
        directoryList.add(new ProductSecondTask
                ("Car", "China", 2000, 1000, 4));

        return directoryList;
    }

    /**
     * @param productSecondTask
     * @param sort
     * @apiNote Получить наименования товаров заданного сорта с наименьшей ценой
     */
    public static void searchNameProductMinPrice(List<ProductSecondTask> productSecondTask, int sort) {
        List<Integer> productMinPrice = new ArrayList();

        for (ProductSecondTask product :
                productSecondTask) {
            if (product.getSort() == sort) {
                productMinPrice.add(product.getPrice());
            }
        }
        int min = Collections.min(productMinPrice);
        for (int i = 0; i < productSecondTask.size(); i++) {
            if (productSecondTask.get(i).getPrice() == min)
                System.out.println
                        (productSecondTask.get(i).getName() + " " +
                                productSecondTask.get(i).getCountry() + " " +
                                productSecondTask.get(i).getPrice());
        }

    }
}


